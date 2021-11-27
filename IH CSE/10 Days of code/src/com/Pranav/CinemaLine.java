package com.Pranav;

import java.util.Scanner;

public class CinemaLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,y,tf = 0, f=0, h = 0;
        //y is used to take the input
        //tf= denominations of twenty five
        //f=denominations of fifty
        //h=denominations of hundred
        Long x = in.nextLong();
        //x is the number of inputs
        boolean s=true;
        //s is used in the end to determine the output
        for(i=0;i!=x;i++){
            y= in.nextInt();
            if(y==25){
                tf++;
            }
            else if(y==50){
                if(tf==0){
                    s=false;
                    break;
                }
                else{
                    tf--;
                    f++;
                }
            }
            else if(y==100){
                if(tf==0){
                    s=false;
                    break;
                }
                else if(tf>=1 && f>=1){
                    tf--;
                    f--;
                    h++;
                }
                else if(tf>=1 && f==0){
                    s=false;
                    break;
                }
                else if(f==0 && tf>=3){
                    tf=tf-3;
                    h++;
                }
            }
        }
        if(s==false){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
// The Logic here is to store all the kinds of denominations the user and perform operations on that using basic if else statements
//If the user gives  50  ruble note then we check if there are <0 notes of 25 rubles present and we add a 50 note and subtract a 25 note else we end the program and print NO
//if the user gives a 100 ruble note first we check if there is at least one 25 note && a 50 note if not then we check if there are <=3 notes of 25 present and subtract the denominations accordingly
// (our priority should be using 50 notes first as 25 notes can be used to give change for both 50 and 100)












