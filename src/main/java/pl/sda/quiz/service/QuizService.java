package pl.sda.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.entity.Quiz;
import pl.sda.quiz.mapper.QuizMapper;
import pl.sda.quiz.repository.QuizRepository;

@Service
public class QuizService {
    
    @Autowired
    private QuizRepository quizRepository;

    public List<QuizDto> getAll() {

        Iterable<Quiz> entities = quizRepository.findAll();
        
        List<QuizDto> result = QuizMapper.mapEnitityListToDtoList(entities);
        return result;
    }
}
