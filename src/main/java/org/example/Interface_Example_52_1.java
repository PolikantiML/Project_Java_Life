package org.example;

// Define an interface
interface Animal {
    void eat();
    void sleep();
}
// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Interface_Example_52_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}