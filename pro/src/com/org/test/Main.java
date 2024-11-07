package com.org.test;
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound(String sound) {
        System.out.println(name + " makes a sound: " + sound);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(name + " barks: " + sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.makeSound("generic sound");
        Dog dog = new Dog("");
        dog.makeSound("bow bow");
    }
}
