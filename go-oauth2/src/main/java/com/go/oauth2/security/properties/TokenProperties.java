package com.go.oauth2.security.properties;

import lombok.Data;
import org.springframework.util.Assert;

/**
 * oauth 配置参数
 *
 * @author liuyongtao
 * @create 2018-12-10 17:42
 */
@Data
public class TokenProperties {

    /**
     * jwt 签名类型
     */
    private String alias = "jwt";
    /**
     * 公钥文件名称
     */
    private String jwtFileName;
    /**
     * 公钥文件密码
     */
    private String jwtPassword;

    public String getJwtFileName() {
        Assert.notNull(jwtFileName, "jwtFileName 不能为空，请配置 auth.security.token.jwtFileName");
        return jwtFileName;
    }

    public void setJwtFileName(String jwtFileName) {
        this.jwtFileName = jwtFileName;
    }

    public String getJwtPassword() {
        Assert.notNull(jwtPassword, "jwtPassword 不能为空，请配置 auth.security.token.jwtPassword");
        return jwtPassword;
    }
}
