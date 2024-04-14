package top.nanachan.subject.domain.convert;

import top.nanachan.subject.domain.entity.SubjectLabelBO;
import top.nanachan.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author leon_ccc
 * @date 2024/4/13 16:56
 */

@Mapper
public interface SubjectLabelConverter {

    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO);

    List<SubjectLabelBO> convertLabelToBoList(List<SubjectLabel> subjectLabelList);
}

