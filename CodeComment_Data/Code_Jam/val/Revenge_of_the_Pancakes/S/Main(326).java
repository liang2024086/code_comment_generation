package methodEmbedding.Revenge_of_the_Pancakes.S.LYD276;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final String fileName = "input.txt";
        final PrintWriter pw = new PrintWriter(new File("output.txt"));
        final String outputFormat = "Case #%d: %s";

        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), charset)) {
            final String line = reader.readLine();
            final int N = Integer.parseInt(line);
            for (int p = 0; p < N; p++) {
                final String S = reader.readLine();
                final boolean[] pancakes = new boolean[S.length()];
                for (int i = 0; i < S.length(); i++) {
                    pancakes[i] = S.charAt(i) == '+';
                }

                for (int i = 0; true; i++) {
                    final boolean first = pancakes[0];
                    int flipped = 0;
                    for (int j = 1; j < S.length(); j++) {
                        if (pancakes[j] != first) {
                            for (int k = 0; k < j; k++) {
                                pancakes[k] = !pancakes[k];
                            }
                            flipped = j;
                            break;
                        }
                    }

                    if (first && flipped == 0) {
                        pw.println(String.format(Locale.US, outputFormat, p + 1, i));
                        break;
                    } else if (!first && flipped == 0) {
                        pw.println(String.format(Locale.US, outputFormat, p + 1, i + 1));
                        break;
                    } else if (!first && flipped == S.length() - 1) {
                        pw.println(String.format(Locale.US, outputFormat, p + 1, i + 1));
                        break;
                    }
                }
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        pw.close();
    }
}
