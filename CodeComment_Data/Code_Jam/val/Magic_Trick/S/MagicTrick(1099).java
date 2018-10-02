package methodEmbedding.Magic_Trick.S.LYD1927;


import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class MagicTrick {

    static int T;
    static int A1, A2;
    static String[] row1, row2;
    static String[] deck1, deck2;

    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            Path inputFilePath = Paths.get(args[0]);
            Path outputFilePath = inputFilePath.resolveSibling(inputFilePath.getFileName().toString().replace(".in", ".out"));

            String outputString = "";
            String outputFormat = "Case #%d: %s\n";

            BufferedReader reader = null;

            try {
                reader = Files.newBufferedReader(inputFilePath, Charset.forName("US-ASCII"));
                T = Integer.valueOf(reader.readLine());

                for (int x = 0; x < T; x++) {
// Start of loop/solution
                    
                    row1 = new String[4];
                    row2 = new String[4];
                    deck1 = new String[4];
                    deck2 = new String[4];

                    A1 = Integer.valueOf(reader.readLine());

                    for (int i = 0; i < 4; i++) {
                        deck1[i] = reader.readLine();
                    }

                    A2 = Integer.valueOf(reader.readLine());

                    for (int i = 0; i < 4; i++) {
                        deck2[i] = reader.readLine();
                    }

                    row1 = deck1[A1 - 1].split(" ");
                    row2 = deck2[A2 - 1].split(" ");

                    int matches = 0;
                    boolean matchFound;
                    String pick = "";

                    for (int v = 0; v < 4; v++) {
                       matchFound = false;
                        for (int u = 0; u < 4 && !matchFound; u++) {
                            if (row2[u].equalsIgnoreCase(row1[v])) {
                                matches++;
                                pick = row1[v];
                                matchFound = true;
                            }
                        }
                    }

// End of loop/solution
                    outputString += String.format(outputFormat, x + 1, (matches == 1 ? pick : (matches > 1 ? "Bad magician!" : "Volunteer cheated!")));
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
                System.exit(0);
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }

// Print output

            BufferedWriter writer = null;
            try {
                writer = Files.newBufferedWriter(outputFilePath, Charset.forName("US-ASCII"));
                writer.write(outputString);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
                System.exit(0);
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
        } else {
            System.err.println("Input file not found.\nPass the file as an argument.");
            System.exit(0);
        }
    }

    private MagicTrick() {
    }
}
