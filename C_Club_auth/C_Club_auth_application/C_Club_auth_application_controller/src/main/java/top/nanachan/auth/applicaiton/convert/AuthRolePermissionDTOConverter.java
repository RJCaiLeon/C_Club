package top.nanachan.auth.applicaiton.convert;

import top.nanachan.auth.application.dto.AuthPermissionDTO;
import top.nanachan.auth.application.dto.AuthRolePermissionDTO;
import top.nanachan.auth.domain.entity.AuthPermissionBO;
import top.nanachan.auth.domain.entity.AuthRolePermissionBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限DTO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:11
 */
@Mapper
public interface AuthRolePermissionDTOConverter {

    AuthRolePermissionDTOConverter INSTANCE = Mappers.getMapper(AuthRolePermissionDTOConverter.class);

    AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO);

}

