package methodEmbedding.Counting_Sheep.S.LYD1710;

import java.util.*;
import java.io.*;
import java.math.*;

public class sheep {
   public static void main(String[] args) throws Exception {
      String filename = "A-small-attempt1.in";
      Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
      PrintWriter out = new PrintWriter(new FileWriter("gu1.txt"));
      int T = sc.nextInt();
      for (int i = 0; i < T; i++) {
         int N = sc.nextInt();
         String al = "";
         int counter = 1;
         boolean gao = false;
         while(!(al.contains("1") &&
         al.contains("2") &&
         al.contains("3") &&
         al.contains("4") &&
         al.contains("5") &&
         al.contains("6") &&
         al.contains("7") &&
         al.contains("8") &&
         al.contains("9") &&
         al.contains("0"))){
            int cur_n = counter * N;
            String gu_ = "" + cur_n;
            String[] gu = gu_.split("");
            for (int g = 0; g < gu.length; g++) {
               if(!al.contains(gu[g]))
                  al += gu[g];
            }
         	
            if(counter == 1000000){
               gao = true;
               break;
            }
            counter++;
         }
         int cur = i+1;
         if(!gao)
            out.println("Case #" + cur + ": " + ((counter * N) - N));
         else
            out.println("Case #" + cur + ": " + "INSOMNIA");

      }
      sc.close();
      out.close();
   }
}
