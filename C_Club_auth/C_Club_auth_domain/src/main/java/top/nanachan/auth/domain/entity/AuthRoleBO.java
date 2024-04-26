package top.nanachan.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色BO
 *
 * @author leon_ccc
 * @date 2024/4/26 16:30
 */
@Data
public class AuthRoleBO implements Serializable {

    private Long id;

    private String roleName;

    private String roleKey;

}

