package com.Pranav;

import java.util.Scanner;

public class DragonQuestGame {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        Long a,b,c;
        for(int i=0;i!=x;i++){
            a = in.nextLong();
            b = in.nextLong();
            c =in.nextLong();
            for(int j=0;j!=b;j++){
                a=(a/2)+10;
            }
            for(int k=0;k!=c;k++){
                a=a-10;
            }
            if(a<=0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");

            }



        }
    }
}
