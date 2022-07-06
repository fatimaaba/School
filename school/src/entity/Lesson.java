package entity;

public class Lesson {

    private Long id;
    private String name;
    private float score;

    public Lesson() {
    }

    public Lesson(Long id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public Lesson setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Lesson setName(String name) {
        this.name = name;
        return this;
    }

    public float getScore() {
        return score;
    }

    public Lesson setScore(float score) {
        this.score = score;
        return this;
    }
}
