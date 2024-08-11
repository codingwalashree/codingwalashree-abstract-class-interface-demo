import java.util.List;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aashish",
                25,
                "Mumbai",
                1000,
                "Jr. Software Engineer",
                25000);

        e1.role();
        e1.work();
        e1.sayHello();

        Student s1 = new Student("Raj",
                15,
                "Mumbai",
                20,
                "X",
                List.of("Maths", "Science", "English"));

        s1.role();
        s1.study();
        s1.sayHello();
    }
}
