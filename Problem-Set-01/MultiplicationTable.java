package com.dsa;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Number = ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <11 ; i++) {
            System.out.println(n+" x "+i+" = "+(n*i)  );
        }
    }
}
