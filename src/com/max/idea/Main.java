package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x = ");
        double x = scan.nextDouble();

        System.out.print("y = ");
        double y = scan.nextDouble();

        System.out.print("z = ");
        double z = scan.nextDouble();

        double c = (x + y + z);
        double sred = c / 3;
        double half = Math.floor(sred) /2;

        System.out.println("Cреднее арифметическое:" + sred );
        System.out.println("Половина:" + half);

        if (half > 3){
            System.out.println("Программа выполнена корректно!");
        }
        else {
            System.out.println("Не работает!");
        }

    }
}
