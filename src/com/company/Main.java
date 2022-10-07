package com.company;

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog("Karel", 5, "pes");
        Cat myCat = new Cat("Linda", 3, "kocka");

        myCat.sound();
        myDog.sound();
    }

}
