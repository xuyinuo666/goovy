package com.go.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.go.admin.entity.UmsAdminPermissionRelation;
import com.go.admin.mapper.UmsAdminPermissionRelationMapper;
import com.go.admin.service.IUmsAdminPermissionRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements
    IUmsAdminPermissionRelationService {

}
