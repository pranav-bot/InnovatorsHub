package com.Pranav;

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

//The logic here is to find the smallest consecutive sum of k terms in the h array
//Firstly we take the sum of first consecutive k terms and assume it to be the smallest then we add the next element in the array and subtract the first element which gives the consecutive sum of next k elements
//then we compare the minsum and the next 3 element's sum if min sum is <
//then we make next3sum=minsum and store the index
//in the end we print the index of the first element out of the k terms having the smallest consecutive sum
