import java.util.List;

public class Student extends Person {
    private long rollNumber;
    private String standard;
    private List<String> subjects;

    public Student(String name, int age, String address, long rollNumber, String standard, List<String> subjects) {
        super(name, age, address);
        this.rollNumber = rollNumber;
        this.standard = standard;
        this.subjects = subjects;
    }

    @Override
    void role() {
        System.out.println("My role is studying");
    }

    @Override
    void sample() {

    }

    void study() {
        System.out.println("I am studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", standard='" + standard + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
