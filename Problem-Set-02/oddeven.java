package com.dsa;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isoddeven(a);
        if(isoddeven(a) == true){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

    }
    static boolean isoddeven(int n){
        if(n % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
