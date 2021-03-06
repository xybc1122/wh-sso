package com.wh.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wh.entity.role.WhUserRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author 陈恩惠
 * @since 2019-06-11
 */
public interface WhUserRoleMapper extends BaseMapper<WhUserRole> {

    /**
     * 通过用户ID 查询 角色IDS
     *
     * @param uid
     * @return
     */
    WhUserRole selRids(@Param("uid") Long uid);
}
