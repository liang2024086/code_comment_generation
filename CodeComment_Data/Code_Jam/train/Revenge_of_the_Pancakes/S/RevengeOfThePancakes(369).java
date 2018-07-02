package methodEmbedding.Revenge_of_the_Pancakes.S.LYD459;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevengeOfThePancakes {
    
    public static void main(String[] args) throws Exception {
        File inputFile = new File("B-small-attempt0.in");
        Scanner in = new Scanner(inputFile);
        File outputFile = new File("output.txt");
        PrintWriter out = new PrintWriter(outputFile);

        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            String s = in.next()+"+";
            int answer = 0;
            for (int i=1; i<s.length(); i++) {
                if (s.charAt(i-1) != s.charAt(i)) {
                    answer++;
                }
            }
            out.println("Case #"+(t+1)+": "+answer);
        }

        out.close();
    }
    
}
