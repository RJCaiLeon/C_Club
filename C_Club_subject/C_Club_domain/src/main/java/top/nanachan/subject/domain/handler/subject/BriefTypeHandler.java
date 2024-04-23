package top.nanachan.subject.domain.handler.subject;

import top.nanachan.subject.common.enums.IsDeletedFlagEnum;
import top.nanachan.subject.common.enums.SubjectInfoTypeEnum;
import top.nanachan.subject.domain.convert.BriefSubjectConverter;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.domain.entity.SubjectOptionBO;
import top.nanachan.subject.infra.basic.entity.SubjectBrief;
import top.nanachan.subject.infra.basic.service.SubjectBriefService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:37
 */
@Component
public class BriefTypeHandler implements SubjectTypeHandler {

    @Resource
    private SubjectBriefService subjectBriefService;

    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.BRIEF;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        SubjectBrief subjectBrief = BriefSubjectConverter.INSTANCE.convertBoToEntity(subjectInfoBO);
        subjectBrief.setSubjectId(subjectInfoBO.getId().intValue());
        subjectBrief.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        subjectBriefService.insert(subjectBrief);
    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectBrief subjectBrief = new SubjectBrief();
        subjectBrief.setSubjectId(subjectId);
        SubjectBrief result = subjectBriefService.queryByCondition(subjectBrief);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setSubjectAnswer(result.getSubjectAnswer());
        return subjectOptionBO;
    }
}

