package cc.eslink.shardingjdbcdemo.dao;

import cc.eslink.shardingjdbcdemo.domain.entity.BizAddress;
import cc.eslink.common.base.BaseDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 
 * BizAddressDao数据库操作接口类
 * 
 * @author zyk
 */
public interface BizAddressDao extends BaseDao<BizAddress> {

    BizAddress getByTenantAndId(@Param("tenantId") String tenantId, @Param("addressId") String addressId);

    BizAddress getByTenantAndId2(@Param("tenantId") String tenantId, @Param("addressId") String addressId);

    BizAddress getByTenantAndId3(@Param("tenantId") String tenantId, @Param("addressId") String addressId);

    BizAddress getByTenantAndId4(@Param("tenantIds") List<String> tenantIds, @Param("addressId") String addressId);

    BizAddress getByTenantAndId5(@Param("tenantIds") List<String> tenantIds, @Param("addressId") String addressId);

    List<BizAddress> queryByAreaId(@Param("tenantId") String tenantId, @Param("areasId") String areasId);

    List<Map<String, Object>> queryList(String tenantId);

    List<Map<String, Object>> queryList2(List<String> idList);

    List<Map<String, Object>> queryList3(String tenantId);

    List<Map<String, Object>> queryList4(String tenantId);

    List<Map<String, Object>> queryArea(String areasId);
}