package cc.eslink.shardingjdbcdemo.dao;

import cc.eslink.shardingjdbcdemo.domain.entity.BizUser;
import cc.eslink.common.base.BaseDao;
import org.apache.ibatis.annotations.Param;


/**
 * 
 * BizUserDao数据库操作接口类
 * 
 * @author zyk
 */
public interface BizUserDao extends BaseDao<BizUser> {

    BizUser selectById(String userId);

    BizUser selectByTenantAndId(@Param("tenantId") String tenantId, @Param("userId") String userId);

    BizUser selectDetailByTenantAndId(@Param("tenantId") String tenantId, @Param("userId") String userId);
}