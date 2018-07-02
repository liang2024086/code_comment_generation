package methodEmbedding.Standing_Ovation.S.LYD1348;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Anand
 */
public class GoogleJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String filename="A-small-attempt0.in";
            File file = new File(filename); 
            Scanner sc=new Scanner(file);
            String text="";
            while (sc.hasNextLine())
            {
                    // Read an entire line, which contains all the details for 1 account
                    text = text+sc.nextLine()+"\n";
            }
            //System.out.println(text);
            String[] lines = text.split("\n");
            
            /*logic to guess from lines*/
            int ntest=Integer.parseInt(lines[0]);
            for(int j=1;j<=ntest;j++)
            {                
                String[] values=lines[j].split(" ");
                //System.out.println(lines[j]);
                int smax = Integer.parseInt(values[0]);
                int[] s=new int[values[1].length()];
                for(int i=0;i<values[1].length();i++)
                {
                    String temp="";
                    temp=temp+values[1].charAt(i);
                    s[i]=Integer.parseInt(temp);
                }

                int sum=0,x=0,p=0,count=0,ind=Integer.MAX_VALUE,temp=0;
                
                for(int k=0;k<=smax;k++)
                {
                    sum = sum+s[k];
                    p=k+1;
                    //System.out.println("Sum and p: "+sum+" "+p);
                    if(sum>=p)
                    {
                        continue;
                    }
                    else
                    {
                        //System.out.println("Increasing count..");
                        count = count+1;
                        sum = sum+1;
                        temp=p;
                        if(temp<ind)
                        ind=temp-1;
                    }
                }
                
                if(ind==Integer.MAX_VALUE)
                    ind=-1;
                
                
                System.out.println("Case #"+j+": "+count);
                //System.out.println(ind);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
