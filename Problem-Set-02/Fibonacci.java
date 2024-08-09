package com.dsa;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = in.nextInt();
        fib(n);
    }
    static void fib(int n){
    int num1 = 0;
    int num2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i +" = "+ num1+" || ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}

