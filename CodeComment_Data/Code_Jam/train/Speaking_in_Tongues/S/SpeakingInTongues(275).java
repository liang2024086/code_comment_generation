package methodEmbedding.Speaking_in_Tongues.S.LYD1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SpeakingInTongues
{

    private static HashMap<Character, Character> charMap = new HashMap<Character, Character>();

    static
    {
        charMap.put(' ', ' ');
        charMap.put('y', 'a');
        charMap.put('n', 'b');
        charMap.put('f', 'c');
        charMap.put('i', 'd');
        charMap.put('c', 'e');
        charMap.put('w', 'f');
        charMap.put('l', 'g');
        charMap.put('b', 'h');
        charMap.put('k', 'i');
        charMap.put('u', 'j');
        charMap.put('o', 'k');
        charMap.put('m', 'l');
        charMap.put('x', 'm');
        charMap.put('s', 'n');
        charMap.put('e', 'o');
        charMap.put('v', 'p');
        charMap.put('z', 'q');
        charMap.put('p', 'r');
        charMap.put('d', 's');
        charMap.put('r', 't');
        charMap.put('j', 'u');
        charMap.put('g', 'v');
        charMap.put('t', 'w');
        charMap.put('h', 'x');
        charMap.put('a', 'y');
        charMap.put('q', 'z');
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount;
        try
        {
            String input = IN.readLine();
            testCaseCount = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            testCaseCount = 0;
        }

        if (testCaseCount > 0)
        {
            String[] lines = new String[testCaseCount];
            for (int i = 0; i < testCaseCount; i++)
            {
                lines[i] = IN.readLine();
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < testCaseCount; i++)
            {
                sb.setLength(0);
                sb.append("Case #").append(i + 1).append(": ");
                for (int j = 0; j < lines[i].length(); j++)
                {
                    sb.append(charMap.get(lines[i].charAt(j)));
                }
                System.out.println(sb.toString());
            }
        }
    }

}
