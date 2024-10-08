package models;

public class Employee extends Person {
    private long employeeId;
    private String designation;
    private double salary;

    public Employee(String name, int age, String address, long employeeId, String designation, double salary) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public void role() {
        System.out.println("My role is to work on assigned task");
    }

    @Override
    void sample() {

    }

    public void work() {
        System.out.println("I am working on assigned task");
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "employeeId=" + employeeId +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
