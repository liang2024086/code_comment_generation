package methodEmbedding.Counting_Sheep.S.LYD320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
               Integer n = Integer.parseInt(nString);

               Set<String> values = new HashSet<>();
               
               int count;
               long result = n.longValue();

               if (n == 0) {
                   count = 0;
               } else {
                   
                   String[] tokens = nString.split("");
                   count = 1;
                   values.addAll(Arrays.asList(tokens));
                   while(values.size() < 10) {
                       count++;
                       result = n.longValue() * count;
                       String intToString = Long.toString(result);
                       values.addAll(Arrays.asList(intToString.split("")));
                   }
               }


               System.out.println(String.format("Case #%d: %s", i+1, result == 0 ? "INSOMNIA" : result));
           }

        } catch(IOException ioe) {
            System.out.println("IOException raised: " + ioe.getMessage());
        }
    }
}
