package com.company;

import java.io.File;
import java.io.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\JeeZe\\Desktop\\Лабы Java\\lab4\\f1.txt")) {
            int counter = 0;
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
                counter ++;

            }
            File file = new File("C:\\Users\\JeeZe\\Desktop\\Лабы Java\\lab4\\f1.txt");
            Scanner sc = new Scanner(new FileInputStream(file));
            
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("\n Количество слов: " + count);
            System.out.println ("\n Количество букв:" + counter);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }
    }
}