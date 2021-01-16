package pl.sda.quiz.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.entity.Quiz;

public class QuizMapper {

    public static QuizDto mapEntityToDto(Quiz entity) {
        QuizDto dto = new QuizDto(
            entity.getId(),
            entity.getTitle(), 
            entity.getDescription(), 
            new SimpleDateFormat("EEE, MMM d, ''yy").format(entity.getCreateDate()));

        // dto.setQuestions(QuestionMapper.mapEntityListToDtoList(entity.getQuestions()));

        return dto;
    }

    public static List<QuizDto> mapEnitityListToDtoList(Iterable<Quiz> entities) {

        List<QuizDto> result = new ArrayList<>();

        for (Quiz entity : entities) {
            result.add(mapEntityToDto(entity));
        }

        return result;
    }
}
