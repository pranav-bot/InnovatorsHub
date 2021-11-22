package com.Pranav;

import java.util.Scanner;

public class CinemaLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,i,y,tf = 0, f=0, h = 0;
        x = in.nextInt();
        for(i=0;i!=x;i++){
            y= in.nextInt();
            if(y==25){
                tf++;
            }
            else if(y==50){
                if(tf==0){
                    System.out.println("NO");
                    break;
                }
                else{
                    tf--;
                    f++;
                }
            }
            else if(y==100){
                if(tf==0){
                    System.out.println("NO");
                    break;
                }
                else if(tf>1 && f>1){
                    tf--;
                    f--;
                    h++;
                }
                else if(f==0 && tf>3){
                    tf=tf-3;
                    h++;
                }
            }
        }
        System.out.println("Yes");



    }
}













