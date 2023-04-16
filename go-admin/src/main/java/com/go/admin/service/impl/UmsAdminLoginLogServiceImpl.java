package com.go.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.go.admin.entity.UmsAdminLoginLog;
import com.go.admin.mapper.UmsAdminLoginLogMapper;
import com.go.admin.service.IUmsAdminLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@Service
public class UmsAdminLoginLogServiceImpl extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> implements
    IUmsAdminLoginLogService {

}
