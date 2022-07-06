package entity;

public class Paye {

    private Long id;
    private String name;

    public Paye(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Paye() {
    }

    public Long getId() {
        return id;
    }

    public Paye setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Paye setName(String name) {
        this.name = name;
        return this;
    }
}
