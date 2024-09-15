package models;

import contracts.Action;
import contracts.Workable;

/**
 * Sub-class / Child-class 'model.Worker' implementing from two interfaces - 'contracts.Workable' and 'contracts.Action'
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
}
