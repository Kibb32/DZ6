package com.company;

public class Main2 {
    public static void main(String[] args) {


        int year = 0;
        double land = 100;
        double barley = 20; // 20% от 100 гектаров = 100*20 / 100 = 20
        double percent_Land = 1.05;
        double petcent_Barley = 1.02;
        double barley_Six_Year = 0;

        while (year < 8){  // ЗАДАНИЕ Б

            land *= percent_Land;
            barley *= petcent_Barley;

            if (year == 4 || year == 5 || year == 6 || year == 7) {
                System.out.println("Прощадь участка за 4 - 7 года: " + land);
            }
            year++;
            }
        while (year<8){            // задание А

            barley *= petcent_Barley;

            if (year < 8) {
                System.out.println("Урожай за 1 - 8 года: " + barley);

                year++;
        }
            while (year<6){  // ЗАДАНИЕ С
                land *= percent_Land;
                barley *= petcent_Barley;
                barley_Six_Year += barley * land;
                System.out.println("Урожай за 6 лет: " + barley_Six_Year);
                year++;
            }
        }
        }
    }
