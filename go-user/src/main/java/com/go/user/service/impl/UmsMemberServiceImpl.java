package com.go.user.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.go.user.bo.member.UmsMemberBo;
import com.go.user.entity.UmsMember;
import com.go.user.mapper.UmsMemberMapper;
import com.go.user.service.IUmsMemberService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author y1nuo
 * @since 2023-04-15
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements
    IUmsMemberService {

  @Override
  public UmsMemberBo getMemberByPhone(String phone) {
    Assert.isTrue(StringUtils.hasText(phone));
//    UmsMember member = new UmsMember();
    UmsMember member = this.lambdaQuery().eq(UmsMember::getPhone, phone).one();
    return BeanUtil.copyProperties(member, UmsMemberBo.class);
  }
}
