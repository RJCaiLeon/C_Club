package top.nanachan.auth.applicaiton.convert;

import top.nanachan.auth.application.dto.AuthRoleDTO;
import top.nanachan.auth.application.dto.AuthUserDTO;
import top.nanachan.auth.domain.entity.AuthRoleBO;
import top.nanachan.auth.domain.entity.AuthUserBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 角色DTO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:11
 */
@Mapper
public interface AuthRoleDTOConverter {

    AuthRoleDTOConverter INSTANCE = Mappers.getMapper(AuthRoleDTOConverter.class);

    AuthRoleBO convertDTOToBO(AuthRoleDTO authRoleDTO);

}
