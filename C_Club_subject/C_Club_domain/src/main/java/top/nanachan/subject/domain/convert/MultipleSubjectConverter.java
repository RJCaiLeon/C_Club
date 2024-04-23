package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectAnswerBO;
import top.nanachan.subject.infra.basic.entity.SubjectJudge;
import top.nanachan.subject.infra.basic.entity.SubjectMultiple;
import top.nanachan.subject.infra.basic.entity.SubjectRadio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:40
 */
@Mapper
public interface MultipleSubjectConverter {

    MultipleSubjectConverter INSTANCE = Mappers.getMapper(MultipleSubjectConverter.class);

    SubjectMultiple convertBoToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectMultiple> subjectMultipleList);


}
