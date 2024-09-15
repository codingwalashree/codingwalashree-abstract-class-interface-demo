package contracts;

/**
 * Functional interfaces must have single abstract method
 * @FunctionalInterface annotation adds compile time check for single abstract method.
 * */
@FunctionalInterface
public interface Action {
    void act();
}
