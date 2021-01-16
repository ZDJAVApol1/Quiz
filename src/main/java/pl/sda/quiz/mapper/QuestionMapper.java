package pl.sda.quiz.mapper;

import java.util.ArrayList;
import java.util.List;

import pl.sda.quiz.dto.QuestionDto;
import pl.sda.quiz.entity.Question;

public class QuestionMapper {
    
    public static QuestionDto mapEntityToDto(Question entity) {

        QuestionDto dto = new QuestionDto();
        dto.setId(entity.getId());
        dto.setText(entity.getText());
        dto.setQuiz(QuizMapper.mapEntityToDto(entity.getQuiz()));

        return dto;
    }

    public static List<QuestionDto> mapEntityListToDtoList(List<Question> questions) {

        List<QuestionDto> dtos = new ArrayList<>();
        for (Question entity : questions) {
            dtos.add(mapEntityToDto(entity));
        }

        return dtos;
    }
}
