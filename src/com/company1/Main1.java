package com.company1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        String a;
        Scanner scn = new Scanner(System.in);
        System.out.println("введите число");
        if (scn.hasNextInt()){
            a = scn.nextLine();
            int c =0;

            for (int i=0;i<a.length();i++){
                char m= a.charAt(i);
                c = Character.getNumericValue(a.charAt(i))+c;
            }
            System.out.println("Сумма всех чисел равна  "+c);

        }
        else System.out.println("неправильное число, ссука!");
    }
}

