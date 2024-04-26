package top.nanachan.auth.applicaiton.convert;

import top.nanachan.auth.application.dto.AuthUserDTO;
import top.nanachan.auth.domain.entity.AuthUserBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户DTO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:12
 */
@Mapper
public interface AuthUserDTOConverter {

    AuthUserDTOConverter INSTANCE = Mappers.getMapper(AuthUserDTOConverter.class);

    AuthUserBO convertDTOToBO(AuthUserDTO authUserDTO);

    AuthUserDTO convertBOToDTO(AuthUserBO authUserBO);

}
