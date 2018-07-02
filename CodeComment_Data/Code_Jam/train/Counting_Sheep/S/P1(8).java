package methodEmbedding.Counting_Sheep.S.LYD1177;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Jaguar
 */
public class P1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("d:\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\out.txt"));
        
        int nCases = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[10];
        for(int i=1;i<=nCases;++i){
            Arrays.fill(check, false);
            int count=0;
            long n = Long.parseLong(br.readLine());
            long saven = n;
            if(n==0)bw.append("Case #"+i+": INSOMNIA\n");
            else{
                int a=1; 
               
                while(true){ 
                    int dig = (int)(n%10);
                    if(check[dig]==false){count++;check[dig]=true;}
                    if(count==10){bw.append("Case #"+i+": "+a*saven+"\n");break;}
                    n=n/10;
                    if(n==0){++a;n=a*saven;} 
                }  
            }
        }
        bw.close();
        br.close();
    }
}
