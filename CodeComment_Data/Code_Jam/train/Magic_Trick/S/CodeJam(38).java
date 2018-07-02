package methodEmbedding.Magic_Trick.S.LYD2056;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SOHAIB
 */
public class CodeJam {

    static BufferedReader reader;
    static BufferedWriter writer;

    public static void main(String args[]) throws IOException {
        reader = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
        writer = new BufferedWriter(new FileWriter(new File("output.out")));
        int numCases = Integer.parseInt(reader.readLine());
        System.out.println("Cases : " + numCases);

        for (int i = 0; i < numCases; i++) {
            int choice1, choice2;
            int line1[] = new int[4], line2[] = new int[4];
            String line;
            String rows[];
            int count = 0;
            int element = 0;
            line = reader.readLine();
            choice1 = Integer.parseInt(line);
            for (int row = 0; row < 4; row++) {
                line = reader.readLine();
                if (choice1 == (row+1)) {
                    System.out.println("Line1 : "+ line);
                    rows = line.split(" ");
                    for (int elements = 0; elements < 4; elements++) {
                        line1[elements] = Integer.parseInt(rows[elements]);
                    }
                }
            }
            line = reader.readLine();
            choice2 = Integer.parseInt(line);
            for (int row = 0; row < 4; row++) {
                line = reader.readLine();
                if (choice2 == (row+1)) {
                    System.out.println("Line2 : "+ line);
                    rows = line.split(" ");
                    for (int elements = 0; elements < 4; elements++) {
                        line2[elements] = Integer.parseInt(rows[elements]);
                        for (int k = 0; k < 4; k++) {
                            if (line2[elements] == line1[k]) {
                                count++;
                                element = line2[elements];
                            }
                        }
                    }
                }
            }
            System.out.println("Match Count = "+ count);
            if(i!=0) {
                writer.write("\n");
            }
            if (count == 0) {
                writer.write("Case #" + (i + 1) + ": Volunteer cheated!");
            } else if (count > 1) {
                writer.write("Case #" + (i + 1) + ": Bad magician!");
            } else {
                writer.write("Case #" + (i + 1) + ": " + element + "");
            }
        } // cases

        writer.close();
    }
}
