package methodEmbedding.Counting_Sheep.S.LYD630;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final String fileName = "/Users/owais/Downloads/A-small-attempt0.in";
        final String outputFormat = "Case #%d: %s";

        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), charset)) {
            String line = reader.readLine();
            final int T = Integer.parseInt(line);
            for (int i = 0; i < T; i++) {
                line = reader.readLine();
                if (line == null) {
                    throw new IllegalStateException("File does not contain enough test cases.");
                }

                final int N = Integer.parseInt(line);
                if (N == 0) {
                    System.out.println(String.format(Locale.US, outputFormat, i + 1, "INSOMNIA"));
                    continue;
                }

                final boolean[] digits = new boolean[10];
                for (int j = 1; true; j++) {
                    final int number = j * N;
                    final String numberString = String.valueOf(number);
                    for(int k = 0; k < numberString.length(); k++) {
                        final int digit = Character.digit(numberString.charAt(k), 10);
                        digits[digit] = true;
                    }

                    if (digits[0] && digits[1] && digits[2] && digits[3] && digits[4] &&
                            digits[5] && digits[6] && digits[7] && digits[8] && digits[9]) {
                        System.out.println(String.format(Locale.US, outputFormat, i + 1, numberString));
                        break;
                    }
                }
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
