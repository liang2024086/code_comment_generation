package methodEmbedding.Revenge_of_the_Pancakes.S.LYD242;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Codejam {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Filename is required");
            System.out.println("Usage: java Codejam <filePath>");
        }

        String fileName = args[0];

        try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {

           String caseString = in.readLine();
           Integer cases = Integer.parseInt(caseString);

           for (int i = 0; i < cases; i++) {
               String nString = in.readLine();
               char[] tokens = nString.toCharArray();
               int length = tokens.length;
               
               int flip;
               boolean unHappy = nString.contains("-");
               if (!unHappy) {
                   flip = 0;
               } else {
                   flip = 0;
                   while(unHappy) {
                       int j = nString.indexOf('+');
                       int k = nString.indexOf('-');
                       if(k < 0)
                           break;
                       while (true) {
                           tokens[k++] = '+';
                           if (k == length || tokens[k] == '+')
                               break;
                       }
                       nString = new String(tokens);
                       flip += j < k && j>=0 ? 2: 1;
                   }
               }

               System.out.println(String.format("Case #%d: %d", i+1, flip));
           }


        } catch(IOException ioe) {
            System.out.println("IOException raised: " + ioe.getMessage());
        }
    }
}
