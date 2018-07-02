package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1382;


import java.io.*;

public class CookieClickerAlpha {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("123.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int tests = Integer.decode(br.readLine());
            String line;

            for (int i = 0; i < tests; i++) {

                line = br.readLine();
                String arr[] = line.trim().split(" ");
                double a[] = new double[3];
                for (int p = 0; p < arr.length; p++) {
                    a[p] = Double.parseDouble(arr[p]);
                }
                double C = a[0];
                double F = a[1];
                double X = a[2];

                double prev = X / 2;
                int k = 0;
                double Y = (C / (2 + (k * F)));
                double next = Y + (X / (2 + (F * (k + 1))));

                while (next < prev) {
                    prev = next;
                    k++;
                    Y = Y + (C / (2 + (k * F)));
                    next = Y + (X/(2+(F*(k+1))));
                }

                System.out.print("Case #" + (i + 1) + ": ");
                System.out.printf("%1$.7f", prev);
                System.out.println();
            }
            br.close();
            in.close();
            fstream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
