package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {15.4, 13.2, 1.4, -3.4, 5.6, 9.2, 11.1, -4.2, 5.5, 14.1, 11.1, 14.2, 13.3, 15.6};
        int numberCount = 0;
        double allNumber = 0.0;
        boolean proverka = false;

        for (double cast : numbers) {
            if (cast < 0) {
                proverka = true;
            } else if (cast > 0 && proverka) {
                numberCount++;
                allNumber += cast;
                System.out.println(cast);
            }

        }


    }

}


