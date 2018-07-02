package methodEmbedding.Magic_Trick.S.LYD390;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author narok119
 */
public class Magic {

    public static void main(String args[]) throws Exception {
        int caseCount = 1;
        BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/narok119/Desktop/A-small-attempt.in")));
        String txt = reader.readLine();
        while ((txt = reader.readLine()) != null) {
            int firstSelection = Integer.parseInt(txt);
            for (int i = 0; i < 4; i++) {
                if (firstSelection == i + 1) {
                    txt = reader.readLine();
                } else {
                    reader.readLine();
                }
            }
            String firstRoundRow[] = txt.split(" ");
            int secondSelection = Integer.parseInt(reader.readLine());
            for (int i = 0; i < 4; i++) {
                if (secondSelection == i + 1) {
                    txt = reader.readLine();
                } else {
                    reader.readLine();
                }
            }
            String secondRoundRow[] = txt.split(" ");

            String ans = "";
            boolean found = false;
            boolean foundMultiple = false;
            for (int i = 0; i < firstRoundRow.length; i++) {
                for (int j = 0; j < secondRoundRow.length; j++) {
                    if (firstRoundRow[i].equals(secondRoundRow[j]) && found) {
                        foundMultiple = true;
                        break;
                    } else if (firstRoundRow[i].equals(secondRoundRow[j])) {
                        found = true;
                        ans = firstRoundRow[i];
                    }
                }
                if (foundMultiple) {
                    break;
                }
            }
            System.out.print("Case #" + (caseCount++) + ": ");
            if (foundMultiple) {
                System.out.println("Bad magician!");
            } else if (found) {
                System.out.println(ans);
            } else {
                System.out.println("Volunteer cheated!");
            }
        }
    }
}
