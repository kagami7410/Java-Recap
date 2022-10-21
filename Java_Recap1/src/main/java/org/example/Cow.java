package org.example;

public class Cow extends Animal implements  LivesInFarm{

    public Cow(String type, int age) {
        super(type, age);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps in farm");
    }
}
