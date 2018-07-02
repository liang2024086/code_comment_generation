package methodEmbedding.Standing_Ovation.S.LYD69;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahen
 */
public class StandingOvation {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        //in.next();

        for (int k = 1; k <= numTestCases; k++) {// k represents shyness levels
            String testLine = in.nextLine();
            String[] components = testLine.split(" ");
            // System.out.println(components[0]);

            int maxShyness = Integer.parseInt(components[0]);
            int[] frequency = new int[7];

            for (int i = 0; i < components[1].length(); i++) {
                frequency[i] = Integer.parseInt(components[1].substring(i, i + 1));
            }

           // System.out.println("T " + numTestCases);
          //  System.out.println("Max Shyness " + maxShyness);

          /*  for (int i = 0; i < components[1].length(); i++) {
                System.out.println("Frequency " + frequency[i]);
            }*/

            /* Actual algorithm goes here */
            int[] currentStandups = new int[7];
            int[] peopletobeAdded = new int[7];
            int[] finalStandups = new int[7];

            for (int shy = 0; shy <= maxShyness; shy++) { // maxShyness<6
                if (shy >= 1) { // for shyness level 1 and up
                    currentStandups[shy] = finalStandups[shy - 1];
                    if (shy > currentStandups[shy] && frequency[shy] != 0) {
                        peopletobeAdded[shy] = shy - currentStandups[shy];
                    } else {
                        peopletobeAdded[shy] = 0;
                    }
                    finalStandups[shy] = frequency[shy] + currentStandups[shy] + peopletobeAdded[shy];
                } else {
                    currentStandups[shy] = 0;
                    finalStandups[shy]=currentStandups[shy]+frequency[shy];
                }
            }
            int count=0;
            for(int i=0 ; i<peopletobeAdded.length;i++){
              
              count = count+peopletobeAdded[i];
            }
            
            System.out.println("Case #"+k+": "+count);
            String label="Case #"+k+": "+count;
            
            try {
                PrintWriter out = new PrintWriter(new FileWriter("myfinalresult.txt",true));
                out.println(label);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }

    }

   

}
