package methodEmbedding.Revenge_of_the_Pancakes.S.LYD800;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengePancakes {
    public static void main(String[] args) {
        try {
            // Create output file
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);

            // Open source file
            FileInputStream ifstream = new FileInputStream("C:\\Users\\Chin\\workspace\\Test\\src\\B-small-attempt1.in");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(ifstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int numberOfCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= numberOfCase; i++) {
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

                out.write("Case #" + i + ": " + flipCount + "\n");
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
