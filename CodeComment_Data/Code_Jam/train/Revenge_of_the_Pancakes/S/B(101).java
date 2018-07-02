package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1086;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Jaguar
 */
public class B {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("d:\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\out.txt"));
        
        int nCases = Integer.parseInt(br.readLine());
        for(int i=1;i<=nCases;++i){
            StringBuilder input = new StringBuilder(br.readLine());
            int length = input.length();
            int flipCount=0;
            for(int j=length-1;j>=0;--j){
                if(input.charAt(j)=='-'){
                    flipCount++;
                    for(int k=j;k>=0;--k){
                        if(input.charAt(k)=='-')input.setCharAt(k, '+');
                        else input.setCharAt(k, '-');
                    } 
                }
            }
            bw.append("Case #"+i+": "+flipCount+"\n");
        }
        br.close();
        bw.close();
    }
}
