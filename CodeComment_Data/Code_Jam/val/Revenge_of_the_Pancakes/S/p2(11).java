package methodEmbedding.Revenge_of_the_Pancakes.S.LYD747;

import java.util.*;

public class p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();

        for (int c = 1; c <= cases; c++)
        {
            int result = 0;
            String line = sc.nextLine();

            char[] pancakes = new char[100];
            for (int i = 0; i < line.length(); i++)
                pancakes[i] = line.charAt(i);

            for (int i = line.length() - 1; i >= 0; i--)
            {
                if (pancakes[i] == '-')
                {
                    result++;
                    Stack<Character> stack = new Stack<Character>();
                    for (int j = 0; j <= i; j++)
                    {
                        stack.push(pancakes[j]);
                    }
                    for (int j = i; j >= 0; j--)
                    {
                        Character out = stack.pop();
                        if (out == '-')
                            out = '+';
                        else
                            out = '-';

                        pancakes[j] = out;
                    }
                }
            }

            System.out.printf("Case #%d: %d\n", c, result);
        }
    }
}
