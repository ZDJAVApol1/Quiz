package pl.sda.quiz.dto;

public class QuestionDto {

    private Long id;

    private String text;

    private QuizDto quiz;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuizDto getQuiz() {
        return this.quiz;
    }

    public void setQuiz(QuizDto quiz) {
        this.quiz = quiz;
    }
    
}
