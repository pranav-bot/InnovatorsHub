package com.Pranav;

import java.util.Scanner;

public class FloorandMod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x=0;
        int y=0;
        int count = 0;
        for (int i = 0; i != n; i++) {
             x = in.nextInt();
             y = in.nextInt();
             int a[]=new int[x];
             int b[]=new int[y];
             for(int j=1;j!=x;j++){
             a[j-1]=j;
            }
             for (int j=1;j!=y;j++){
                 b[j-1]=j;
             }
             for(int j=0;j!=x;j++){
                 for(int k=0;k!=y;k++){
                     int r=a[j+1]/b[k+1];
                     if (a[j+1]==(b[k+1]+1)*r){
                         count++;

                     }
                  }
             }
        }
    }
}

//the logic is to check whether a=(b+1)*x where a is the numerator and b is the denominator and x is the remainder
//the code dosent work at the moment
