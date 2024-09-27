package models;

import contracts.Action;
import contracts.Workable;

/**
 * Sub-class / Child-class 'models.Worker' implementing from two interfaces - 'contracts.Workable' and 'contracts.Action'
 * and extending an abstract class 'models.Person'
 * */
public class Worker extends Person implements Workable, Action {

    public Worker(String name) {
        super(name);
    }

    /**
     * Override startWork method from interface 'contracts.Workable'
     * */
    @Override
    public void startWork() {
        System.out.println(this.getName() + " starting the work");
    }

    /**
     * Override stopWork method from interface 'contracts.Workable'
     * */
    @Override
    public void stopWork() {
        System.out.println(this.getName() + " stopping the work");
    }

    /**
     * Override act method from interface 'contracts.Action'
     * */
    @Override
    public void act() {
        System.out.println("In act() method");
        this.startWork(); // calling startWork method
    }

    @Override
    void role() {
        System.out.println("My role is to work on name task");
    }

    @Override
    void sample() {
        // some implementation
    }
}
