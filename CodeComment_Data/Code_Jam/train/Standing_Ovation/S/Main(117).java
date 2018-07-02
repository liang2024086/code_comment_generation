package methodEmbedding.Standing_Ovation.S.LYD1198;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int t = Integer.parseInt(in.readLine());
        for(int l = 1; l <= t; l++){
            String[] line = in.readLine().split(" ");
            int n  = Integer.parseInt(line[0]);
            int[] aa = new int[n + 1];
            int[] bb = new int[n + 1];
            aa[0] = Character.getNumericValue(line[1].charAt(0));
            for(int i = 1; i <= n; i++){
                aa[i] = Character.getNumericValue(line[1].charAt(i));
                bb[i] = aa[i - 1] + bb[i - 1];
            }
            int countAdded = 0;
            for(int i = 0; i <= n; i++){
                while(bb[i] < i){
                    countAdded++;
                    for(int k = i - 1; k <= n; k++){
                        bb[k]++;
                    }
                }
            }
            out.println("Case #" + l + ": " + countAdded);
        }
        out.close();
    }
}
