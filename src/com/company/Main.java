package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myName = "Mukai";
        final int num = 10;
        String word = "Super";
        System.out.println(num + " " + word);
        System.out.println(myName +" " + num +" "+ word);
        if (num < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (num > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }


    }
}
