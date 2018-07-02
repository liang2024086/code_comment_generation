package methodEmbedding.Magic_Trick.S.LYD108;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chathura
 */
public class Solution {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scnr = new Scanner(new File("D:\\Test\\cj\\A-small-attempt0.in"));
        int T = scnr.nextInt();

        ArrayList<String> answeres = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int rowData1[] = new int[4];
            int rowData2[] = new int[4];
            for (int j = 0; j < 2; j++) {
                int ans = scnr.nextInt();
                for (int row = 0; row < 4; row++) {
                    for (int col = 0; col < 4; col++) {
                        if (row == ans - 1) {
                            if (j == 0) {
                                rowData1[col] = scnr.nextInt();
                            } else {
                                rowData2[col] = scnr.nextInt();
                            }
                        } else {
                            scnr.nextInt();
                        }
                    }
                }
            }
            boolean found = false;
            int answer = 0;
            boolean badMag = false;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (rowData1[j] == rowData2[k]) {
                        if (found) {
                            badMag = true;
                            continue;
                        }

                        found = true;
                        answer = rowData1[j];

                    }
                }
            }

            if (badMag) {
                answeres.add("Bad magician!");
            } else if (!found) {
                answeres.add("Volunteer cheated!");
            } else {
                answeres.add(answer + "");
            }

        }
        String out = "";
        for (int i = 0; i < T; i++) {
            out += "Case #" + (i + 1) + ": ";
            out += answeres.get(i);
            out += "\r\n";
        }
        System.out.println(out);
        File outF = new File("D:\\test\\out.out");
        FileWriter fw = new FileWriter(outF);
        fw.write(out);
        fw.flush();

    }
}
