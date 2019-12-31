package cc.eslink.shardingjdbcdemo.service;

import cc.eslink.shardingjdbcdemo.dao.BizUserDao;
import cc.eslink.shardingjdbcdemo.domain.entity.BizUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *@ClassName BizUserService
 *@Description
 *@Author zeng.yakun (0178)
 *@Date 2019/12/30 15:55
 *@Version 1.0
 **/
@Service("bizUserService")
public class BizUserService {

    @Resource
    private BizUserDao bizUserDao;

    public int insert(BizUser bizUser) {
        return bizUserDao.insert(bizUser);
    }

    public int insertBatch(List<BizUser> list) {
        return bizUserDao.insertList(list);
    }

    public BizUser getById(String userId) {
        return bizUserDao.selectById(userId);
    }

    public BizUser getByTenantAndId(String tenantId, String userId) {
        return bizUserDao.selectByTenantAndId(tenantId, userId);
    }

    public BizUser getDetailByTenantAndId(String tenantId, String userId) {
        return bizUserDao.selectDetailByTenantAndId(tenantId, userId);
    }
}
