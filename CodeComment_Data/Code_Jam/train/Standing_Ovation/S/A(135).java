package methodEmbedding.Standing_Ovation.S.LYD84;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *ginabean
 Scanner s1 = new Scanner(new File("A-large-practice.in"));
 BufferedWriter wr = new BufferedWriter(new FileWriter("large.out"));
 */
public class A {
   public static void main(String[] args) throws IOException {
        try {
            Scanner s1 = new Scanner(new File("A-small-practice.in"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("small.out"));
            int t=s1.nextInt();
            
            for(int a=0;a<t;a++)
            {
               int sMax=s1.nextInt();
               int length=sMax;
               int[] list=new int[length+1];
               String ssM1=s1.next();
               int numberStanding=0;
               for(int i=0;i<length;i++)
               {
                  list[i]=Integer.parseInt(ssM1.charAt(i)+"");
               }
               int numAdded=0;
               numberStanding=list[0];
               
               int pos=1;
               for(int i=1;i<length+1;i++)
               {
                  if(numberStanding>=i)
                  {
                     numberStanding+=list[i];
                  }
                  else
                  {
                     numAdded+=i-numberStanding;
                     numberStanding+=i-numberStanding;
                     i--;
                  }
               }
               //System.out.println(numAdded);
               wr.write("Case #" + (a+1) + ": "+ numAdded+"\n");
            }
            wr.close();
     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
