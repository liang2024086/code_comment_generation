package methodEmbedding.Standing_Ovation.S.LYD624;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author kunals726
 */
public class codejam1 {
        public static void main(String as[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        //PrintWriter ou1=new PrintWriter(new FileWriter("oupt.txt"));
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int ans=0;
          //  int count=0;
            int max=sc.nextInt();
            String s=sc.next();
            int available=0;
            for(int j=0;j<=max;j++){
                if(available<j){
                 //   System.out.println(j+" "+available);
                    ans+=(j-available);
                    available+=(j-available);
                }
               
                        available+=Integer.parseInt(""+s.charAt(j));
                
                
            }
            out.println("Case #"+i+": "+ans);
           // ou1.println("Case #"+i+": "+ans);
        }
        out.flush();
    }
}
