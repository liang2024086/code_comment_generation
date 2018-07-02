package methodEmbedding.Revenge_of_the_Pancakes.S.LYD368;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by evis on 16/04/09.
 */
public class ProblemB {
    public static void main(String[] args) throws Exception{
        int T;

        File f = new File("b_small.in");

        Scanner scanner = new Scanner(f);

        PrintWriter writer = new PrintWriter("b_small.txt");

        T = scanner.nextInt();

        String str;
        for(int t=1; t<=T; t++){
            str = scanner.next();
            int cnt = 0;
            char last = '+';
            for(int i=str.length()-1; i>=0; i--){
                if(str.charAt(i) != last){
                    cnt++;
                    last = (last == '+')?'-':'+';
                }
            }
            writer.println("Case #"+t+": "+cnt);
        }
        writer.close();
    }
}
