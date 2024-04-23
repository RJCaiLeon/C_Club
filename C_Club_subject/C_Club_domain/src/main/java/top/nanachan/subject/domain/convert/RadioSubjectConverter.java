package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectAnswerBO;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.infra.basic.entity.SubjectInfo;
import top.nanachan.subject.infra.basic.entity.SubjectMultiple;
import top.nanachan.subject.infra.basic.entity.SubjectRadio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:39
 */
@Mapper
public interface RadioSubjectConverter {

    RadioSubjectConverter INSTANCE = Mappers.getMapper(RadioSubjectConverter.class);

    SubjectRadio convertBoToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectRadio> subjectRadioList);

}

