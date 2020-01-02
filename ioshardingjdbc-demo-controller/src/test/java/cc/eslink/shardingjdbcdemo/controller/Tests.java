package cc.eslink.shardingjdbcdemo.controller;

import cc.eslink.shardingjdbcdemo.dao.BizAddressDao;
import cc.eslink.shardingjdbcdemo.domain.entity.BizAddress;
import cc.eslink.shardingjdbcdemo.domain.entity.BizUser;
import cc.eslink.shardingjdbcdemo.service.BizUserService;
import cc.eslink.utilv1.IDUtil;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;

import javax.annotation.Resource;
import java.time.LocalTime;
import java.util.*;

/**
 *@ClassName TestInsert
 *@Description 插入测试
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 15:06
 *@Version 1.0
 **/
public class Tests extends BaseTest {

    private String[] tenantIds = {"1P01", "0185", "0302"};
    int max = tenantIds.length, min = 0;

    @Resource
    BizUserService bizUserService;

    @Resource
    BizAddressDao bizAddressDao;

    /**
     * @Description 单条保存，可以正常保存
     * @Author zeng.yakun (0178)
     * @Date 2019/12/30 18:21
     * @param
     * @return
     **/
    @org.junit.Test
    public void test() {
        for (int i = 1; i <= 1; i++) {
            BizUser bizUser = new BizUser();
            String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
            bizUser.setTenantId(tenantId);
            bizUser.setUserId(IDUtil.getUniqueId());
            String str = "00000" + i;
            str = str.substring((i + "").length());
            bizUser.setUserNo(str);
            bizUser.setUserName("test" + str);
            bizUserService.insert(bizUser);
        }
    }

    /**
     * @Description 批量保存，可以正常保存
     * @Author zeng.yakun (0178)
     * @Date 2019/12/30 18:20
     * @param
     * @return
     **/
    @org.junit.Test
    public void test2() {
        List<BizUser> list = new ArrayList<>();
        int max = 3, min = 0;
        for (int i = 1; i <= 1000; i++) {
            BizUser bizUser = new BizUser();
            String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
            bizUser.setTenantId(tenantId);
            bizUser.setUserId(IDUtil.getUniqueId());
            String str = "00000" + i;
            str = str.substring((i + "").length());
            bizUser.setUserNo(str);
            bizUser.setUserName("test" + str);
            list.add(bizUser);
        }
        bizUserService.insertBatch(list);
    }

    /**
     * @Description 根据主键查询，查询不到，不会进入doSharding方法
     * @Author zeng.yakun (0178)
     * @Date 2019/12/30 18:20
     * @param
     * @return
     **/
    @org.junit.Test
    public void test3() {
        Map<String, String[]> map = new HashedMap();
        map.put("0302", new String[]{"2019123018011526695897849696", "2019123018011526933489825816", "2019123018011527012491823063"});
        map.put("0185", new String[]{"2019123018011526939732111602"});
        map.put("1P01", new String[]{"2019123018011526920512127814", "2019123018011526930653263595"});
        String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
        tenantId = "1P01";
        String[] ids = map.get(tenantId);
        String userId = ids[new Random().nextInt(ids.length)];
        BizUser bizUser = bizUserService.getById(userId);
        System.out.println(String.format("-----------------------------tenantId=%s,userId=%s,bizUser=%s-----------------------------", tenantId, userId, bizUser));
    }

    /**
     * @Description 根据分片字段和主键查询
     * @Author zeng.yakun (0178)
     * @Date 2019/12/30 18:23
     * @param
     * @return
     **/
    @org.junit.Test
    public void test4() {
        Map<String, String[]> map = new HashedMap();
        map.put("0302", new String[]{"2019123018011526695897849696", "2019123018011526933489825816", "2019123018011527012491823063"});
        map.put("0185", new String[]{"2019123018011526939732111602"});
        map.put("1P01", new String[]{"2019123018011526920512127814", "2019123018011526930653263595"});
        String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
        tenantId = "1P01";
        String[] ids = map.get(tenantId);
        String userId = ids[new Random().nextInt(ids.length)];
        BizUser bizUser = bizUserService.getByTenantAndId(tenantId, userId);
        System.out.println(String.format("-----------------------------tenantId=%s,userId=%s,bizUser=%s-----------------------------", tenantId, userId, bizUser));
    }

    /**
     * @Description 关联查询，只有1个表分片
     * @Author zeng.yakun (0178)
     * @Date 2019/12/30 19:12
     * @param
     * @return
     **/
    @org.junit.Test
    public void test5() {
        Map<String, String> map = new HashedMap();
        map.put("0302", "2019123018011526695897849696");
        map.put("0185", "2019123018011526939732111602");
        map.put("1P01", "2019123018011526920512127814");
        String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
        tenantId = "1P01";
        String userId = map.get(tenantId);
        BizUser bizUser = bizUserService.getDetailByTenantAndId(tenantId, userId);
        System.out.println(String.format("测试结果-----------------------------tenantId=%s,userId=%s,bizUser=%s-----------------------------", tenantId, userId, bizUser));
    }

    @Test
    public void test6() {
        Map<String, String> map = new HashedMap();
        map.put("0302", "2019123018011526695897849696");
        map.put("0185", "2019123018011526939732111602");
        map.put("1P01", "2019123018011526920512127814");
//        String tenantId = tenantIds[(int) (Math.random() * (max - min) + min)];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String tenantId = entry.getKey();
            int count = (int) (Math.random() * 3 + 1);
            for (int i = 1; i <= count; i++) {
                BizAddress bizAddress = new BizAddress();
                bizAddress.setTenantId(tenantId);
                bizAddress.setUserId(map.get(tenantId));
                bizAddress.setAddressId(IDUtil.getUniqueId());
                bizAddress.setAddressDesc(LocalTime.now().toString() + "_" + i);
                bizAddress.setAreasId(LocalTime.now().getMinute() + "_" + i);
                bizAddress.setHousingEstateId(LocalTime.now().getSecond() + "_" + i);
                bizAddressDao.insert(bizAddress);
            }
        }
    }

    @org.junit.Test
    public void test7() {
        int i = 1;
        List<BizUser> list = new ArrayList<>();
        for (String tenantId : tenantIds) {
            BizUser bizUser = new BizUser();
            bizUser.setTenantId(tenantId);
            bizUser.setUserId(IDUtil.getUniqueId());
            String str = "10000" + i;
            str = str.substring((i + "").length());
            bizUser.setUserNo(str);
            bizUser.setUserName("test" + str);
            i++;
            list.add(bizUser);
        }
        bizUserService.insertBatch(list);
    }

    @Test
    public void test8() {
        BizAddress bizAddress = bizAddressDao.getByTenantAndId("1P01", "2019123018011526695897849696");
        System.out.println(bizAddress);
    }
}
