package methodEmbedding.Magic_Trick.S.LYD867;

import java.util.*;
import java.io.*;

public class A
{
    public static void main(String ... orange) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            Set<Integer> ans = new HashSet<Integer>();
            for (int i = 0; i < 16; i++)
                ans.add(i);

            for (int i = 0; i < 2; i++)
            {
                Set<Integer> set = new HashSet<Integer>();
                int row = input.nextInt() - 1;
                for (int j = 0; j < 4; j++)
                    for (int k = 0; k < 4; k++)
                    {
                        int num = input.nextInt() - 1;
                        if (j == row)
                            set.add(num);
                    }
                ans.retainAll(set);
            }

            System.out.printf("Case #%d: ", n + 1);
            if (ans.size() == 0)
                System.out.println("Volunteer cheated!");
            else if (ans.size() == 1)
                for (int num : ans)
                    System.out.println(num + 1);
            else
                System.out.println("Bad magician!");
        }
    }
}
