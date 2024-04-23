package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectAnswerBO;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.domain.entity.SubjectOptionBO;
import top.nanachan.subject.infra.basic.entity.SubjectBrief;
import top.nanachan.subject.infra.basic.entity.SubjectJudge;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:39
 */
@Mapper
public interface JudgeSubjectConverter {

    JudgeSubjectConverter INSTANCE = Mappers.getMapper(JudgeSubjectConverter.class);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectJudge> subjectJudgeList);

}
