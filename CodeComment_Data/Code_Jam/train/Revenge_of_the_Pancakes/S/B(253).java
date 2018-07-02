package methodEmbedding.Revenge_of_the_Pancakes.S.LYD315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B
{
    public static void main(String args[])
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        try
        {
            int testCases = Integer.parseInt(br.readLine());

            for (int testCase = 1; testCase <= testCases; ++testCase)
            {
                String s = br.readLine();
                Stack<Character> stack = new Stack<>();

                for (int curr = s.length() - 1; curr >= 0; --curr)
                    stack.add(s.charAt(curr));

                int numberOfFlips = 0;
                for (;true; ++numberOfFlips)
                {
                    StringBuilder popped = new StringBuilder();

                    char start = stack.pop();
                    popped.append(start);
                    while (stack.size() != 0)
                    {
                        if (stack.peek() == start)
                            popped.append(stack.pop());
                        else
                            break;
                    }

                    // At this point, we've reached the max we can pop, so we now we flip and add them back in
                    for (int i = popped.length() - 1; i >= 0; --i)
                    {
                        if (popped.charAt(i) == '+')
                            stack.push('-');
                        else
                            stack.push('+');
                    }

                    // Check for ending condition
                    if ((popped.length() == s.length()) && (start == '+'))
                        break;

                } // End of iterating through pancake flipping

                // Output
                String output = String.format("Case #%d: %d\n", testCase, numberOfFlips);
                out.append(output);
            } // End of iterating through all test cases

			System.out.print(out);
        }
        catch (IOException e)
        {e.printStackTrace();}
    } // End of the main method
} // End of the main class
