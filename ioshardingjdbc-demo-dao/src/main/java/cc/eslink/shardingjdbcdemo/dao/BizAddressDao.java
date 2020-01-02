package cc.eslink.shardingjdbcdemo.dao;

import cc.eslink.shardingjdbcdemo.domain.entity.BizAddress;
import cc.eslink.common.base.BaseDao;
import org.apache.ibatis.annotations.Param;


/**
 * 
 * BizAddressDao数据库操作接口类
 * 
 * @author zyk
 */
public interface BizAddressDao extends BaseDao<BizAddress> {

    BizAddress getByTenantAndId(@Param("tenantId") String tenantId, @Param("addressId") String addressId);
}