public class InterfaceDemo {
    public static void main(String[] args) {
        /**
         * Create object of a class
         * Remember that, you can not create object of interface directly,
         * however, object of a concrete sub-class (Worker in our example) can be created
         * */
        Worker worker = new Worker("Hari");
        worker.startWork(); // calling overriden startWork
        worker.stopWork(); // calling overriden stopWork
        worker.sampleDefault(); // calling default method
        Workable.someStatic(); // calling static method with interface name
        worker.act(); // calling overriden act

        anonymousInterfaceImplementationDemo(); // calls method to run demo for anonymous interface implementation
    }

    /**
     * demo for anonymous interface implementation
     * */
    private static void anonymousInterfaceImplementationDemo() {
        Workable anonymousWorkableObject = new Workable() { // anonymous interface implementation
            @Override
            public void startWork() {
                System.out.println("In anonymous start work");
            }

            @Override
            public void stopWork() {
                System.out.println("In anonymous stop work");
            }
        };

        anonymousWorkableObject.startWork(); // prints 'In anonymous start work'
        anonymousWorkableObject.stopWork(); // prints 'In anonymous stop work'
        anonymousWorkableObject.sampleDefault(); // calls default method inherited from interface Workable
    }
}
