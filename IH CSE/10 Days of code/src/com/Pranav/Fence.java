package com.Pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k= in.nextInt();
        int[] h= new int[n];
        for(int i=0;i!=n;i++){
            h[i]= in.nextInt();
        }
        int minsum=0;
        int nextsum=0;
        int index=k-1;
        for(int i=0;i!=k;i++){
            minsum=h[i]+minsum;
        }
        nextsum=minsum;
        for(int i=k;i!=n;i++) {
            nextsum = nextsum + h[i] - h[i - k];
            if (nextsum < minsum) {
                nextsum = minsum;
                index = i;
            }
        }
        System.out.println(index-k+2);
    }
}


