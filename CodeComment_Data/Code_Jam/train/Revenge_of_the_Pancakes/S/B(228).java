package methodEmbedding.Revenge_of_the_Pancakes.S.LYD961;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by iv on 09-Apr-16.
 */
public class B {
    public static void main(String [ ] args) throws Exception
    {
        String caseName = "B-small-attempt0";
        File in = new File("F:\\Education\\code jam\\2016\\solution\\in\\" + caseName + ".in");
        FileWriter out = new FileWriter("F:\\Education\\code jam\\2016\\solution\\out\\" + caseName + ".out");
        Scanner input = new Scanner(in);
        int numCases = input.nextInt();
        input.nextLine();
        for (int n = 0; n < numCases; n++)
        {
            int sum = 0;
            String pancakesStack = input.nextLine();
            char prev = pancakesStack.charAt(0);
            for(int i = 1; i < pancakesStack.length();++i){
                char cake = pancakesStack.charAt(i);
                if(cake != prev) sum++;
                prev = cake;
            }
            if(pancakesStack.charAt(pancakesStack.length()-1) == '-') sum++;

            String outs ="Case #" + (n+1) + ": " +  sum + "\n";
            out.write(outs);
            System.out.printf(outs);

        }
        input.close();
        out.close();
    }
}
