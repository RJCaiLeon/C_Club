package top.nanachan.subject.domain.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;

/**
 * @author leon_ccc
 * @date 2024/4/8 10:34
 */
@Mapper
public interface SubjectCategoryConverter {
    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBOToCategory(SubjectCategoryBO subjectCategoryBO);
}
