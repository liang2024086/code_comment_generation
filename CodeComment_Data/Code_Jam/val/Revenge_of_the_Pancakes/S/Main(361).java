package methodEmbedding.Revenge_of_the_Pancakes.S.LYD924;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ?????? on 09.04.2016.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int nCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nCases; i++)
        {
            String[] ss = sc.nextLine().split("");
            System.out.print("Case #" + String.valueOf(i + 1) + ": ");
            int count = 0;
            LinkedList<String> stack = new LinkedList<String>();
            for (int j = 0; j < ss.length; j++)
            {
                stack.add(ss[j]);
            }
            char c;
            while (!stack.isEmpty())
            {
                c = stack.get(0).charAt(0);
                while (!stack.isEmpty() && stack.get(0).charAt(0) == c)
                    stack.remove();
                if (!stack.isEmpty())
                {
                    count++;
                }
                else
                {
                    if (c == '-')
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
