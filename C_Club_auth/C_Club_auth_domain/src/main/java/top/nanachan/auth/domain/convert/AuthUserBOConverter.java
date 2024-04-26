package top.nanachan.auth.domain.convert;

import top.nanachan.auth.domain.entity.AuthUserBO;
import top.nanachan.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 用户BO转换器
 *
 * @author leon_ccc
 * @date 2024/4/26 16:29
 */
@Mapper
public interface AuthUserBOConverter {

    AuthUserBOConverter INSTANCE = Mappers.getMapper(AuthUserBOConverter.class);

    AuthUser convertBOToEntity(AuthUserBO authUserBO);

    AuthUserBO convertEntityToBO(AuthUser authUser);

}
