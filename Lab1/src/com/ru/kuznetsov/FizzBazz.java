package com.ru.kuznetsov;

import java.util.Scanner;

public class FizzBazz {

    public static void main(String[] args) {
        //int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100");
        int a = in.nextInt();
        if (a <= 0 | a > 100) {
            System.out.println("Ошибка, это не коректное число");
        }
        if (a % 5==0) {
            System.out.println("Buzz");
            if (a % 3==0){
                System.out.println("Fizz");
            }
            if (a % 3==0 & a % 5==0){
                System.out.println("FizzBuzz");
            }
        }
    }
}

