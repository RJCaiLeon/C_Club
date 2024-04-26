package top.nanachan.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/26 16:31
 */
@Data
public class AuthUserBO implements Serializable {

    private Long id;

    private String userName;

    private String nickName;

    private String email;

    private String phone;

    private String password;

    private Integer sex;

    private String avatar;

    private Integer status;

    private String introduce;

    private String extJson;

}

