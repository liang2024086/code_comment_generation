package methodEmbedding.Magic_Trick.S.LYD200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MagicTrick
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int k = 0; k < number; k++)
        {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int first = sc.nextInt();
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    int num = sc.nextInt();
                    if (i == (first - 1))
                    {
                        // System.out.println(num);
                        map.put(num, 1);
                    }

                }
            }
            ArrayList<Integer> answers = new ArrayList<Integer>();
            int second = sc.nextInt();
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    int cur = sc.nextInt();
                    if (i == (second - 1))
                    {
                        if (map.get(cur) != null && map.get(cur) == 1)
                        {
                            answers.add(cur);
                        }
                    }
                }
            }

            int size = answers.size();
            System.out.printf("Case #%d: ", k + 1);
            if (size == 0)
            {
                System.out.println("Volunteer cheated!");
            }
            else if (size > 1)
            {
                System.out.println("Bad magician!");
            }
            else
            {
                System.out.println(answers.get(0));
            }

        }

    }
}
