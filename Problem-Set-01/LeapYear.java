package com.dsa;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the Year ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%4 == 0 &&  n%100 != 0 || n%400 == 0 ){
            System.out.println("This is a Leap Year");
        }
        else{
            System.out.println("This is not a Leap Year");
        }
    }

}
