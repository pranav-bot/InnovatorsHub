package com.Pranav;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaLine {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x=0;
        x=in.nextInt();
        int y = 0;
        int i1 = 10000;
        int x1 = x;
        int z[] = new int[x];
        for(int i = 0; i!= x; i++){
             z[i]=in.nextInt();
            y=y+z[i];
            if(z[0]>25){
                 break;
             }
            if(z[i]==50){
                if(y<25){
                    break;
                }
                else{y=y-25;}
            }
            if(z[i]==100){
                if(y<75){
                    break;
                }
                else{y=y-75;}
            }
            if(y==0){
                break;
            }

        }
        if(y<=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
