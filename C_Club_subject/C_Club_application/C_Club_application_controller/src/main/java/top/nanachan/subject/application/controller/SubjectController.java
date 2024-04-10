package top.nanachan.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;
import top.nanachan.subject.infra.basic.service.SubjectCategoryService;

import javax.annotation.Resource;

/**
 * 刷题Controller
 *
 * @author leon_ccc
 * @date 2024/4/3 11:24
 */
@RestController
public class SubjectController {
    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test() {
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        return subjectCategory.getCategoryName();
    }
}
