package methodEmbedding.Revenge_of_the_Pancakes.S.LYD953;


import java.io.*;

public class Gcj2 {
    public static void main(String[] args) {
        String fileName = "B-small-attempt0.in";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".out"))) {
                String line;
                int tests = Integer.valueOf(br.readLine());
                for (int test = 1; test <= tests; ++test) {
                    String s = br.readLine();
                    char prev = ' ';
                    int res = 0;
                    for (char c: s.toCharArray()) {
                        if (prev != ' ' && prev != c)
                            ++res;
                        prev = c;
                    }
                    if (prev == '-')
                        ++res;

                    bw.write("Case #" + test + ": " + res + "\n");
                }
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
