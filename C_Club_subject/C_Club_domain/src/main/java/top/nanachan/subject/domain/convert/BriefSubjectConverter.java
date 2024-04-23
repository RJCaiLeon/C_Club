package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectAnswerBO;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.infra.basic.entity.SubjectBrief;
import top.nanachan.subject.infra.basic.entity.SubjectMultiple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:39
 */
@Mapper
public interface BriefSubjectConverter {

    BriefSubjectConverter INSTANCE = Mappers.getMapper(BriefSubjectConverter.class);

    SubjectBrief convertBoToEntity(SubjectInfoBO subjectInfoBO);

}