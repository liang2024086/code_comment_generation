package methodEmbedding.Speaking_in_Tongues.S.LYD217;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpeakinginTongues {
   private static char[] map = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd',
         'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
         'm', 'a', 'q' };

   public static void main(String[] args) throws Exception {
      String input = "A-small-attempt2.in";
      String output = "A-small-attempt2.out";

      Scanner scan = new Scanner(new BufferedReader(new FileReader(input)));
      PrintWriter pw = new PrintWriter(new BufferedWriter(
            new FileWriter(output)));

      int T = Integer.parseInt(scan.nextLine());
      for (int t = 1; t <= T; t++) {
         String from = scan.nextLine();
         String to = "";
         for (int i = 0; i < from.length(); i++)
            if (from.charAt(i) == ' ')
               to += ' ';
            else
               to += map[from.charAt(i) - 'a'];
         pw.println("Case #" + t + ": " + to);
      }

      scan.close();
      pw.close();
   }
}
