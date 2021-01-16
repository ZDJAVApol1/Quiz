package pl.sda.quiz.dto;

import java.util.List;

public class QuestionListDto {
    
    private String quizName;
    private List<QuestionDto> questions;

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public List<QuestionDto> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }
}
