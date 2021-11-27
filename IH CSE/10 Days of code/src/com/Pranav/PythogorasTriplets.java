package com.Pranav;

import java.util.Scanner;

public class PythogorasTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,i,n=0;
        int count=0;
        x= in.nextInt();
        for(i=0;i!=x;i++){
            n= in.nextInt();
            for(int j=2;j<=n;j++){
                int u =j+1;
                int v=j-1;
                if(u==(v*v)-j && u*u==(v*v)+(j*j)){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
