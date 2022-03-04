package com.company;

import java.util.Scanner;

public class task7 {
    static Scanner input = new Scanner(System.in);
    static int a =0;
    static int b = 0;
    public static void main(String[] args) {
        for (int i =38;i>0;i--) {
            taker();
        }
    }
    public static void taker(){
        System.out.println("enter number");
        a = input.nextInt();
        System.out.println("enter number 2");
        b= input.nextInt();
        counter();
    }
    public static void counter(){
        System.out.println("sum is "+a+b);
        if (b!=0) {
            System.out.println("ividing is "+(double)(a/b));
        }
    }
}
