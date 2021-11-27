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
        }
    }
}
