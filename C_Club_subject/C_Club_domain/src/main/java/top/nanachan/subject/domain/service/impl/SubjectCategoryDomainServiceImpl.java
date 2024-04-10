package top.nanachan.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.nanachan.subject.domain.convert.SubjectCategoryConverter;
import top.nanachan.subject.domain.entity.SubjectCategoryBO;
import top.nanachan.subject.domain.service.SubjectCategoryDomainService;
import top.nanachan.subject.infra.basic.entity.SubjectCategory;
import top.nanachan.subject.infra.basic.service.SubjectCategoryService;

import javax.annotation.Resource;

/**
 * @author leon_ccc
 * @date 2024/4/8 10:25
 */
@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    public void add(SubjectCategoryBO subjectCategoryBO) {
        if (log.isInfoEnabled()) { // 日志优化，避免多余的json转换
            log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryBO));
        }
//      不同层之间的数据格式或结构可能不同，需要将domain实体转化为infra实体
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBOToCategory(subjectCategoryBO);

        subjectCategoryService.insert(subjectCategory);
    }
}
