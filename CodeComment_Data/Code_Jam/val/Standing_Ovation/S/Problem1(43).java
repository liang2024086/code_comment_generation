package methodEmbedding.Standing_Ovation.S.LYD1390;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Problem1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
        int T = Integer.parseInt(input.readLine());
        for (int k = 0; k < T; k++)
        {
            char[] levels = input.readLine().split(" ")[1].toCharArray();
            int friends = 0, standing = Integer.parseInt(Character.toString(levels[0]));
            for (int i = 1; i < levels.length; i++)
            {
                if (standing < i)
                {
                    friends += (i - standing);
                    standing += (i - standing);
                }
                standing += Integer.parseInt(Character.toString(levels[i]));
            }
            output.write("Case #" + (k+1) + ": " + friends + "\n");
        }
        output.close();
    }
}
