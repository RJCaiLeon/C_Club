package top.nanachan.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:27
 */
@Data
public class SubjectAnswerBO implements Serializable {

    /**
     * 答案选项标识
     */
    private Integer optionType;

    /**
     * 答案
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;

}

