package methodEmbedding.Magic_Trick.S.LYD1757;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
   public static void main(String[] args) throws IOException {
      BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
      FileWriter fw = new FileWriter("A-small.out");
      int T = new Integer(in.readLine());
      for (int currentCase = 1; currentCase <= T; currentCase++) {
         int volunteerAnswer = new Integer(in.readLine());
         int i = 1;
         while (i != volunteerAnswer) {
            in.readLine();
            i++;
         }
         String[] firstRow = in.readLine().split(" ");
         for (; i < 4; i++) {
            in.readLine();
         }

         volunteerAnswer = new Integer(in.readLine());
         i = 1;
         while (i != volunteerAnswer) {
            in.readLine();
            i++;
         }
         String[] secondRow = in.readLine().split(" ");
         for (; i < 4; i++) {
            in.readLine();
         }

         int intersect = 0;
         String result = null;

         for (String s1 : firstRow) {
            for (String s2 : secondRow) {
               if (s1.equals(s2)) {
                  intersect++;
                  result = s1;
                  break;
               }
            }
            if (intersect > 1) {
               break;
            }
         }

         if (intersect == 0) {
            result = "Volunteer cheated!";
         } else if (intersect > 1) {
            result = "Bad magician!";
         }
         fw.write("Case #" + currentCase + ": " + result + "\n");

      }
      fw.flush();
      fw.close();
   }

}
