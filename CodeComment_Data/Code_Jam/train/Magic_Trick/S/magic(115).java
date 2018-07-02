package methodEmbedding.Magic_Trick.S.LYD687;

import java.util.*;
import java.io.*;

public class magic
{
    public static void main(String[] args) throws Exception
    {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("magic.in"));

        int n = in.nextInt();

        for(int i = 1; i <= n; i++)
        {
            int first = in.nextInt() - 1;

            int[][] one = new int[4][4];
            for(int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    one[j][k] = in.nextInt();

            int[] possible = new int[4];
            for(int j = 0; j < 4; j++)
                possible[j] = one[first][j];

            //System.out.println(Arrays.toString(possible));

            int second = in.nextInt() - 1;

            int[][] two = new int[4][4];
            for(int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    two[j][k] = in.nextInt();

            int[] possible2 = new int[4];
            for(int j = 0; j < 4; j++)
                possible2[j] = two[second][j];

            //System.out.println(Arrays.toString(possible2));

            int counter = 0;
            int[] ans = new int[4];
            for(int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    if(possible2[j] == possible[k])
                    {
                        //System.out.println("hey");
                        ans[0] = possible2[j];
                        counter++;
                    }

            if(counter == 1)
                System.out.println("Case #" + i + ": " + ans[0]);
            else if(counter == 0)
                System.out.println("Case #" + i + ": Volunteer cheated!");
            else
                System.out.println("Case #" + i + ": Bad magician!");

        }
    }
}
