package methodEmbedding.Standing_Ovation.S.LYD802;

import java.util.*;
import java.io.*;
public class JavaApplication2 {
    public static void main(String[] args) throws FileNotFoundException {
        File a = new File("A-small-attempt0.in");
        File b = new File("A-small-attempt0.out");
        Scanner in = new Scanner(a);
        PrintWriter out = new PrintWriter(b);
        int V[] = new int [1005], Smax, p = 0, k;
        String S;
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            p = 0;
            k = 0;
            Smax = in.nextInt();
            S = in.nextLine();
            for(int j = 0; j < S.length() - 1; j++){
                V[j] = (int)S.charAt(j+1) - 48;
            }
            p = V[0];
            for(int j = 1; j < S.length() - 1; j++){
                if(V[j] != 0){
                    if(p < j){
                        k = k + j - p;
                        p = j;
                    }
                }
                p += V[j];
            }
            out.println("Case #" + (i + 1) + ": " + k);
        }
        out.close();
    }
}
