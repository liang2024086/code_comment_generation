package methodEmbedding.Counting_Sheep.S.LYD255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

    public static void main(String[] args) {
        try {
            // Create output file
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);

            // Open source file
            FileInputStream ifstream = new FileInputStream("C:\\Users\\Chin\\workspace\\Test\\src\\A-small-attempt0.in");

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(ifstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int numberOfCase = Integer.parseInt(br.readLine());

            Set<Character> numSet;

            for (int i = 1; i <= numberOfCase; i++) {
                numSet = new HashSet<Character>();
                long num = Long.parseLong(br.readLine());

                if (num == 0) {
                    out.write("Case #" + i + ": INSOMNIA\n");
                    continue;
                }

                int count = 1;
                while (true) {
                    long tmp = num * count;
                    String n = tmp + "";
                    char[] digits = n.toCharArray();
                    for (char d : digits) {
                        numSet.add(d);
                    }
                    if (numSet.size() == 10) {
                        out.write("Case #" + i + ": " + n + "\n");
                        break;
                    }
                    count++;
                }
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
