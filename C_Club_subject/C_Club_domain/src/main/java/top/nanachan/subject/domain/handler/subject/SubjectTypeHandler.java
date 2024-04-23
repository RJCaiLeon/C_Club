package top.nanachan.subject.domain.handler.subject;

import top.nanachan.subject.common.enums.SubjectInfoTypeEnum;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.domain.entity.SubjectOptionBO;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:34
 */
public interface SubjectTypeHandler {

    /**
     * 枚举身份的识别
     */
    SubjectInfoTypeEnum getHandlerType();

    /**
     * 实际的题目的插入
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 实际的题目的插入
     */
    SubjectOptionBO query(int subjectId);

}
