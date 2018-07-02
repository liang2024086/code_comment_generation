package methodEmbedding.Revenge_of_the_Pancakes.S.LYD490;

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
public class PanCakes {
    public static void main(String args[])
    {
        try{
      // Scanner s = new Scanner(System.in);
  Scanner s = new Scanner(new File("C:/users/abhishek/desktop/B-small-attempt0.in"));
      FileOutputStream fout = new FileOutputStream("C:/users/abhishek/desktop/solution.out");
       PrintWriter pw = new PrintWriter(fout);
       int t = s.nextInt();
        for(int i = 0; i < t; i++)
        {
            String str = s.next();
            int count = 0;
            Boolean b = (str.charAt(0)=='+'?true:false);
            for(int j = 0; j < str.length();j++)
            {
                if(b&&str.charAt(j)=='+')
                {
                    count++;
                    b = false;
                }
                else if(!b&&str.charAt(j)=='-')
                {
                    count++;
                    b = true;
                }
            }
            if(!b)
                count--;
            pw.println("Case #"+(i+1)+": "+count);
          //  System.out.println("Case #"+(i+1)+": "+count);
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
