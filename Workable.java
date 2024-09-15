public interface Workable {
    int a = 10; // interface can have final variables -- by default variables are final and should be initialized
    static int b = 20; // interface can have final static variables -- by default variables are final and should be initialized

    void startWork();
    void stopWork();

    /**
     * Private method (introduced in Java 9) in interface must have implementation
     * */
    private void somePrivate() {
        System.out.println("In somePrivate, a = " + a + ", b = " + Workable.b);
    }

    /**
     * Default method (introduced in Java 8) in interface gives default implementation
     * */
    default void sampleDefault() {
        System.out.println("In sampleDefault");
        somePrivate(); // Calling private method -- only interface members can call private method
    }

    /**
     * Static method (introduced in Java 8) in interface gives implementation and accessed via Interface in static context
     * */
    static void someStatic() {
        System.out.println("In some static method");
    }
}


