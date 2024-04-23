package top.nanachan.subject.domain.service;

import top.nanachan.subject.common.entity.PageResult;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.domain.entity.SubjectLabelBO;
//import top.nanachan.subject.infra.basic.entity.SubjectInfoEs;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:30
 */
public interface SubjectInfoDomainService {

    /**
     * 新增题目
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 分页查询
     */
    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    /**
     * 查询题目信息
     */
    SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO);

}

