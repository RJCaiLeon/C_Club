package top.nanachan.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/13 16:51
 */
@Data
public class SubjectLabelBO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 标签分类
     */
    private String labelName;

    /**
     * 排序
     */
    private Integer sortNum;

    /**
     * 分类id
     */
    private Long categoryId;

}


