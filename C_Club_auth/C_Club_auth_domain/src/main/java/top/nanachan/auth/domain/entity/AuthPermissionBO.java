package top.nanachan.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 权限DTO
 *
 * @author leon_ccc
 * @date 2024/4/26 16:30
 */
@Data
public class AuthPermissionBO implements Serializable {

    private Long id;

    private String name;

    private Long parentId;

    private Integer type;

    private String menuUrl;

    private Integer status;

    private Integer show;

    private String icon;

    private String permissionKey;
}
