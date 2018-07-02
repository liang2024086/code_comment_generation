package methodEmbedding.Counting_Sheep.S.LYD1265;


import java.io.*;

public class Gcj1 {
    public static void main(String[] args) {
        String fileName = "A-small-attempt0.in";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".out"))) {
                int tests = Integer.valueOf(br.readLine());
                for (int test = 1; test <= tests; ++test) {
                    int n = Integer.valueOf(br.readLine());
                    if (n == 0)
                        bw.write("Case #" + test + ": " + "INSOMNIA" + "\n");
                    else {
                        boolean flags[] = new boolean[10];
                        for(int i = 0; i < flags.length; ++i)
                            flags[i] = false;
                        int count = 0;
                        int cur = 0;
                        while (count < 10) {
                            cur += n;
                            int tmp = cur;
                            while (tmp != 0) {
                                int digit = tmp % 10;
                                tmp /= 10;
                                if (!flags[digit]) {
                                    ++count;
                                    flags[digit] = true;
                                }
                            }
                        }
                        bw.write("Case #" + test + ": " + cur + "\n");
                    }
                }
                bw.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
