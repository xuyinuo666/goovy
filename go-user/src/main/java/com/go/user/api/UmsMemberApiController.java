package com.go.user.api;


import cn.hutool.core.bean.BeanUtil;
import com.go.user.bo.member.UmsMemberBo;
import com.go.user.service.IUmsMemberService;
import common.domain.UserDto;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@RestController
@RequestMapping("/sso")
public class UmsMemberApiController {
  @Resource
  private IUmsMemberService umsMemberService;
  @GetMapping("login")
  public UserDto login(@RequestParam String phone){
    UmsMemberBo member = umsMemberService.getMemberByPhone(phone);
    return BeanUtil.copyProperties(member,UserDto.class);
  }

}
