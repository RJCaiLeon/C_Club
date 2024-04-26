package top.nanachan.subject.domain.convert;

import javax.annotation.Generated;
import top.nanachan.subject.domain.entity.SubjectInfoBO;
import top.nanachan.subject.infra.basic.entity.SubjectBrief;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-23T13:40:42+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
public class BriefSubjectConverterImpl implements BriefSubjectConverter {

    @Override
    public SubjectBrief convertBoToEntity(SubjectInfoBO subjectInfoBO) {
        if ( subjectInfoBO == null ) {
            return null;
        }

        SubjectBrief subjectBrief = new SubjectBrief();

        subjectBrief.setId( subjectInfoBO.getId() );
        subjectBrief.setSubjectAnswer( subjectInfoBO.getSubjectAnswer() );

        return subjectBrief;
    }
}
