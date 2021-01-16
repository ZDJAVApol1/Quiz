package pl.sda.quiz.dto;

public class QuizDto {

    private Long id;
    
    private String title;

    private String description;

    private String createDate;

    // private List<QuestionDto> questions;

    public QuizDto() {

    }

    public QuizDto(Long id, String title, String description, String createDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // public List<QuestionDto> getQuestions() {
    //     return this.questions;
    // }

    // public void setQuestions(List<QuestionDto> questions) {
    //     this.questions = questions;
    // }
}
