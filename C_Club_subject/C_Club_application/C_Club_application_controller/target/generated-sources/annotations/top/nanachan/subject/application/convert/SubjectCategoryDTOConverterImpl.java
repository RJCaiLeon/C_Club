package top.nanachan.subject.application.convert;

import javax.annotation.Generated;
import top.nanachan.subject.application.dto.SubjectCategoryDTO;
import top.nanachan.subject.domain.entity.SubjectCategoryBO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-10T18:17:55+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
public class SubjectCategoryDTOConverterImpl implements SubjectCategoryDTOConverter {

    @Override
    public SubjectCategoryBO convertDTOToCategoryBO(SubjectCategoryDTO subjectCategoryDTO) {
        if ( subjectCategoryDTO == null ) {
            return null;
        }

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();

        subjectCategoryBO.setId( subjectCategoryDTO.getId() );
        subjectCategoryBO.setCategoryName( subjectCategoryDTO.getCategoryName() );
        subjectCategoryBO.setCategoryType( subjectCategoryDTO.getCategoryType() );
        subjectCategoryBO.setImageUrl( subjectCategoryDTO.getImageUrl() );
        subjectCategoryBO.setParentId( subjectCategoryDTO.getParentId() );
        subjectCategoryBO.setCreatedBy( subjectCategoryDTO.getCreatedBy() );
        subjectCategoryBO.setCreatedTime( subjectCategoryDTO.getCreatedTime() );
        subjectCategoryBO.setUpdateBy( subjectCategoryDTO.getUpdateBy() );
        subjectCategoryBO.setUpdateTime( subjectCategoryDTO.getUpdateTime() );
        subjectCategoryBO.setIsDeleted( subjectCategoryDTO.getIsDeleted() );

        return subjectCategoryBO;
    }
}
