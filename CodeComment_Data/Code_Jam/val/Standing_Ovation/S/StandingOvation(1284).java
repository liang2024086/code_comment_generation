package methodEmbedding.Standing_Ovation.S.LYD2053;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("_input.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_output.in"));

        br.readLine();// first line for the case count
        String line = null;
        int index = 0;

        while ((line = br.readLine()) != null) {

            index++;

            char[] input = line.split("\\s")[1].toCharArray();

            int ans = 0;
            int have = 0;

            for (int i = 0; i < input.length; i++) {
                int val = input[i] - '0';
                if (val > 0 && have < i) {
                    ans += i - have;
                    have += ans + val;
                }
                else{
                    have += val;   
                }
            }

            bw.append("Case #" + index + ": " + ans + "\n");
        }

        br.close();
        bw.close();

    }

}
