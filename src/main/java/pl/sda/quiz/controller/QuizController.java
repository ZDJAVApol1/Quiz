package pl.sda.quiz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.service.QuizService;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    public String quizList(Model model) {

        List<QuizDto> dtos = quizService.getAll();

        model.addAttribute("quizList", dtos);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();

        // currentPrincipalName = "amaria"
        // pobrać User przez userRepository
        // encja z wszystkimi właściwościami usera
        // 

        return "quizList";
    }
}
