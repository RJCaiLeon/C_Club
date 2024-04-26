package top.nanachan.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (AuthRolePermission)实体类
 *
 * @author leon_ccc
 * @date 2024/4/26 16:30
 */
@Data
public class AuthRolePermissionBO implements Serializable {
    private static final long serialVersionUID = 459343371709166261L;

    private Long id;

    private Long roleId;

    private Long permissionId;

    private List<Long> permissionIdList;
}

