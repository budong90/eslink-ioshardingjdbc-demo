package cc.eslink.shardingjdbcdemo.strategy;

import cc.eslink.util.CollectionUtil;
import io.shardingsphere.api.algorithm.sharding.ListShardingValue;
import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.hint.HintShardingAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *@ClassName MyHintShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2020/1/3 9:29
 *@Version 1.0
 **/
public class MyHintShardingAlgorithm implements HintShardingAlgorithm {

//    private static String actualDataNodes;

    private static List<String> actualDataNodes = new ArrayList<>();

    @Value("${actual-data-nodes}")
    public void setActualDataNodes(String actualDataNodes) {
        // actual-data-nodes=\${['','_1p01']}
        Matcher m = Pattern.compile("\\[(.*)\\]\\}$").matcher(actualDataNodes);
        if (m.find()) {
            MyHintShardingAlgorithm.actualDataNodes = Stream.of(m.group(1).split(",")).parallel()
                    .map(s -> s.substring(Math.max(s.indexOf("_") + 1, 1), s.length() - 1).toLowerCase())
                    .filter(s -> StringUtils.isNotBlank(s))
                    .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
        System.out.println("分片入参-----------------------------actualDataNodes=" + MyHintShardingAlgorithm.actualDataNodes);
        if (CollectionUtil.isEmpty(MyHintShardingAlgorithm.actualDataNodes)) {
            System.out.println("真实节点为空");
        }
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, ShardingValue shardingValue) {
        System.out.println("分片入参-----------------------------availableTargetNames=" + availableTargetNames);
        System.out.println("分片入参-----------------------------shardingValue=" + shardingValue);
        Collection<String> shardingResults = new ArrayList<>();
        // 逻辑表名，即不加任何后缀的表名
        String logicTable = availableTargetNames.iterator().next();
        Collection<String> values = ((ListShardingValue<String>) shardingValue).getValues();
        if (logicTable.equalsIgnoreCase(shardingValue.getLogicTableName()) && !values.isEmpty()) {
            String tenantId = values.iterator().next().toLowerCase();
            Iterator<String> it = MyHintShardingAlgorithm.actualDataNodes.iterator();
            while (it.hasNext()) {
                String prefix = it.next();
                if (StringUtils.isNotBlank(prefix) && tenantId.startsWith(prefix)) {
                    shardingResults.add(logicTable + "_" + tenantId);
                    break;
                }
            }
            if (shardingResults.isEmpty()) {
                shardingResults.add(logicTable);
            }
        }
        System.out.println(String.format("分片结果-----------------------------shardingResults=%s-----------------------------", shardingResults));
        return shardingResults;
    }
}
