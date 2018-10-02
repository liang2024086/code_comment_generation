package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1349;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devil's Home
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String input = "D:\\gcjam\\s0.in";
       String output = "D:\\gcjam\\s2.txt";
       Scanner sc=new Scanner(new FileReader(input));
        PrintWriter pw = new PrintWriter(output);
        double time,nextFarmTime,tgtTimeNext,tgtTimePrev,prevpRate,pRate=2,c,f,x;
        int t;
        t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
          time=0;
          nextFarmTime=0;
          tgtTimePrev=0;
          tgtTimeNext=0;
          prevpRate=0;
          pRate=2;
          c=sc.nextDouble();
          f=sc.nextDouble();
          x=sc.nextDouble();
          tgtTimePrev=(double)x/2;
          nextFarmTime=c/pRate;
          time+=nextFarmTime;
          prevpRate=pRate;
          pRate+=f;
          tgtTimeNext=(double)(time + x/pRate);
          
          while(tgtTimePrev>tgtTimeNext)
          {
             nextFarmTime=c/pRate; 
             time+=nextFarmTime;
             tgtTimePrev=tgtTimeNext;
             prevpRate=pRate;
             pRate+=f;
             tgtTimeNext=(double)(time + x/pRate);
          }
          if(i!=t)
              sc.nextLine();
          pw.println("Case #" + i + ": " + tgtTimePrev);
          System.out.println("Case #" + i + ": " + tgtTimePrev);
        }
        pw.flush();
        pw.close();
        sc.close();
    }
}
