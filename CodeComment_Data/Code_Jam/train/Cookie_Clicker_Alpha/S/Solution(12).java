package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1323;



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
        Scanner scnr = new Scanner(new File("D:\\Test\\cj\\test.txt"));
        int T = scnr.nextInt();

        ArrayList<Double> answeres = new ArrayList<>();
        for (int i = 0; i < T; i++) {

            double C = scnr.nextDouble();
            double F = scnr.nextDouble();
            double X = scnr.nextDouble(); 
            double rate = 2;
            double time = 0;
            while (true) {
                if (X / rate > ((C / rate) + ((X) / (rate + F)))) {
                    time += (C / rate);
                    rate += F;
                } else {
                    time += (X / rate);
                    break;
                }
            }
            answeres.add(time);
        }
        String out = "";
        for (int i = 0; i < T; i++) {
            out += "Case #" + (i + 1) + ": ";
            out += answeres.get(i);
            out += "\r\n";
        }
        System.out.println(out);
        File outF = new File("D:\\Test\\cj\\out.out");
        FileWriter fw = new FileWriter(outF);
        fw.write(out);
        fw.flush();

    }
}
