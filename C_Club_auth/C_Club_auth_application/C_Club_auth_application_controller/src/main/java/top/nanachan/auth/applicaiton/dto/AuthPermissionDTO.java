package top.nanachan.auth.applicaiton.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author leon_ccc
 * @date 2024/4/26 16:13
 */
@Data
public class AuthPermissionDTO implements Serializable {

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


