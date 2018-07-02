package methodEmbedding.Speaking_in_Tongues.S.LYD413;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class GJ_QR_A {


    public static void main(String[] args) throws NumberFormatException, IOException {
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(new FileInputStream("A-small-attempt0.in")));
        java.io.BufferedWriter stdout = new java.io.BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-small-attempt0.out")));
        int T = Integer.parseInt(stdin.readLine());
        int[] map = new int[]{24, 7, 4,18,14, 2,21,23, 3,20, 8, 6,11, 1,10,17,25,19,13,22, 9,15, 5,12, 0,16};
        
        for (int ii=0; ii<T; ii++){
            String str = stdin.readLine();
            stdout.write("Case #" + (1+ii)+": " );
            for(int j=0; j<str.length(); j++){
                char ch= str.charAt(j);
                if (ch !=' ')
                    ch = (char)(map[ch-'a']+'a');
                stdout.write(ch);
            }
            stdout.write('\n');
        }
        stdout.close();
    }

}
