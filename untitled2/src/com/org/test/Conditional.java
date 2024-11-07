package com.org.test;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args)
    {
        int  a1;
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        if(a>18 ) {
            System.out.println("Eligible for Voting");
            if (a > 50) {
                System.out.println("Eligible for pensiom");
            }
        }

        else{
            System.out.println("Not eligible for voting ");
            System.out.println("Not eligible for pension  ");

        }
    }
}
