package methodEmbedding.Standing_Ovation.S.LYD381;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ronit Damania
 */
public class Codejam {
    public static void main(String[] args)throws java.lang.Exception
    {
         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                   int T = Integer.parseInt(br.readLine());
           int round=0;
        do{
            int sum=0,count=0;
            
            //int c = Integer.parseInt(br.readLine());
              //int m[]=new int[c];
              String[] s1 = br.readLine().split(" ");
              int r = Integer.parseInt(s1[0]);
           
            for(int j=0;j<=r;j++)
            { 
                int x = Character.getNumericValue(s1[1].charAt(j));
                if(j==0)
                    sum+=x;
                else if(sum<j && x!=0)
                {count+=(j-sum);
                sum+=x+count;
               // System.out.println(count+": "+sum+" j="+j);
                 }
                else 
                    sum+=x;
            }
                System.out.println("case #"+(round+1)+": "+count);
                round++;
        }while(T>round);

    }
    
}
