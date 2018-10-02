package methodEmbedding.Speaking_in_Tongues.S.LYD650;

import java.util.Scanner;

public class SpeakingInTongues {

   public static void main(String[] argv) {

      int lineCount = 0, cnt = 0;
      char[] inputLineChars;
      String inputLine = "";
      String translatedLine = "";
      String outputLine = "";
      Scanner input = null;
      
      try {input = new Scanner(System.in);}
      catch(Exception e) {System.err.println("FileNotFoundException: " + e.getMessage());}

      lineCount = input.nextInt();
      input.nextLine();

      for (cnt = 0; cnt < lineCount; cnt++) {

         outputLine = "";
         inputLine = "";
         inputLine = input.nextLine();
         inputLineChars = inputLine.toCharArray();

         for (char thisChar: inputLineChars) {

            if (thisChar == 'a')
               outputLine += "y";                

            else if (thisChar == 'b')
               outputLine += "h";

            else if (thisChar == 'c')
               outputLine += "e";

            else if (thisChar == 'd')
               outputLine += "s";

            else if (thisChar == 'e')
               outputLine += "o";

            else if (thisChar == 'f')
               outputLine += "c";

            else if (thisChar == 'g')
               outputLine += "v";

            else if (thisChar == 'h')
               outputLine += "x";

            else if (thisChar == 'i')
               outputLine += "d";

            else if (thisChar == 'j')
               outputLine += "u";

            else if (thisChar == 'k')
               outputLine += "i";

            else if (thisChar == 'l')
               outputLine += "g";

            else if (thisChar == 'm')
               outputLine += "l";

            else if (thisChar == 'n')
               outputLine += "b";

            else if (thisChar == 'o')
               outputLine += "k";

            else if (thisChar == 'p')
               outputLine += "r";

            else if (thisChar == 'q')
               outputLine += "z";

            else if (thisChar == 'r')
               outputLine += "t";

            else if (thisChar == 's')
               outputLine += "n";

            else if (thisChar == 't')
               outputLine += "w";

            else if (thisChar == 'u')
               outputLine += "j";

            else if (thisChar == 'v')
               outputLine += "p";

            else if (thisChar == 'w')
               outputLine += "f";

            else if (thisChar == 'x')
               outputLine += "m";

            else if (thisChar == 'y')
               outputLine += "a";

            else if (thisChar == 'z')
               outputLine += "q";
            else if (thisChar == ' ')
               outputLine += " ";

         }

         System.out.printf("Case #%d: %s\n",cnt+1,outputLine);

      }

   }

}
