package top.nanachan.auth.domain.service;

import top.nanachan.auth.domain.entity.AuthRolePermissionBO;

/**
 * 角色领域service
 *
 * @author: ChickenWing
 * @date: 2023/11/1
 */
public interface AuthRolePermissionDomainService {

    Boolean add(AuthRolePermissionBO authRolePermissionBO);

}
