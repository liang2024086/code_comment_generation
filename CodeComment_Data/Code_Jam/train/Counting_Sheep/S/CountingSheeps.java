package methodEmbedding.Counting_Sheep.S.LYD188;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class CountingSheeps  {
    public static void main(String args[])
    {
        try{
      // Scanner s = new Scanner(System.in);
  Scanner s = new Scanner(new File("C:/users/abhishek/desktop/A-small-attempt1.in"));
       FileOutputStream fout = new FileOutputStream("solution.out");
       PrintWriter pw = new PrintWriter(fout);
       int t = s.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = s.nextInt();
            if(n == 0)
                pw.println("Case #"+(i+1)+": INSOMNIA");
            else
            {
                Boolean no[] = new Boolean[10];
                for(int j = 0; j < 10; j++)
                    no[j] = false;
                int count = 0;
                int j = 1;
                while(count != 10)
                {  long a = n*j;
                    while(a!=0&&count!=10)
                    {
                        int b = (int)a%10;
                        if(!no[b])
                        {
                            no[b] = true;
                            count++;
                        }
                        a = a/10;
                    }
                   j++; 
                }
                pw.println("Case #"+(i+1)+": "+n*(j-1));
            }
        }
        pw.flush();
        pw.close();
        fout.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
