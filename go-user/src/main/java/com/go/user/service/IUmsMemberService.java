package com.go.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.go.user.bo.member.UmsMemberBo;
import com.go.user.entity.UmsMember;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
public interface IUmsMemberService extends IService<UmsMember> {

  UmsMemberBo getMemberByPhone(String phone);


}
