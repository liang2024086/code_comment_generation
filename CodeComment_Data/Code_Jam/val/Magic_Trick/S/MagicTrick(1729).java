package methodEmbedding.Magic_Trick.S.LYD578;

import java.io.*;

/**
 * Created by vivek on 12/04/14.
 */
public class MagicTrick {
   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int tests = Integer.parseInt(reader.readLine().trim());

      PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
      String[] lines = new String[4];
      for (int test = 1; test <= tests; test++) {
         boolean[] firstNums = new boolean[16];
         boolean[] secondNums = new boolean[16];

         int first = Integer.parseInt(reader.readLine().trim());
         for (int i = 0; i < 4; i++) {
            lines[i] = reader.readLine().trim();
         }

         String[] nums = lines[first - 1].split(" ");
         for(String num : nums) {
            firstNums[Integer.parseInt(num) - 1] = true;
         }

         int second = Integer.parseInt(reader.readLine().trim());
         for (int i = 0; i < 4; i++) {
            lines[i] = reader.readLine().trim();
         }

         nums = lines[second - 1].split(" ");
         for(String num : nums) {
            secondNums[Integer.parseInt(num) - 1] = true;
         }

         int count = 0;
         int card = 0;
         for (int i = 0; i < 16 && count <= 1; i++) {
            if (firstNums[i] && secondNums[i]) {
               card = i + 1;
               count++;
            }
         }

         if (count == 0) {
            out.println("Case #" + test + ": Volunteer cheated!");
         }  else if (count > 1) {
            out.println("Case #" + test + ": Bad magician!");
         }  else {
            out.println("Case #" + test + ": " + card);
         }
      }
      out.flush();
      out.close();
   }
}
