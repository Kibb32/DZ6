package com.company;

public class Main3 {

    public static void main(String[] args) {

        int sum=0;
        int number=10;
        int i=0;
        int count_Number=0;

        while (i<=number){

            sum=sum+number;
            number--;
            System.out.println("Сумма ="+sum);
            count_Number++;
        }
        System.out.println("Повторения "+count_Number);
    }

}
