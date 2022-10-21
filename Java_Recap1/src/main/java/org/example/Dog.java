package org.example;

public class Dog extends Animal implements  LivesInFarm{
    public Dog(String type, int age) {
        super(type, age);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in farm");

    }
}
