package top.nanachan.auth.applicaiton.convert;

import top.nanachan.auth.application.dto.AuthPermissionDTO;
import top.nanachan.auth.application.dto.AuthRoleDTO;
import top.nanachan.auth.domain.entity.AuthPermissionBO;
import top.nanachan.auth.domain.entity.AuthRoleBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限DTO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:10
 */
@Mapper
public interface AuthPermissionDTOConverter {

    AuthPermissionDTOConverter INSTANCE = Mappers.getMapper(AuthPermissionDTOConverter.class);

    AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO);

}
