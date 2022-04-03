package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {16.4, 12.3, 1.4, -3.4, 5.6, 9.2, 11.1, -4.2, 5.5, 14.1, 11.1, 14.2, 13.3, 15.6};
        int numberCount = 0;
        double allNumber = 0.0;
        boolean check = false;

        for (double cast : numbers) {
            if (cast < 0) {
                check = true;
            } else if (cast > 0 && check) {
                numberCount++;
                allNumber += cast;
                System.out.println(cast);
            }

        }
        System.out.println("Среднее арифметичское = " + allNumber / numberCount);


    }

}


