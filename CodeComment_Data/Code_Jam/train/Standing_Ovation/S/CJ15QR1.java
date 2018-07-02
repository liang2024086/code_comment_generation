package methodEmbedding.Standing_Ovation.S.LYD1327;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CJ15QR1 {
    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader("C:\\Users\\Faheem\\Desktop\\input.txt"));
        int cases=Integer.parseInt(in.readLine());
        int[] ans = new int[cases];
        String m; int temp = 0;
        
        for (int i = 0; i < cases; i++) {
            m = in.readLine();
            String[] k = m.split(" ");
            int max = Integer.parseInt(k[0]);
            temp = Integer.parseInt(k[1]);
            int[] vals = new int[max+1];
            for (int j = max; j > -1; j--) {
                vals[j] = temp%10;
                temp = temp/10;
            }
            int tempCount = 0;
            ans[i] = 0;
            for (int j = 0; j < max+1; j++) {
                if (tempCount<j) {
                    ans[i] += j-tempCount;
                    tempCount = j + vals[j];
                }
                else{
                    tempCount+=vals[j];
                }
            }
        }
        PrintWriter outp = new PrintWriter(new FileWriter("C:\\Users\\Faheem\\Desktop\\Output.txt"));

        for (int i = 0; i < cases; i++) {
            outp.println("Case #" + (i + 1) + ": "+ans[i]);
            System.out.println("Case #" + (i + 1) + ": "+ans[i]);
            
        }
        outp.close();
        
        
    }
}
