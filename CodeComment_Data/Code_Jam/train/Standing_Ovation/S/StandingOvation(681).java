package methodEmbedding.Standing_Ovation.S.LYD2063;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(new File("A-small-attempt0.in"));
        scan.nextLine();
        Writer w = new FileWriter("output");
        StringBuilder sb = new StringBuilder();
        int lineCount = 1;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner scanLine = new Scanner(line);
            
            int maxShyness = scanLine.nextInt();
            String shynessArray = scanLine.next();
            
            int[] shyness = new int[maxShyness + 1];
            
            for (int iCount = 0; iCount <= maxShyness; iCount++) {
                shyness[iCount] = shynessArray.charAt(iCount) - 48;
            }
            
            int standing = 0;
            int addedCrowd = 0;

            for (int iCount = 1; iCount <= maxShyness; iCount++) {
                standing += shyness[iCount - 1];
                if (standing < iCount) {
                    int difference = iCount - standing;
                    standing += difference;
                    addedCrowd += difference;
                }
            }

            sb.append("Case #" + lineCount++ + ": " + addedCrowd);
            sb.append(System.lineSeparator());
            
            
        }
        
        w.write(sb.toString());
        w.close();
        
    }
    
}
