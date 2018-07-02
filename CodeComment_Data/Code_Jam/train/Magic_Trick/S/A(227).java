package methodEmbedding.Magic_Trick.S.LYD537;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A.in")));
        String line = br.readLine();
        int numCases = Integer.parseInt(line);
        int[] row1 = new int[4];
        int[] row2 = new int[4];
        int rowSelected1 = 0;
        int rowSelected2 = 0;

        for (int cell : row1) {
            cell = 0;
        }
        for (int cell : row2) {
            cell = 0;
        }

        for (int i = 0; i < numCases; i++) {
            line = br.readLine();
            rowSelected1 = Integer.parseInt(line);
            for (int j = 0; j < 4; j++) {
                line = br.readLine();
                if (j == rowSelected1 - 1) {
                    String[] aux = line.split(" ");
                    for (int k = 0; k < 4; k++) {
                        row1[k] = Integer.parseInt(aux[k]);
                    }
                }
            }
            line = br.readLine();
            rowSelected2 = Integer.parseInt(line);
            for (int j = 0; j < 4; j++) {
                line = br.readLine();
                if (j == rowSelected2 - 1) {
                    String[] aux = line.split(" ");
                    for (int k = 0; k < 4; k++) {
                        row2[k] = Integer.parseInt(aux[k]);
                    }
                }
            }

            int numMatches = 0;
            int match = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (row1[j] == row2[k]) {
                        match = row2[k];
                        numMatches++;
                    }
                }
            }
            System.out.print("Case #" + (i + 1) + ": ");
            if (numMatches == 0) {
                System.out.println("Volunteer cheated!");
            } else {
                if (numMatches == 1) {
                    System.out.println(match);
                } else {
                    System.out.println("Bad magician!");
                }
            }
        }
    }
}
