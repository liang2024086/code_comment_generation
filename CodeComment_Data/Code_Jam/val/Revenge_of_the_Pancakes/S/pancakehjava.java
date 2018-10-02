package methodEmbedding.Revenge_of_the_Pancakes.S.LYD395;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
public class RevengePancakes {
    public static void main(String[] args) {
        try {
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);

            FileInputStream strea = new FileInputStream(new File("in.txt"));

            DataInputStream in = new DataInputStream(strea);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int cases = Integer.parseInt(br.readLine());

            for (int p = 1; p <= cases; p++) {
                String s = br.readLine();
                char[] sign = s.toCharArray();

                int count = 0;
                for (int j = sign.length - 1; j >= 0; j--) {
                    if (sign[j] == '+') {
                        continue;
                    }
                    else {
                        count++;
                        if (sign[0] == '+') {
                            count++;
                            int l = 0;
                            while (sign[l] == '+') l++;

                            for(int k = 0; k < l / 2; k++) {
                                char temp = sign[k];
                                sign[k] = sign[l - k - 1];
                                sign[l - k - 1] = temp;
                            }

                            for (int k = 0; k < l; k++) {
                                sign[k] = sign[k] == '+'? '-' : '+';
                            }
                        }
                        int l = j + 1;
                        for(int k = 0; k < l / 2; k++) {
                            char temp = sign[k];
                            sign[k] = sign[l - k - 1];
                            sign[l - k - 1] = temp;
                        }

                        for (int k = 0; k <= j; k++) {
                            sign[k] = sign[k] == '+'? '-' : '+';
                        }
                    }
                }
                out.write("Case #" + p + ": " + count + "\n");
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println("Error occured : " + e.getMessage());
        }
    }
}
