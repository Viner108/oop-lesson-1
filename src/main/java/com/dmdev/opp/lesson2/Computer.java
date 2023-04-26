package com.dmdev.opp.lesson2;

public class Computer {
    int ssd=500;
    int ram;

    void load(){
        System.out.println("Я звгрузился");
    }
    void printState(){
        System.out.println("Ssd: " +ssd);
        System.out.println("Ram: " +ram);
    }
}
