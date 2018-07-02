package methodEmbedding.Standing_Ovation.S.LYD1971;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author vasu
 */
public class a
{

    public static void main(String arg[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new File("A-small-attemp0-output.txt"));

        int T = sc.nextInt();
        int index = 1;
        
        while( T-- > 0)
        {
            int ans = 0;
            int n = sc.nextInt();
            String s = sc.next();

            int currentlyStanding = 0;

           // System.out.println("CASE : "+s+" "+n);
            for(int shynessLevel=0 ; shynessLevel<s.length() ; shynessLevel++)
            {
               // System.out.println("\t");
                int numbersOfPeople = Integer.parseInt(s.charAt(shynessLevel) + "");

                if(numbersOfPeople>0 )
                {
                    
                      if( shynessLevel > currentlyStanding )
                      {
                          ans += ( shynessLevel - currentlyStanding);
                          currentlyStanding += ( shynessLevel - currentlyStanding);
                      }
                      currentlyStanding += numbersOfPeople;
                }

                // System.out.println("\t"+numbersOfPeople+" : "+ans);
            }
            //System.out.println("Case #"+index+": "+ans);

            pw.println("Case #"+index+": "+ans);
            index++;

        }
        pw.close();
        sc.close();
    }

}
