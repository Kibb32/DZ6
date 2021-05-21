package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Тренировки лыжника");

        int percent = 10;
        int day = 0;
        double path = 10;


        while (day < 7) {

            path = path + path * percent / 100;
            day++;
            System.out.println("лыжник проехал: " + path + " км");
        }
    }
}
