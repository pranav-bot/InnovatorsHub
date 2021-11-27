package com.Pranav;

import java.util.Scanner;

public class StringLCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i!=n;i++){
            String s=in.next();
            String t=in.next();
            String[] ArrayofS=s.split("");
            String[] ArrayofT=t.split("");
            int x= s.length();
            int y= t.length();
            int a=(x*y)/gcd(x,y);
            String ans="";
            int k=0;
            for(int j=0;j!=a;j++){
                ans += ArrayofS[k];
                k++;
                k%=n;
            }


        }
    }
    static int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }

        }
        return x;
    }
}
