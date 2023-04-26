package com.dmdev.opp.lesson2;

public class Computer {
    int ssd=500;
    int ram;

    Computer(){
        System.out.println("Я был создан");
    }
    Computer(int newSsd ){
        ssd =newSsd;
    }
    Computer(int ssd, int newRam){
        this.ssd=ssd;
        ram=newRam;
    }

    void load(){
        System.out.println("Я звгрузился");
    }
    void printState(){
        System.out.println("Ssd: " +ssd);
        System.out.println("Ram: " +ram);
    }
}
