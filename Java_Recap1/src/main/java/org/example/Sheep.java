package org.example;

public class Sheep extends Animal implements  LivesInFarm{
    public Sheep(String type, int age) {
        super(type, age);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in farm");

    }
}
