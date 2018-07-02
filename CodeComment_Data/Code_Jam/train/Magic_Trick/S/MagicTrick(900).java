package methodEmbedding.Magic_Trick.S.LYD1653;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MagicTrick {
    public static void main(String[] args) throws IOException {

        int[] remainingCredit = new int[1000];
        Arrays.fill(remainingCredit, -1);

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        int numCases = Integer.parseInt(br.readLine());
        PrintWriter writer = new PrintWriter("out.txt", "UTF-8");

        for (int i = 0; i < numCases; i++) {
            int[] firstRow = new int[4];
            int[] secondRow = new int[4];
            
            // Get first row
            int firstRowIndex = Integer.parseInt(br.readLine());
            for(int j=1; j<=4; j++) {
                final String[] row = br.readLine().split(" ");
                if(j == firstRowIndex) {
                    for(int k=0; k<4; k++) {
                        firstRow[k] = Integer.parseInt(row[k]);
                    }
                }
            }
            
            // Get second row
            int secondRowIndex = Integer.parseInt(br.readLine());      
            for(int j=1; j<=4; j++) {
                final String[] row = br.readLine().split(" ");
                if(j == secondRowIndex) {
                    for(int k=0; k<4; k++) {
                        secondRow[k] = Integer.parseInt(row[k]);
                    }                
                }
            }
            
            // Brute force the solution
            int solutions = 0;
            int firstSolution = -1;
            for(int j=0; j<4; j++) {
                for(int k=0; k<4; k++) {
                    if(firstRow[j] == secondRow[k]) {
                        solutions++;
                        firstSolution = firstRow[j];
                    }
                }
            }
            
            
            if(solutions == 0) {
                writer.println(String.format("Case #%d: Volunteer cheated!", i+1, firstSolution));
            } else if (solutions == 1) {
                writer.println(String.format("Case #%d: %d", i+1, firstSolution));
            } else {
                writer.println(String.format("Case #%d: Bad magician!", i+1, firstSolution));
            }            
        }
        writer.close();

    }
}
