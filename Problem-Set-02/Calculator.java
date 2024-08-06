package com.dsa;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

            int a = in.nextInt();
            char op = in.next().trim().charAt(0);
            int b = in.nextInt();

            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.println();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("invalid operator");
                    }
                }
                System.out.println(ans);
            }

    }
}