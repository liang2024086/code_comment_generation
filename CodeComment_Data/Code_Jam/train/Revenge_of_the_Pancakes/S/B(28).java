package methodEmbedding.Revenge_of_the_Pancakes.S.LYD641;

import java.util.*;
import java.io.*;

public class B
{
    public static void main(String args[]) throws Exception
    {
        File file = new File("C:\\Users\\charafi\\IdeaProjects\\untitled\\src\\B.in");
        PrintWriter writer = new PrintWriter("C:\\Users\\charafi\\IdeaProjects\\untitled\\src\\B.out", "UTF-8");
        Scanner input = new Scanner(file);
        int numCases = input.nextInt();
        String S = input.nextLine();
        for (int n = 0; n < numCases; n++) {
            S = input.nextLine();
            System.out.println(S+" "+S.length());
            char pre;
            pre = S.charAt(0);
            int t;
            if (pre=='+'){
                t=0;
            }
            else
            { t=1;}
            System.out.println(""+pre+" "+ t);
            for (int i = 1; i < S.length(); i++) {
                if((S.charAt(i) != pre) && (S.charAt(i) == '-'))
                {
                    t=t+2;
                }
                System.out.println(""+pre+" "+S.charAt(i)+" "+ t);
                pre=S.charAt(i);

            }
            System.out.println("c:"+t);
            writer.printf("Case #%d: %d\n", n + 1,t);
        }
        writer.close();
    }
}
