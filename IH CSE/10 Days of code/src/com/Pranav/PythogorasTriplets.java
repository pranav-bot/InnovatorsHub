package com.Pranav;

import java.util.Scanner;

public class PythogorasTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        //t is the no. of test cases
        for (int tc = 0; tc < t; ++tc) {
            int c = sc.nextInt();
            System.out.println(solve(c));
        }
    }
    static int solve(int c) {
        int a = (int) Math.round(Math.sqrt(2 * c - 1));
        if (a * a > 2 * c - 1) {
            --a;
        }
        return (a - 1) / 2;
    }
}
//The logic is to check whether a=sqrt(2c-1)
