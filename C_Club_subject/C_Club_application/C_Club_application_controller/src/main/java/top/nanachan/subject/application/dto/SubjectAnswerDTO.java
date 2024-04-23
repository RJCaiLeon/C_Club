package top.nanachan.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leon_ccc
 * @date 2024/4/14 11:25
 */
@Data
public class SubjectAnswerDTO implements Serializable {

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

