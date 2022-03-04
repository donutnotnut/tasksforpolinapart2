package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter amoubt of products");
        int[] amount = new int[input.nextInt()-1];
        part(amount);
    }
    public static boolean part(int[] amount){
        int sum=0;
        for (int i=amount.length; i>0;i--) {
            System.out.println("enter price");
            amount[i]=input.nextInt();
        }
        for (int i=amount.length-1; i>0;i--) {
             sum = sum+amount[i];
        }
        if (sum>150) {
            return true;
        }
        else
            return false;
    }
}
