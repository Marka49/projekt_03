package com.company;

public class Cat extends Animal {


    public Cat(String name, int age, String type) {
        super(name, age, type);
    }

    public void sound() {
        System.out.println("Mnau");
    }
}
