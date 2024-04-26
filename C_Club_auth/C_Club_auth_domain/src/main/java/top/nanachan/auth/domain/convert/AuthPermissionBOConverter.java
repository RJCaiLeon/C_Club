package top.nanachan.auth.domain.convert;

import top.nanachan.auth.domain.entity.AuthPermissionBO;
import top.nanachan.auth.domain.entity.AuthRoleBO;
import top.nanachan.auth.infra.basic.entity.AuthPermission;
import top.nanachan.auth.infra.basic.entity.AuthRole;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限BO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:27
 */
@Mapper
public interface AuthPermissionBOConverter {

    AuthPermissionBOConverter INSTANCE = Mappers.getMapper(AuthPermissionBOConverter.class);

    AuthPermission convertBOToEntity(AuthPermissionBO authPermissionBO);

}
