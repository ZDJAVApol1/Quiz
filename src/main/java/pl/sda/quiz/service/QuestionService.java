package pl.sda.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.sda.quiz.dto.QuestionDto;
import pl.sda.quiz.dto.QuestionListDto;
import pl.sda.quiz.entity.Question;
import pl.sda.quiz.entity.Quiz;
import pl.sda.quiz.mapper.QuestionMapper;
import pl.sda.quiz.repository.QuestionRepository;
import pl.sda.quiz.repository.QuizRepository;

@Service
public class QuestionService {
    
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizRepository quizRepository;

    public List<QuestionDto> getQuestionsByQuizId(Long quizId) {

        List<Question> entities = questionRepository.getAllByQuizId(quizId);
        List<QuestionDto> dtos = QuestionMapper.mapEntityListToDtoList(entities);

        return dtos;
    }

    public QuestionListDto gQuestionListDtoByQuizId(Long quizId) {

        List<Question> entities = questionRepository.getAllByQuizId(quizId);
        Quiz quiz = quizRepository.getById(quizId);

        QuestionListDto result = new QuestionListDto();
        result.setQuizName(quiz.getTitle());
        result.setQuestions(QuestionMapper.mapEntityListToDtoList(entities));

        return result;
    }
}
