package methodEmbedding.Cookie_Clicker_Alpha.S.LYD755;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ProblemB {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src//B-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("src//B.out", "UTF-8");
        int total = Integer.parseInt(reader.readLine());
        for (int i = 0; i < total; i++) {
            String[] s = reader.readLine().split("\\s");
            double c = Double.parseDouble(s[0]);
            double f = Double.parseDouble(s[1]);
            double x = Double.parseDouble(s[2]);
            double time = 0.0;
            int cookies = 0;
            double rate = 2;
            while (x / rate > c / rate + x / (rate + f)) {
                time += c / rate;
                rate += f;
                cookies++;
            }
            time += x / rate;
            writer.printf("Case #%d: %.7f\n", i + 1, time);
        }
        writer.close();
        reader.close();
    }
}
