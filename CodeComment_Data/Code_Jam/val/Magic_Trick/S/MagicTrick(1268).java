package methodEmbedding.Magic_Trick.S.LYD2021;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {
    
    private static final String COL_SEPARATOR = " ";
    
    private static final String RESULT_FORMAT = "Case #%d: %s" + System.lineSeparator();;
    private static final String BAD_MAGICIAN = "Bad magician!";
    private static final String VOLUNTEER_CHEATED = "Volunteer cheated!";

    public static void main(String[] args) {
       String inputFilePath = args[0];
       String outputFilePath = args[1];
     
       try(
           BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
           BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));    
       ) {
           // Test case
           int T = Integer.valueOf(in.readLine());
           
           // Input data
           int firstRowNumber = 0;
           int firstCardMatrix[][] = new int[4][4];
           int secondRowNumber = 0;
           int secondCardMatrix[][] = new int[4][4];
           String[] cardMatrix;
           
           for(int i = 0; i < T; i++) {
               // Input
               firstRowNumber = Integer.valueOf(in.readLine());
               
               for(int j = 0; j < 4; j++) {
                   cardMatrix = in.readLine().split(COL_SEPARATOR);
                   for(int k = 0; k < 4; k++) {
                       firstCardMatrix[j][k] = Integer.valueOf(cardMatrix[k]);
                   }
               }
               
               secondRowNumber = Integer.valueOf(in.readLine());
               for(int j = 0; j < 4; j++) {
                   cardMatrix = in.readLine().split(COL_SEPARATOR);
                   for(int k = 0; k < 4; k++) {
                       secondCardMatrix[j][k] = Integer.valueOf(cardMatrix[k]);
                   }
               }
               
               // Process
               int[] matchCounter = new int[4];
               int matchedValue = 0;
               int totalMatchCounter = 0;
               for (int j = 0; j < 4; j++) {
                   matchCounter[j] = 0;
                   for(int k = 0; k < 4; k++) {
                       if ( firstCardMatrix[firstRowNumber - 1][j] == secondCardMatrix[secondRowNumber - 1][k]) {
                           ++matchCounter[j];
                           matchedValue = firstCardMatrix[firstRowNumber - 1][j];
                       }
                   }
                   totalMatchCounter += matchCounter[j];
               }
               
               String result;
               if (totalMatchCounter == 0) {
                   result = VOLUNTEER_CHEATED;
               } else if (totalMatchCounter == 1) {
                   result = String.valueOf(matchedValue);
               } else {
                   result = BAD_MAGICIAN;
               }
               
               // Output
               out.write(String.format(RESULT_FORMAT, i + 1, result));
           }
       } catch (IOException e) {
        e.printStackTrace();
       } 
       
    }
}
