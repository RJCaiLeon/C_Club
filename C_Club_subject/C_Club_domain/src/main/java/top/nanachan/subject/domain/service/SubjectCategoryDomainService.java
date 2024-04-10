package top.nanachan.subject.domain.service;

import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.infra.basic.service.SubjectCategoryService;

/**
 * @author leon_ccc
 * @date 2024/4/8 10:24
 */
public interface SubjectCategoryDomainService {

    void add(SubjectCategoryBO subjectCategoryBO);

}
