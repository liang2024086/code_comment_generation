package methodEmbedding.Speaking_in_Tongues.S.LYD234;

import java.util.*;

public class SpeakingInTongues {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int numCases, currentCase;
      String input;
      numCases = scan.nextInt();
      scan.nextLine();
      currentCase = 0;
      while (currentCase < numCases) {
         currentCase++;
         input = new String(scan.nextLine());
         System.out.printf("Case #%d: ", currentCase);
         for (int i = 0; i < input.length(); i++) {
            switch(input.charAt(i)) {
               case 'a': System.out.printf("y"); break;
               case 'b': System.out.printf("h"); break;
               case 'c': System.out.printf("e"); break;
               case 'd': System.out.printf("s"); break;
               case 'e': System.out.printf("o"); break;
               case 'f': System.out.printf("c"); break;
               case 'g': System.out.printf("v"); break;
               case 'h': System.out.printf("x"); break;
               case 'i': System.out.printf("d"); break;
               case 'j': System.out.printf("u"); break;
               case 'k': System.out.printf("i"); break;
               case 'l': System.out.printf("g"); break;
               case 'm': System.out.printf("l"); break;
               case 'n': System.out.printf("b"); break;
               case 'o': System.out.printf("k"); break;
               case 'p': System.out.printf("r"); break;
               case 'q': System.out.printf("z"); break;
               case 'r': System.out.printf("t"); break;
               case 's': System.out.printf("n"); break;
               case 't': System.out.printf("w"); break;
               case 'u': System.out.printf("j"); break;
               case 'v': System.out.printf("p"); break;
               case 'w': System.out.printf("f"); break;
               case 'x': System.out.printf("m"); break;
               case 'y': System.out.printf("a"); break;
               case 'z': System.out.printf("q"); break;
               default: System.out.printf(" ");
            }
         }
         System.out.printf("\n");
      }
   }
}
