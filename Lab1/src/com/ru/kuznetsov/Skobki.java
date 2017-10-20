package com.ru.kuznetsov;

import java.util.Scanner;

public class Skobki {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int k = 0;

        System.out.print("Введите последовательность скобок: ");
        String str = a.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if (result == '(')
                k++;
            else k--;
        }

        if (k == 0)
            System.out.print("Правильная последовательность");
        else
            System.out.print("Неправильная последовательность");

    }

}
