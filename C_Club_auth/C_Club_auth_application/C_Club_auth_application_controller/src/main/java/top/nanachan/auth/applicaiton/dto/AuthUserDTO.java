package top.nanachan.auth.applicaiton.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息DTO
 *
 * @author leon_ccc
 * @date 2024/4/26 16:15
 */
@Data
public class AuthUserDTO implements Serializable {

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


