package top.nanachan.auth.applicaiton.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import top.nanachan.auth.applicaiton.convert.AuthPermissionDTOConverter;
import top.nanachan.auth.applicaiton.convert.AuthRolePermissionDTOConverter;
import top.nanachan.auth.applicaiton.dto.AuthPermissionDTO;
import top.nanachan.auth.applicaiton.dto.AuthRolePermissionDTO;
import top.nanachan.auth.common.entity.Result;
import top.nanachan.auth.domain.entity.AuthPermissionBO;
import top.nanachan.auth.domain.entity.AuthRolePermissionBO;
import top.nanachan.auth.domain.service.AuthPermissionDomainService;
import top.nanachan.auth.domain.service.AuthRolePermissionDomainService;
import top.nanachan.auth.infra.basic.entity.AuthRolePermission;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色权限Controller
 *
 * @author leon_ccc
 * @date 2024/4/26 16:09
 */
@RestController
@RequestMapping("/rolePermission/")
@Slf4j
public class RolePermissionController {

    @Resource
    private AuthRolePermissionDomainService authRolePermissionDomainService;

    /**
     * 新增角色权限关联关系
     */
    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthRolePermissionDTO authRolePermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RolePermissionController.add.dto:{}", JSON.toJSONString(authRolePermissionDTO));
            }
            Preconditions.checkArgument(!CollectionUtils.isEmpty(authRolePermissionDTO.getPermissionIdList()), "权限关联不能为空");
            Preconditions.checkNotNull(authRolePermissionDTO.getRoleId(), "角色不能为空!");
            AuthRolePermissionBO rolePermissionBO = AuthRolePermissionDTOConverter.INSTANCE.convertDTOToBO(authRolePermissionDTO);
            return Result.ok(authRolePermissionDomainService.add(rolePermissionBO));
        } catch (Exception e) {
            log.error("PermissionController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增角色权限失败");
        }
    }

}

