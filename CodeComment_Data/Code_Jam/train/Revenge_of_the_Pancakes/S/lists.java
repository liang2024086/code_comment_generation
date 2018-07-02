package methodEmbedding.Revenge_of_the_Pancakes.S.LYD354;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class lists {
    public static void main(String[] args) {
        try {
            // Create output file
            FileWriter fstream = new FileWriter("B-small-attempt0.out");
            BufferedWriter out = new BufferedWriter(fstream);

            // Open source file
            FileInputStream ifstream = new FileInputStream("B-small-attempt0.in");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(ifstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int numberOfCase = Integer.parseInt(br.readLine());

            for (int caseN = 1; caseN <= numberOfCase; caseN++) {
                String s = br.readLine();
                char[] chars = s.toCharArray();

                int flipCount = 0;
                for (int j = chars.length - 1; j >= 0; j--) {
                    if (chars[j] == '+') {
                        continue;
                    }
                    else {
                        flipCount++;
                        if (chars[0] == '+') {
                            flipCount++;
                            int l = 0;
                            while (chars[l] == '+') l++;

                            for(int k = 0; k < l / 2; k++) {
                                char temp = chars[k];
                                chars[k] = chars[l - k - 1];
                                chars[l - k - 1] = temp;
                            }

                            for (int k = 0; k < l; k++) {
                                chars[k] = chars[k] == '+'? '-' : '+';
                            }
                        }
                        int l = j + 1;
                        for(int k = 0; k < l / 2; k++) {
                            char temp = chars[k];
                            chars[k] = chars[l - k - 1];
                            chars[l - k - 1] = temp;
                        }

                        for (int k = 0; k <= j; k++) {
                            chars[k] = chars[k] == '+'? '-' : '+';
                        }
                    }
                }

                out.write("Case #" + caseN + ": " + flipCount + "\n");
            }

            // Close the input stream
            in.close();

            // Close the output stream
            out.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
