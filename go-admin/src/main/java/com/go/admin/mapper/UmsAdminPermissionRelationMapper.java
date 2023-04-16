package com.go.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.go.admin.entity.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) Mapper 接口
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@Mapper
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {

}
