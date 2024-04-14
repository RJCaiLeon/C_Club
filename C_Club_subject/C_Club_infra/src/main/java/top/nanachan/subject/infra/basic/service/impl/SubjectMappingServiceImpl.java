package top.nanachan.subject.infra.basic.service.impl;

import top.nanachan.subject.infra.basic.entity.SubjectMapping;
import top.nanachan.subject.infra.basic.mapper.SubjectMappingDao;
import top.nanachan.subject.infra.basic.service.SubjectMappingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/13 17:02
 */
@Service("subjectMappingService")
public class SubjectMappingServiceImpl implements SubjectMappingService {

    @Resource
    private SubjectMappingDao subjectMappingDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    @Override
    public SubjectMapping queryById(int id) {
        return this.subjectMappingDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param subjectMapping 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectMapping insert(SubjectMapping subjectMapping) {
        this.subjectMappingDao.insert(subjectMapping);
        return subjectMapping;
    }

    /**
     * 修改数据
     *
     * @param subjectMapping 实例对象
     * @return 实例对象
     */
    @Override
    public int update(SubjectMapping subjectMapping) {
        return this.subjectMappingDao.update(subjectMapping);
    }

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id) {
        return this.subjectMappingDao.deleteById(id) > 0;
    }

    @Override
    public List<SubjectMapping> queryLabelId(SubjectMapping subjectMapping) {
        return this.subjectMappingDao.queryDistinctLabelId(subjectMapping);
    }

    @Override
    public void batchInsert(List<SubjectMapping> mappingList) {
        this.subjectMappingDao.insertBatch(mappingList);
    }

}

