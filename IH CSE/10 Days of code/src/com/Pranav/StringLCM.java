package com.Pranav;

import java.math.BigInteger;
import java.util.Scanner;

public class StringLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int tc = 0; tc < q; ++tc) {
            String s = sc.next();
            String t = sc.next();

            System.out.println(solve(s, t));

        }        }

    static String solve(String s, String t) {
        int length = s.length() * t.length() / BigInteger.valueOf(s.length()).gcd(BigInteger.valueOf(t.length())).intValue();
        String extendedS = s.repeat(length / s.length());
        String extendedT = t.repeat(length / t.length());

        return extendedS.equals(extendedT) ? extendedS : "-1";
    }
}
//The logic here is to count the length of both the strings and find the lcm between the length of the strings using s.length*t.length/gcd(s,t)
//and then use the lcm to print the extended string by dividing the string.repeat(lcm/string length)
//if there is no lcm we print -1