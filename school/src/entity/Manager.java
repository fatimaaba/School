package entity;

public class Manager {

    private Long id;
    private String name;
    private String lastName;

    public Manager() {
    }

    public Manager(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public Manager setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Manager setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Manager setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
