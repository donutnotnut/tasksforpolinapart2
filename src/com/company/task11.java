package com.company;

import java.util.Scanner;

public class task11 {
    static Scanner input = new Scanner(System.in);
    static int age;
    static boolean check;
    static int counter=0;
    public static void main(String[] args) {
        for (int i=492; i>0;i--){
            taker();
            laststage();
        }
        System.out.println(counter);
    }

    public static void taker() {
        System.out.println("enter age");
         age = input.nextInt();
        checker();
    }

    public static void checker() {
        if (age>=15 && age<=18) {
            check = true;
        }
        else
            check = false;

    }
    public static void laststage(){
        System.out.println("enter hours");
        int hours = input.nextInt();
        if (hours>3 && check) {
             counter++;
        }
    }
}
