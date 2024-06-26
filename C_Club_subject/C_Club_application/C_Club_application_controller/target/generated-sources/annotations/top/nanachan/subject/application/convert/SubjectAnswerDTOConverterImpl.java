package top.nanachan.subject.application.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import top.nanachan.subject.application.dto.SubjectAnswerDTO;
import top.nanachan.subject.domain.entity.SubjectAnswerBO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-23T13:40:45+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
public class SubjectAnswerDTOConverterImpl implements SubjectAnswerDTOConverter {

    @Override
    public SubjectAnswerBO convertDTOToBO(SubjectAnswerDTO subjectAnswerDTO) {
        if ( subjectAnswerDTO == null ) {
            return null;
        }

        SubjectAnswerBO subjectAnswerBO = new SubjectAnswerBO();

        subjectAnswerBO.setOptionType( subjectAnswerDTO.getOptionType() );
        subjectAnswerBO.setOptionContent( subjectAnswerDTO.getOptionContent() );
        subjectAnswerBO.setIsCorrect( subjectAnswerDTO.getIsCorrect() );

        return subjectAnswerBO;
    }

    @Override
    public List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SubjectAnswerBO> list = new ArrayList<SubjectAnswerBO>( dtoList.size() );
        for ( SubjectAnswerDTO subjectAnswerDTO : dtoList ) {
            list.add( convertDTOToBO( subjectAnswerDTO ) );
        }

        return list;
    }
}
