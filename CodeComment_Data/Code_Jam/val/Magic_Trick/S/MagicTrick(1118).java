package methodEmbedding.Magic_Trick.S.LYD1151;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MagicTrick {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
            String numberOfCasesString = f.readLine();
            int numberOfCases = Integer.parseInt(numberOfCasesString);
            for (int i = 1; i <= numberOfCases; i++) {
                
                int firstRowAnswer = Integer.parseInt(f.readLine());
                int[] possibles = new int[4];
                for (int j = 1; j <= 4; j++) {
                    String row = f.readLine();
                    if (j == firstRowAnswer) {
                        // THis is the correct row
                        String[] tokens = row.split(" ");
                        possibles[0] = Integer.parseInt(tokens[0]);
                        possibles[1] = Integer.parseInt(tokens[1]);
                        possibles[2] = Integer.parseInt(tokens[2]);
                        possibles[3] = Integer.parseInt(tokens[3]);
                    }
                }
                
                int secondRowAnswer = Integer.parseInt(f.readLine());
                int[] matches = new int[4];
                for (int j = 1; j <= 4; j++) {
                    String row = f.readLine();
                    if (j == secondRowAnswer) {
                        String[] tokens = row.split(" ");
                        matches[0] = Integer.parseInt(tokens[0]);
                        matches[1] = Integer.parseInt(tokens[1]);
                        matches[2] = Integer.parseInt(tokens[2]);
                        matches[3] = Integer.parseInt(tokens[3]);
                    }
                }
                
                // Now compare the two rows for
                //   a. a single matching element
                //   b. more than 1 matching elements
                //   c. no matching elements
                int same = 0;
                int number = -1;
                for (int j = 0; j < 4; j++) {        
                    for (int k = 0; k < 4; k++) {
                        if (possibles[j] == matches[k]) {
                            same++;
                            number = possibles[j];
                        }
                    }
                }
                
                if (same == 0) {
                    // no matches, cheated!
                    System.out.println("Case #" + i + ": Volunteer cheated!");
                } else if (same == 1) {
                    // a single match, this is our answer.
                    System.out.println("Case #" + i + ": " + number);
                } else {
                    // more than one match, bad magician.
                    System.out.println("Case #" + i + ": Bad magician!");
                    
                }
                
                
                
            }
            
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
