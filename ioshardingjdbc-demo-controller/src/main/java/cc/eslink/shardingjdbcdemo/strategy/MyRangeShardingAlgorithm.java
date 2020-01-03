package cc.eslink.shardingjdbcdemo.strategy;

import io.shardingsphere.api.algorithm.sharding.RangeShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.RangeShardingAlgorithm;

import java.util.Collection;
import java.util.Collections;

/**
 *@ClassName MyRangeShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2020/1/2 16:45
 *@Version 1.0
 **/
public class MyRangeShardingAlgorithm implements RangeShardingAlgorithm<String> {
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<String> shardingValue) {
        System.out.println("availableTargetNames:" + availableTargetNames);
        System.out.println("shardingValue:" + shardingValue);
        return Collections.singleton(availableTargetNames.iterator().next());
    }
}
