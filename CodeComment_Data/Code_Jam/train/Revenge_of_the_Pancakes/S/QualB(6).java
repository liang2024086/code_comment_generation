package methodEmbedding.Revenge_of_the_Pancakes.S.LYD10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author RITESH
 */
public class QualB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
      final String curdir=System.getProperty("user.dir")+"/src/gcj";
      Scanner reader=new Scanner(System.in);
     //System.out.print(curdir);
      switch(2)//Setting the input and output resources
      {
          case 2:
              System.setOut(new PrintStream(new File(curdir+"/output.txt")));
          case 3:
               reader = new Scanner(new File(curdir+"/input.txt"));
      }
        int T=0;
        String S;
//Input Starts from here
        T=reader.nextInt();
        for(int i=1;i<=T;i++)
        {
            S=reader.next();
//Calculations
            int count=0;
            char previous=S.charAt(0);
            for(int j=1;j<S.length() ;j++)
            {
                if(previous!=S.charAt(j))
                {
                    count++;
                    previous=S.charAt(j);
                }
            }
            if(previous=='-')
                count++;
            System.out.print("Case #"+i+": ");
            System.out.println(count);
        }
    }
}
