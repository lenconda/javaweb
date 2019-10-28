public class Student {
    private String stuno;
    private String name;

    public Student(String stuno, String name) {
        super();
        this.stuno = stuno;
        this.name = name;
    }

    public Student() {
        super();
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
