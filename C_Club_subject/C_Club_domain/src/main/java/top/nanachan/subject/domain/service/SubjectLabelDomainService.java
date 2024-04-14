package top.nanachan.subject.domain.service;

import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.domain.entity.SubjectLabelBO;

import java.util.List;

/**
 * 题目标签领域层服务
 *
 * @author leon_ccc
 * @date 2024/4/13 16:52
 */
public interface SubjectLabelDomainService {

    /**
     * 新增标签
     */
    Boolean add(SubjectLabelBO subjectLabelBO);

    /**
     * 更新标签
     */
    Boolean update(SubjectLabelBO subjectLabelBO);

    /**
     * 删除标签
     */
    Boolean delete(SubjectLabelBO subjectLabelBO);

    /**
     * 查询分类下标签
     */
    List<SubjectLabelBO> queryLabelByCategoryId(SubjectLabelBO subjectLabelBO);

}
