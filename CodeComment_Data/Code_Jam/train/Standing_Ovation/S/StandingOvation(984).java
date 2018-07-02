package methodEmbedding.Standing_Ovation.S.LYD1288;

import java.io.*;

public class StandingOvation
{
    public static void main(String[] args) throws IOException
    {
        int numTests;
        String buffer;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        buffer = reader.readLine();
        numTests = Integer.parseInt(buffer);

        for (int t = 1; t <= numTests; t++)
        {
            int totalStanding = 0, totalAdded = 0;
            int[] arr;
            buffer = reader.readLine();
            String[] bufferArr = buffer.split(" ");

            arr = new int[Integer.parseInt(bufferArr[0]) + 1];
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = Integer.parseInt(bufferArr[1].substring(i, i + 1));
            }

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] != 0)
                {
                    if (totalStanding >= i)
                        totalStanding += arr[i];
                    else {
                        do {
                            totalStanding++;
                            totalAdded++;
                        }
                        while (totalStanding < i);
                        totalStanding += arr[i];
                    }
                }
            }

            System.out.println("Case #" + t + ": " + totalAdded);
        }
    }
}
