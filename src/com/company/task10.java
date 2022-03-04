package com.company;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount of floors");
        int floors = input.nextInt();
        if (floors>3) {
            System.out.println("a");
        }else
            System.out.println("b");
    }
}
