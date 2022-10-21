package org.example;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public String name;
    public String location;
    public List <Worker> workers;
    public List <Animal> animals;

    public Farm(String name, String location) {
        this.name = name;
        this.location = location;
        this.workers = new ArrayList<>();
        this.animals = new ArrayList<>();
    }
    public String getFarmInfo (){
        return( "Farm's Name: " + getName() + " --- "+ "Location: "+ getLocation());

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal (List<LivesInFarm> animals){
        animals.addAll(animals);
    }

    public void addWorker (Worker worker){
        workers.add(worker);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", workers=" + workers +
                ", animals=" + animals +
                '}';
    }
}
