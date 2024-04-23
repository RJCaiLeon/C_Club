package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.domain.entity.SubjectOptionBO;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;
import top.nanachan.subject.infra.basic.entity.SubjectInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:27
 */
@Mapper
public interface SubjectInfoConverter {

    SubjectInfoConverter INSTANCE = Mappers.getMapper(SubjectInfoConverter.class);

    SubjectInfo convertBoToInfo(SubjectInfoBO subjectInfoBO);

    SubjectInfoBO convertOptionToBo(SubjectOptionBO subjectOptionBO);

    SubjectInfoBO convertOptionAndInfoToBo(SubjectOptionBO subjectOptionBO, SubjectInfo subjectInfo);

    List<SubjectInfoBO> convertListInfoToBO(List<SubjectInfo> subjectInfoList);

}

