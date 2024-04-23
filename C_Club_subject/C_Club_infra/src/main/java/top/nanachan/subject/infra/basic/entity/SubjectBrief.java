package top.nanachan.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/14 09:38
 */
@Data
public class SubjectBrief implements Serializable {
    private static final long serialVersionUID = 904086937348284785L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 题目id
     */
    private Integer subjectId;
    /**
     * 题目答案
     */
    private String subjectAnswer;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;

    private Integer isDeleted;

}

