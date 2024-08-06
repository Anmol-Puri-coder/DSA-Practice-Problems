package com.dsa;

public class Largest {
    public static void main(String[] args) {

        System.out.println(largest(88,56,55));
    }
    static int largest(int a,int b,int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            }
        } else if (b >= c) {
                return b;
        }
                return c;
    }
}
