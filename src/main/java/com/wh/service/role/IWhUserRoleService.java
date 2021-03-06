package com.wh.service.role;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.entity.role.WhUserRole;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author 陈恩惠
 * @since 2019-06-11
 */
public interface IWhUserRoleService extends IService<WhUserRole> {


    /**
     * 通过用户ID 查询 角色IDS
     *
     * @param uid
     * @return
     */
    WhUserRole serviceSelRids(Long uid);

}
