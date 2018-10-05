package methodEmbedding.Cookie_Clicker_Alpha.S.LYD936;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader r = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Output1.txt"));
        String[] t = r.readLine().split(" ");
        int T = Integer.parseInt(t[0]);

        for (int i = 0; i < T; i++) {
            t = r.readLine().split(" ");
            Double C = Double.parseDouble(t[0]);
            Double F = Double.parseDouble(t[1]);
            Double X = Double.parseDouble(t[2]);

            double time = 0;
            double rate = 2;
            double curr, next;
            while (1 == 1) {
                curr = (X / rate) + time;
                next = (X / (F + rate)) + time + (C / rate);
                if (curr < next) {
                    break;
                }
                time = time + (C / rate);
                rate = rate + F;
            }
            DecimalFormat df = new DecimalFormat("#.#######");
            String A = df.format(curr);

            String result = "Case #" + (i + 1) + ": " + A;
            writer.write(result);
            writer.newLine();
            //    System.out.println(result);

        }
        writer.close();
    }
}
