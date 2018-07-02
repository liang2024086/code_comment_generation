package methodEmbedding.Magic_Trick.S.LYD1036;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maciej K??ys
 */
public class CodeJam {

    public static void main(String[] args) {

        int num = 1;

        File file = new File("A-small-attempt0.in");
        Scanner skaner = null;
        try {
            skaner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        }
        Writer writer = null;
        BufferedWriter out = null;
        try {
            writer = new FileWriter("output.txt");
            out = new BufferedWriter(writer);
        } catch (IOException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        }

        int testCases = skaner.nextInt();
        while (num <= testCases) {
            int firstRow = skaner.nextInt() - 1;
            int[][] tab = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    tab[i][j] = skaner.nextInt();
                }
            }
            int secondRow = skaner.nextInt() - 1;
            int[][] tab2 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    tab2[i][j] = skaner.nextInt();
                }
            }
            int counter = 0;
            int liczba = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (tab[firstRow][i] == tab2[secondRow][j]) {
                        counter++;
                        liczba = tab[firstRow][i];
                    }
                }
            }
            try {
                if (counter == 1) {
                    out.write("Case #" + num + ": " + liczba);
                    System.out.println("Case #" + num + ": " + liczba);
                } else if (counter < 1) {
                    out.write("Case #" + num + ": Volunteer cheated!");
                    System.out.println("Case #" + num + ": Volunteer cheated!");
                } else if (counter > 1) {
                    out.write("Case #" + num + ": Bad magician!");
                    System.out.println("Case #" + num + ": Bad magician!");
                }
            } catch (IOException ex) {
                Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
            }
            num++;
            try {
                out.newLine();
            } catch (IOException ex) {
                Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
