package OOP;

public class StudentClass {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
