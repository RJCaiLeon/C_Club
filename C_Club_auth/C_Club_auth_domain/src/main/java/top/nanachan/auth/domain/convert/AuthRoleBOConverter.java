package top.nanachan.auth.domain.convert;

import top.nanachan.auth.domain.entity.AuthRoleBO;
import top.nanachan.auth.domain.entity.AuthUserBO;
import top.nanachan.auth.infra.basic.entity.AuthRole;
import top.nanachan.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 角色BO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:28
 */
@Mapper
public interface AuthRoleBOConverter {

    AuthRoleBOConverter INSTANCE = Mappers.getMapper(AuthRoleBOConverter.class);

    AuthRole convertBOToEntity(AuthRoleBO authRoleBO);

}