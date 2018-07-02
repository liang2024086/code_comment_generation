package methodEmbedding.Standing_Ovation.S.LYD1741;



import java.io.*;
import java.util.*;
/**
 *
 * @author Joseph N. Nwabueze
 */
public class StandingOvationPrintOutput {

     public static void main(String args[]) throws IOException {
        PrintWriter writer = new PrintWriter(new File ("Output.txt"));
        Scanner s = new Scanner(new File("a.in"));
        int T = s.nextInt();
        for(int i = 0; i < T ; i++){
            int S_max = s.nextInt();
            int[] a = new int[S_max + 1];
            int x = s.nextInt();
            for(int j = S_max + 1; j > 0; j--){
                a[j - 1] = (int)(x % 10);
                x = (int)(x / 10);
            }
            int st = 0;
            int f = 0;
            for(int k = 0; k < S_max + 1; k++){
                st = st + a[k];
                if(st < (k + 1)){
                    f = f +((k+1) - st);
                    st = st + ((k+1) - st);
                }
            }
            writer.println("Case #" + (i + 1) + ": " + f);
        }
        writer.close();
    }
}
