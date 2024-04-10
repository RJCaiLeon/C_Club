package top.nanachan.subject.application.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.nanachan.subject.application.convert.SubjectCategoryDTOConverter;
import top.nanachan.subject.application.dto.SubjectCategoryDTO;
import top.nanachan.subject.common.entity.Result;
import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.domain.service.SubjectCategoryDomainService;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;

import javax.annotation.Resource;

/**
 * 刷题分类controller
 *
 * @author leon_ccc
 * @date 2024/4/8 10:53
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try {
            if (log.isInfoEnabled()) { // 日志优化，避免多余的json转换
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDTOToCategoryBO(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok();
        } catch (Exception e) {
            return Result.fail();
        }
    }
}
