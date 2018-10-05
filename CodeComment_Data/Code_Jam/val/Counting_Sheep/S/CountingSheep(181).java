package methodEmbedding.Counting_Sheep.S.LYD204;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by bhash90 on 4/10/16.
 */
public class CountingSheep {

   public static void main(String[] args) throws FileNotFoundException, IOException {

   File file = new File("input.txt");
   PrintWriter pw = new PrintWriter("output.txt");

   FileReader fr = new FileReader(file);
   BufferedReader r = new BufferedReader(fr);

   int T;
   T = Integer.parseInt(r.readLine());
   for(int t =0;t<T;t++){

         Set<Long> digitSet = new HashSet<>();
         int  i = 0;
         String line = r.readLine();
         Long N =Long.parseLong(line);
         if(N == 0){
            pw.println("Case #"+(t+1)+": "+ "INSOMNIA");
            pw.flush();
            continue;
         }

         while(digitSet.size() < 10){
            i++;
            Long n = N*i;
            while(n>0){
               digitSet.add(n%10);
               n/=10;
            }
         }

         pw.println("Case #"+(t+1)+": "+N*i);
         pw.flush();
      }
   }
}
