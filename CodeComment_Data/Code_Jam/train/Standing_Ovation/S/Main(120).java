package methodEmbedding.Standing_Ovation.S.LYD2215;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.jam.qualif.a.Case;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("args length : " + args.length);
            System.exit(0);
        }

        try {
            InputFileManager ifm = new InputFileManager(args[0]);
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            long nbTestCases = ifm.readLong();

            Case[] cases = new Case[(int) nbTestCases];

            for (int i = 0; i < nbTestCases; i++) {
                cases[i] = new Case(ifm);
            }

            for (int i = 0; i < cases.length; i++) {
                try {
                    //System.out.println("Case #" + (i + 1) + ": " + cases[i].solve());
                    bw.write("Case #" + (i + 1) + ": " + cases[i].solve());
                    bw.newLine();
                } catch (NumberFormatException | IOException e) {
                    e.printStackTrace();
                }
            }

            ifm.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
