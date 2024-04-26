package top.nanachan.auth.applicaiton.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色DTO
 *
 * @author leon_ccc
 * @date 2024/4/26 16:14
 */
@Data
public class AuthRoleDTO implements Serializable {

    private Long id;

    private String roleName;

    private String roleKey;

}

