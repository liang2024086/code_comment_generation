package methodEmbedding.Standing_Ovation.S.LYD1664;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author surarana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int time=0;
    
    
    
    public static void main(String[] args) throws IOException 
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(in.readLine());
       for(int i=0;i<t;i++)
       {
          String[] nos=in.readLine().split(" ");
          int max=Integer.parseInt(nos[0]);
          String shyness=(nos[1]);
        
          int a=0,r=0;
          a+=Integer.parseInt(shyness.substring(0, 1));
          
          for(int j=1;j<shyness.length();j++)
          {
            int n=Integer.parseInt(shyness.substring(j, j+1));
            if(j>a)
            { 
                r=r+(j-a);
                a+=(j-a);
            }
            a+=n;
          }
         
           System.out.println("Case #"+(i+1)+": "+r);
       }
       
       
       
       
    }
    
}
