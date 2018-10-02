package methodEmbedding.Magic_Trick.S.LYD2189;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class Magicktrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner reader;
        try {
            FileReader fin = new FileReader("Test.txt");
            reader = new Scanner(fin);
        } catch (Exception e) {
            reader = new Scanner(System.in);
        }
        int TCase = reader.nextInt();
        for (int caseN = 1; caseN <= TCase; caseN++) {
            int choose1 = reader.nextInt();
            int[] values = new int[4];
            int count = 0;
            for (int i = 1; i <= 16; i++) {
                int val = reader.nextInt();
                if ((i > (choose1 - 1) * 4) & (i <= choose1 * 4)) {
                    values[count] = val;
                    count++;
                }
            }
            int choose2 = reader.nextInt();
            count = 0;
            boolean valid = false;
            boolean badMagician = false;
            boolean cheated = false;
            int chooseNumber = 0;
            for (int i = 1; i <= 16; i++) {
                int val = reader.nextInt();
                if ((i > (choose2 - 1) * 4) & (i <= choose2 * 4)) {
                    for (int n = 0; n < 4; n++) {
                        if (values[n] == val) {
                            if (valid) {
                                badMagician = true;
                            } else if (!valid) {
                                valid = true;
                                chooseNumber = val;
                            }
                        }
                    }
                }
            }
            if (badMagician) {
                System.out.println("Case #"+caseN+": Bad magician!");
            } else if (valid) {
                System.out.println("Case #"+caseN+": "+chooseNumber);
            } else {
                System.out.println("Case #"+caseN+": Volunteer cheated!");
            }
        }

    }

}
