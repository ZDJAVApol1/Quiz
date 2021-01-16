package pl.sda.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.sda.quiz.entity.Quiz;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
    
    Quiz getById(Long id);
}
