package com.Pranav;

import java.util.Scanner;

public class QueensAttackII<size> {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int sizeofboard[][]=new int[n][n];
        for(int i=0;i!=n;i++){
            for(int j=0;j!=n;j++){
                sizeofboard[i][j]=1;
            }
        }
        int u= in.nextInt();
        for(int k=0;k!=u;k++){
            int i1= in.nextInt();
            int j1= in.nextInt();
            sizeofboard[i1-1][j1-1]=sizeofboard[i1-1][j1-1]-1;
        }
        int p= in.nextInt();
        int q= in.nextInt();
        sizeofboard[p-1][q-1]=2;
        int countdownwards=0;
        for(int l=p;l!=n+1;l++){
            if(sizeofboard[l-1][q-1]==1){
                countdownwards++;
            }
        }
        int countupwards=0;
        for(int m=p;m!=0;m--){
            if(sizeofboard[m-1][q-1]==1){
                countupwards++;
            }
        }
        int countleft=0;
        for(int o=q;o!=0;o--){
            if(sizeofboard[p-1][o-1]==1){
                countleft++;
            }
        }
        int countright=0;
        for(int r=q;r!=n+1;r++){
            if (sizeofboard[p-1][r-1]==1){
                countright++;
            }
        }
        int countNE=0;
        for(int s=p;s!=0;s--){
            for(int t=q;t!=n+1;t++){
                if (sizeofboard[s-1][t-1]==1){
                    countNE++;
                }
            }
        }
        int countSE=0;
        for(int v=p;v!=n+1;v++){
            for(int w=q;w!=0;w--){
                if(sizeofboard[v-1][w-1]==1){
                    countSE++;
                }
            }
        }
        int countNW=0;
        for(int a=p;a!=0;a--){
            for(int b=q;b!=0;b--){
                if(sizeofboard[a-1][b-1]==1){
                    countNW++;
                }
            }
        }
        int countSW=0;
        for(int c=p;c!=n+1;c++){
            for(int d=q;d!=n+1;d++){
                if(sizeofboard[c-1][d-1]==1){
                    countSW++;
                }
            }
        }
        int possiblemoves=countdownwards+countleft+countupwards+countright+countNE+countSE+countNW+countSW;
        System.out.println(possiblemoves/3);

    }

}
