package methodEmbedding.Standing_Ovation.S.LYD1547;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author PRAVEER SATYAM
 */
public class STANOV {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stz;
        for(int i=0;i<n;i++){
         stz= new StringTokenizer(br.readLine());
         int smax=Integer.parseInt(stz.nextToken());
         String s= stz.nextToken();
         int count = 0,res=0;
         for(int j=1;j<s.length();j++){
           count = count+(s.charAt(j-1)-48);
           if(count>=j)
               continue;
           else{
            res=res+(j-count);
            count = count+(j-count);
           }
         }
         System.out.println("Case #"+(i+1)+": "+res);
        }
    }
}
