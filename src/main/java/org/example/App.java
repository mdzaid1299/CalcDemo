package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Calc calculator = new Calc();
        System.out.println("Addition of  " + num1 + " and  " + num2 + " = " + calculator.add(num1, num2));
        System.out.println("subtraction of  " + num1 + " and  " + num2 + " = " + calculator.sub(num1, num2));
        System.out.println("multiplication of  " + num1 + " and  " + num2 + " = " + calculator.multiply(num1, num2));
        System.out.println("division of  " + num1 + " and  " + num2 + " = " + calculator.div(num1, num2));
        System.out.println("Modulo of  " + num1 + " and  " + num2 + " = " + calculator.modulo(num1, num2));

    }
}