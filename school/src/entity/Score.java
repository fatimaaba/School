package entity;

public class Score {

    private Long id;
    private Long score;
    private String nameOfLesson;

    public Score() {
    }

    public Score(Long id, Long score, String nameOfLesson) {
        this.id = id;
        this.score = score;
        this.nameOfLesson = nameOfLesson;
    }

    public Long getId() {
        return id;
    }

    public Score setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getScore() {
        return score;
    }

    public Score setScore(Long score) {
        this.score = score;
        return this;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public Score setNameOfLesson(String nameOfLesson) {
        this.nameOfLesson = nameOfLesson;
        return this;
    }
}
