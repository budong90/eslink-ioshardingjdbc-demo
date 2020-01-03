package cc.eslink.shardingjdbcdemo.strategy;

import io.shardingsphere.api.algorithm.sharding.ListShardingValue;
import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.hint.HintShardingAlgorithm;

import java.util.ArrayList;
import java.util.Collection;

/**
 *@ClassName MyHintShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2020/1/3 9:29
 *@Version 1.0
 **/
public class MyHintShardingAlgorithm implements HintShardingAlgorithm {

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
            switch (tenantId) {
                case "0185":case "0703":case "1p01":
                    shardingResults.add(logicTable + "_" + tenantId);
                    break;
                default:
                    if (tenantId.startsWith("0a")) {
                        shardingResults.add(logicTable + "_0a");
                        break;
                    }
                    shardingResults.add(logicTable);
                    break;
            }
        }
        System.out.println(String.format("分片结果-----------------------------shardingResults=%s-----------------------------", shardingResults));
        return shardingResults;
    }
}
