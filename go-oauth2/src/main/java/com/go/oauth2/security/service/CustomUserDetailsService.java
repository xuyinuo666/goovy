package com.go.oauth2.security.service;

import cn.hutool.core.util.StrUtil;
import com.go.oauth2.dto.SecurityUser;
import com.go.oauth2.service.UmsMemberService;
import common.domain.UserDto;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 查询登陆用户信息
 *
 * @author LiuYongTao
 * @date 2018/11/20 15:19
 */
@Slf4j
@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Resource
    private UmsMemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        log.info("查询用户：{} 的信息...", phone);
        Set<GrantedAuthority> authorities = new HashSet<>();
        if (StrUtil.isEmpty(phone)) {
            throw new UsernameNotFoundException("phone 不能为空！");
        }

        // 查询用户信息
        UserDto user = memberService.login(phone);

        if (user == null) {
            log.error("用户：{}，不存在！", phone);
            throw new UsernameNotFoundException("用户：" + phone + "，不存在");
        }
        if (user.getStatus() == 0) {
            throw new UsernameNotFoundException("用户：" + phone + "，被锁定");
        }
        // 查询角色信息
//        List<UserRolePo> userRolePos = userRoleService.getUserRoleByUserId(user.getId());
//        if (CollectionUtils.isEmpty(userRolePos)) {
//            log.error("用户：{}，未分配角色！", usercode);
//            throw new UsernameNotFoundException("用户：" + usercode + "，未分配角色");
//        }

//        List<Long> roleIdList = userRolePos.stream().map(UserRolePo::getRoleId).collect(Collectors.toList());
//        List<RolePo> rolePoList = roleService.getRoleByRoleIdList(roleIdList);

//        if (CollectionUtil.isEmpty(rolePoList)){
//            throw new UsernameNotFoundException("用户：" + usercode + "，未分配权限");
//        }
//        rolePoList.forEach(rolePo -> authorities.add(new SimpleGrantedAuthority(rolePo.getRoleCode())));

        return new SecurityUser(user, authorities);
    }
}
