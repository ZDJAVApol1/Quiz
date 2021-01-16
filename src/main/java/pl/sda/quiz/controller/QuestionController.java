package pl.sda.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.quiz.dto.QuestionDto;
import pl.sda.quiz.dto.QuestionListDto;
import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.service.QuestionService;
import pl.sda.quiz.service.QuizService;

@Controller
public class QuestionController {
    
    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;

    @RequestMapping(value = "/quiz/{id}/question")
    public String questionList(@PathVariable("id") Long quizId, Model model) {

        // List<QuestionDto> questions = questionService.getQuestionsByQuizId(quizId);
        // model.addAttribute("questions", questions);

        // QuizDto quiz = quizService.getQuizById(quizId);
        // model.addAttribute("quiz", quiz);

        QuestionListDto questionList = questionService.gQuestionListDtoByQuizId(quizId);
        model.addAttribute("questionList", questionList);

        return "questionList";
    }
}
