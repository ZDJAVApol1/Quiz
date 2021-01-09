package pl.sda.quiz.dto;

public class QuizDto {
    
    private String title;

    private String description;

    private String createDate;

    public QuizDto() {

    }

    public QuizDto(String title, String description, String createDate) {
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
}
