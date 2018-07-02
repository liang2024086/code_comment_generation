package methodEmbedding.Standing_Ovation.S.LYD1469;

import java.util.*;
import java.io.*;

public class A{
    static String problem = "A";
    static String input = "small"; //"large";
    static String attempt = "2"; //"1"; //"2"; //"3"; //"4";
    
    public static void main(String args[]) throws IOException
   {
      BufferedReader in = null;
      //BufferedWriter out = null;

      try {
         String filename = problem + "-" + input;
         if (input.equals("small")) filename+= "-" + "attempt"+attempt;
         
         in = new BufferedReader(new FileReader(filename+".in"));
         PrintWriter out = new PrintWriter(new FileWriter(filename+".out"));
         //out = new BufferedWriter(new FileWriter(filename+".out"));
         Scanner scan = new Scanner(in);
         //problem start
         int numtests = scan.nextInt();
         for (int test = 1;test<=numtests;test++){
             int num = scan.nextInt();
             int vals[] = new int[num+1];
             
             String valstr = scan.next();
             //System.err.println(valstr);
             for (int i=0;i<valstr.length();i++){
                 vals[i] = Integer.valueOf("0"+valstr.charAt(i));
             }
             int count = vals[0];
             int added = 0;
             //System.err.println(vals[0]);
             for (int i=1;i<vals.length;i++){
                 System.err.println("Round = " + i);
                 System.err.println("count = " + count + " Added = " + added);
                 if (count<i && vals[i]>0){
                     added += i - count;
                     count= count + added + vals[i];
                 }
                 else count+= vals[i];
             }
             
             System.out.println("Case #"+test+": "+added);
             out.println("Case #"+test+": "+added);
             out.flush();

         }
         out.close();
         
   }
   catch (Exception e){
       
   }
    
   }
    
    
    
    
    
    
    
    
    
    
}
