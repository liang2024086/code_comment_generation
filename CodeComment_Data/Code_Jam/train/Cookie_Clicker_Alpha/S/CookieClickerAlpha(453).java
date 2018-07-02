package methodEmbedding.Cookie_Clicker_Alpha.S.LYD298;


import java.io.*;

/**
 * @author Octavian
 */
public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("B-small-attempt0.out"));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String[] a = reader.readLine().split(" ");
            double c = Double.parseDouble(a[0]);
            double f = Double.parseDouble(a[1]);
            double x = Double.parseDouble(a[2]);
            double speed = 2;
            double time = 0;
            boolean stop = false;
            while (!stop) {
                double t1 = x / speed;
                double t2 = c / speed;
                double t3 = x / (speed + f);

                if (t1 < t2 + t3) {
                    time += t1;
                    stop = true;
                } else {
                    time += t2;
                    speed += f;
                }
            }

            writer.append("Case #");
            writer.append((i + 1) + ": ");
            writer.append(String.format("%.7f", time));
            writer.append("\r\n");
            writer.flush();
        }

        writer.close();
        reader.close();
    }

}
