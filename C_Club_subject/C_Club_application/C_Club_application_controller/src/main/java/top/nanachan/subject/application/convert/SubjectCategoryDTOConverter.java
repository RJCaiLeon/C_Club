package top.nanachan.subject.application.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.nanachan.subject.application.dto.SubjectCategoryDTO;
import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/8 10:34
 */
@Mapper
public interface SubjectCategoryDTOConverter {
    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBO convertDTOToCategoryBO(SubjectCategoryDTO subjectCategoryDTO);

    List<SubjectCategoryDTO> converBoToCategoryDTOList(List<SubjectCategoryBO> subjectCategoryBOList);


}
