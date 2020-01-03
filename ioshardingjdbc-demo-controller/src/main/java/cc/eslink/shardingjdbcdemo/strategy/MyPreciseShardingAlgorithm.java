package cc.eslink.shardingjdbcdemo.strategy;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;
import java.util.Collections;

/**
 *@ClassName MyPreciseShardingAlgorithm
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2020/1/2 17:04
 *@Version 1.0
 **/
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        System.out.println("availableTargetNames:" + availableTargetNames);
        System.out.println("shardingValue:" + shardingValue);
        return availableTargetNames.iterator().next();
    }
}
