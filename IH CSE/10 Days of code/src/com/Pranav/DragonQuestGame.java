package com.Pranav;

import java.util.Scanner;

public class DragonQuestGame {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        //x is the number of test cases
        Long a,b,c;
        for(int i=0;i!=x;i++){
            a = in.nextLong();
            b = in.nextLong();
            c =in.nextLong();
            //a is the health
            //b is the no. of void spells
            //c is the no.of the lightning spells
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
            System.out.println(a);
        }
    }
}
//The logic here is to take the health,the number of void and lighting spells and perform the actions accordingly using for loops and if else statements