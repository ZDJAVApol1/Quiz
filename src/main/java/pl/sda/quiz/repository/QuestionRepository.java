package pl.sda.quiz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.sda.quiz.entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
    
    Question getById(Long id);

    List<Question> getAllByQuizId(Long id);
}
