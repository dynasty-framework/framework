package cn.dynasty.zt.test.common.model;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: User
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-18 11:55
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    private String userUuid;

    /**
     * 用户姓名姓名
     */
    private String realName;

    private String salt;

    private String nickName;

    private String loginName;

    private String loginEmail;

    private String loginPhone;

    private String currentPassword;

    private String passwordHints;

    private String isChangePassword;

    private String loginUsertype;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date disabledTime;

    private String disabledReason;

    private Integer failedLogins;

    private String loginMethod;

    private String lastTimeZone;

    private String lastLocal;

    private String lastLoginIp;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    private String bindLoginIp;

    private String isEnabled;

    private String comments;

    private String isDeleted;

    //日期格式化，不适用该注解日期为long
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    private String createdUuid;

    private String createdName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    private String updatedName;

    private String orgUuid;

    private String appSysUuid;

}
