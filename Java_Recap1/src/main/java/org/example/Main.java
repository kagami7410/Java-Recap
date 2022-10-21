package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Worker worker1 = new Worker("Sujan", 23, 32000);
        Worker worker2 = new Worker("Sumin", 26, 16000);


        Farm farm1 = new Farm("Lazy Farm", "York");
        Farm farm2 = new Farm("Great Farm", "London");

        Horse horse1 = new Horse("Suzy", 12);
        Horse horse2 = new Horse("Randy", 6);

        Dog dog1 = new Dog("Panda", 5);
        Dog dog2 = new Dog("Kali", 2);

        Cow cow1 = new Cow("Rani", 8);
        Cow cow2 = new Cow("Radhika", 13);

        Sheep sheep1 = new Sheep("Lolo", 3);
        Sheep sheep2 = new Sheep("Wolly", 14);

        farm1.addAnimal(Arrays.asList(cow1,cow2,sheep1));
        farm1.addWorker(worker1);

        farm2.addAnimal(Arrays.asList(horse1, horse2, sheep2, dog1, dog2));
        farm2.addWorker(worker2);

        System.out.println(farm1.getFarmInfo());



    }
}