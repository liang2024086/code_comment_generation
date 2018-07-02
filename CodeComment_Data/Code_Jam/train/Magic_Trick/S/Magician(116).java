package methodEmbedding.Magic_Trick.S.LYD635;

import java.io.*;
import java.util.*;

public class Magician {
    public BufferedReader br;
    public BufferedWriter bw;

    int t, answer1, answer2;
    static String[] array1;
    static String[] array2;

    public static void main(String[] args) {
        Magician mag = new Magician();
        try {
            mag.br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            mag.bw = new BufferedWriter(new FileWriter("output.txt"));
            mag.t = Integer.parseInt(mag.br.readLine());
            for (int i = 1; i <= mag.t; i++) { //per test case
                boolean found = false, badMagician = false; int foundValue = -1;
                mag.answer1 = Integer.parseInt(mag.br.readLine());
                int current = 1;
                while (current != mag.answer1) {
                    current++;
                    mag.br.readLine();
                }
                array1 = mag.br.readLine().split(" ");
                while (current != 4) {
                    current++;
                    mag.br.readLine();
                }
                mag.answer2 = Integer.parseInt(mag.br.readLine());
                current = 1;
                while (current != mag.answer2) {
                    current++;
                    mag.br.readLine();
                }
                array2 = mag.br.readLine().split(" ");
                while (current != 4) {
                    current++;
                    mag.br.readLine();
                }
                for (int a = 0; a < array1.length; a++) {
                    for (int b = 0; b < array2.length; b++) {
                        if (array1[a].equals(array2[b])) { //found match
                            if (found) { //if already had a find
                                badMagician = true;
                            } else {
                                found = true;
                                foundValue = Integer.parseInt(array1[a]);
                            }

                        }
                    }
                }
                if (badMagician) {
                    mag.bw.write("Case #"+i+": Bad magician!");
                } else if (found) {
                    mag.bw.write("Case #"+i+": "+foundValue);
                } else {
                    mag.bw.write("Case #"+i+": Volunteer cheated!");
                }
                mag.bw.newLine();
            }
            mag.bw.close();
            mag.br.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
