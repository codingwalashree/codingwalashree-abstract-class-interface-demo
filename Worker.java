/**
 * Sub-class / Child-class 'Worker' implementing from two interfaces - 'Workable' and 'Action'
 * */
public class Worker implements Workable, Action {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Override startWork method from interface 'Workable'
     * */
    @Override
    public void startWork() {
        System.out.println(this.getName() + " starting the work");
    }

    /**
     * Override stopWork method from interface 'Workable'
     * */
    @Override
    public void stopWork() {
        System.out.println(this.getName() + " stopping the work");
    }

    /**
     * Override act method from interface 'Action'
     * */
    @Override
    public void act() {
        System.out.println("In act() method");
        this.startWork(); // calling startWork method
    }
}
