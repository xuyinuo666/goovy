package com.go.oauth2.service;

import common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 获取用户信息
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@FeignClient("go-user")
public interface UmsMemberService  {
  @GetMapping("/sso/login")
  UserDto login(@RequestParam String phone);

}
