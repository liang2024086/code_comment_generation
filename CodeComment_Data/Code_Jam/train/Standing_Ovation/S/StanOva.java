package methodEmbedding.Standing_Ovation.S.LYD1769;


import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shuvam
 */
public class StanOva {
    public static void main(String[] args) {
        BigInteger peo,peo1;
        int exp1,shy;
        int[] peop;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<x; i++){
            shy = sc.nextInt();
            peo = sc.nextBigInteger();
            peop = new int[shy+1];
            peo1 = peo;
            exp1 = 0;
            for(int j = shy; j>=0; j--){
                peop[j] = peo1.remainder(BigInteger.valueOf(10)).intValue();
                peo1 = peo1.divide(BigInteger.valueOf(10));
            }
            int exp;
            int sum = peop[0];
            for(int k=1; k<=shy ;k++){
                if(peop[k]!=0){
                    if(sum<k){
                        exp = k-sum;
                        exp1 += exp; 
                        sum += exp;
                    }
                }
                sum += peop[k];        
            }
            System.out.println("Case #"+(i+1)+": "+exp1);
        }
    }
    
}
