package cc.eslink.shardingjdbcdemo.strategy;

import io.shardingsphere.api.algorithm.sharding.ListShardingValue;
import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *@ClassName MyComplexKeysShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 16:57
 *@Version 1.0
 **/
public class MyComplexKeysShardingAlgorithm implements ComplexKeysShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, Collection<ShardingValue> shardingValues) {
        List<String> shardingResults = new ArrayList<>();
        String tableName = availableTargetNames.iterator().next();
        for (ShardingValue shardingValue : shardingValues) {
            ListShardingValue<String> listShardingValue = (ListShardingValue<String>) shardingValue;
            if ("tenant_id".equals(listShardingValue.getColumnName())) {
                String tenantId = listShardingValue.getValues().iterator().next();
                if ("1P01".equals(tenantId)) {
                    shardingResults.add(tableName + "_" + tenantId.toLowerCase());
                } else {
                    shardingResults.add(tableName);
                }
            }
        }
        System.out.println("availableTargetNames=" + availableTargetNames);
        System.out.println("shardingValues=" + shardingValues);
        System.out.println(String.format("分片结果-----------------------------shardingResults=%s-----------------------------", shardingResults));
        return shardingResults;
    }
}
