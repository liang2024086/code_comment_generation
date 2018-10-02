package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1180;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.*; 
public class prob1{
    public static void main(String args[]) throws FileNotFoundException
    {
        File file = new File("D:/B-large.in");
        Scanner sc=new Scanner(file);
        try{
        BufferedWriter br = new BufferedWriter(new FileWriter("D:/output.txt"));        
        StringBuilder sb = new StringBuilder();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            int l=s.length();int c=0;
            int count=l-1;
            while(count>=0 && s.charAt(count)=='+')
            {--count;
            }
            while(count>=0){
                if(count==0)
                   {--count;++c;
                   }
                else if(s.charAt(count)=='-' && s.charAt(count-1)=='+')
                   {--count;++c;
                   }
                else if(s.charAt(count)=='+' && s.charAt(count-1)=='-')
                   {--count;++c;
                   }
                else
                    {--count;}
                }
            sb.append("Case #"+(i+1)+": "+c+"\n");
        }
        br.write(sb.toString());
        br.close();}
        
        catch(Exception e){
        }
    }
}
