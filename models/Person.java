package models;

public abstract class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    abstract void role();

    abstract void sample();

    public void sayHello() {
        System.out.println(name + " says Hello!");
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
