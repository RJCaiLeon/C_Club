package top.nanachan.subject.infra.basic.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/13 16:43
 */
@Data
public class SubjectLabel implements Serializable {

    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 排序
     */
    private Integer sortNum;
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

    private Integer isDeleted;
    /**
     * 更新时间
     */
    private Date updateTime;

}


