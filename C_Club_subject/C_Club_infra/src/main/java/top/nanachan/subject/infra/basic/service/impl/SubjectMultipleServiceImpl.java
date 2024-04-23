package top.nanachan.subject.infra.basic.service.impl;

import top.nanachan.subject.infra.basic.entity.SubjectMultiple;
import top.nanachan.subject.infra.basic.mapper.SubjectMultipleDao;
import top.nanachan.subject.infra.basic.service.SubjectMultipleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/14 09:44
 */
@Service("subjectMultipleService")
public class SubjectMultipleServiceImpl implements SubjectMultipleService {
    @Resource
    private SubjectMultipleDao subjectMultipleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SubjectMultiple queryById(Long id) {
        return this.subjectMultipleDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param subjectMultiple 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectMultiple insert(SubjectMultiple subjectMultiple) {
        this.subjectMultipleDao.insert(subjectMultiple);
        return subjectMultiple;
    }

    /**
     * 修改数据
     *
     * @param subjectMultiple 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectMultiple update(SubjectMultiple subjectMultiple) {
        this.subjectMultipleDao.update(subjectMultiple);
        return this.queryById(subjectMultiple.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.subjectMultipleDao.deleteById(id) > 0;
    }

    @Override
    public void batchInsert(List<SubjectMultiple> subjectMultipleList) {
        this.subjectMultipleDao.insertBatch(subjectMultipleList);
    }

    @Override
    public List<SubjectMultiple> queryByCondition(SubjectMultiple subjectMultiple) {
        return this.subjectMultipleDao.queryAllByLimit(subjectMultiple);
    }
}

