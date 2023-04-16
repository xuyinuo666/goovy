package com.go.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.go.admin.entity.UmsAdmin;
import com.go.admin.mapper.UmsAdminMapper;
import com.go.admin.service.IUmsAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements
    IUmsAdminService {

}
