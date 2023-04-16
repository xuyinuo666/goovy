package com.go.oauth2.service;


import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 获取用户登录信息
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@FeignClient("go-admin")
public interface UmsAdminService {

}
