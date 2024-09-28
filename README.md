# Abstract Classes and Interfaces in Java with examples


* Understand how abstract classes and interfaces work
* Understand when to use what
* Refer the code snippets which demonstrate abstract classes and interfaces

Follow my 🔴 YouTube channel for more videos on Java, Kotlin and software architecture concepts:

### Core Java Videos
* <a href="http://www.youtube.com/watch?feature=player_embedded&v=mPj7CH8zCaU
  " target="_blank"><img src="http://img.youtube.com/vi/mPj7CH8zCaU/0.jpg"
  alt="Abstract Classes vs Interfaces in Java" width="240" height="180" border="10" /></a>
* ▶ [ Core Java Playlist](https://www.youtube.com/playlist?list=PL0NAuwT3sREK2RpKdYhCM-7J9hoaPr9oY)
* ▶ [ Understanding Interfaces in Java](https://youtu.be/NZK5p3RIUic)
* ▶ [ Understanding Abstract Classes in Java](https://youtu.be/5L4U87By3_Y)
* ▶ [ Abstract Classes vs Interfaces in Java - 8 Key Differences](https://youtu.be/mPj7CH8zCaU)

### Java 8 Features Videos
* ▶ [ Java 8 Features Playlist](https://www.youtube.com/playlist?list=PL0NAuwT3sREIpmVKgApk2vauQ4zWAenen)
* ▶ [ Understanding Default and Static Methods in Java 8 - Part 1](https://youtu.be/meFi5pR-Y4w)
* ▶ [ Understanding Default and Static Methods in Java 8 - Part 2](https://youtu.be/0RbiKB3t0Qk)
* ▶ [ Understanding Default and Static Methods in Java 8 - Part 3](https://youtu.be/xq3vbXNPnac)
* ▶ [ Lambda Expressions and Functional Interfaces - Part 1](https://youtu.be/ywr5Ojc2sBA)
* ▶ [ Lambda Expressions and Functional Interfaces - Part 2](https://youtu.be/yRagq3IAgVo)
* ▶ [ Lambda Expressions and Functional Interfaces - Part 3](https://youtu.be/9JhCJ73kvmM)


## Abstract Classes
* What is an abstract class?
* How to define and use abstract classes in Java.
* Defining two sub-classes for an abstract class.
* Mutliple abstract methods and non-abstract methods in an abstract class
* Constructors in abstract classes.
* Real-world examples and best practices.


## Interfaces
* How to define and implement interfaces?
* Default and static methods in interfaces - Java 8
* Functional interfaces - Java 8
* Private methods - Java 9
* Multiple inheritance with interfaces
* Anonymous implementation of interfaces - Anonymous classes
* Can interface store member variables?
* Can interface have constructors?
* Can we create object of an interface?


## Differences
1. Method Implementation:<br>
   Abstract Class: Can have both abstract methods (without implementation) and concrete methods (with implementation).
   Interface: Until Java 8, all methods were abstract. From Java 8 onwards, interfaces can have default methods (with implementation) and static methods (with implementation).
2. Fields:<br>
   Abstract Class: Can have instance variables (fields) with any access modifier (private, protected, public).
   Interface: Can only have constants (public static final fields). Instance variables are not allowed.
3. Multiple Inheritance:<br>
   Abstract Class: A class can extend only one abstract class due to single inheritance in Java.
   Interface: A class can implement multiple interfaces, allowing for multiple inheritance of type.
4. Constructors:<br>
   Abstract Class: Can have constructors to initialize fields.
   Interface: Cannot have constructors because interfaces cannot hold instance state.
5. Access Modifiers for Methods:<br>
   Abstract Class: Methods can have any access modifier (private, protected, public).
   Interface: Methods are public by default. Prior to Java 9, methods were only public, abstract, or default.
6. Inheritance Type:<br>
   Abstract Class: Supports single inheritance.
   Interface: Supports multiple inheritance by allowing a class to implement multiple interfaces.
7. Why extends vs implements?:<br>
   Abstract Class: we extend the related class to create a more specific child-class – upon extending a class, it’s fields (or state) and methods become part of the sub-class. 
                   So, the term extends used for inheriting from classes.
   Interface: Purpose of interfaces is primarily declaring a contract for what methods or behaviors it’s child-classes should have. 
              So, the term ‘implements’ is used for inheriting from interfaces.
8. Use Case:<br>
   Abstract Class: Used when you want to share common code and behavior across closely related classes.
   Interface: Used to define a contract or a role that unrelated classes can implement, defining "what" the class must do, not "how."
9. Example Usage:<br>
   Abstract Class: Used when classes share a common base but have specific differences. Example: Animal class with shared behaviors.
   Interface: Used to define behavior across unrelated classes. Example: Comparable, Runnable.