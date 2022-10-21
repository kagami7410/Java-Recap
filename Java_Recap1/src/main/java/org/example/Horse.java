package org.example;

public class Horse extends Animal implements  LivesInFarm{
    public Horse(String type, int age) {
        super(type, age);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in farm");

    }
}
