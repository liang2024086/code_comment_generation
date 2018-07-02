package methodEmbedding.Magic_Trick.S.LYD915;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Beck on 4/11/14.
 */
public class magician
{
    public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(new File("magician.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magician.out")));
        int num = scan.nextInt();
        for(int z = 1;z<=num;z++)
        {
            int firstRow = scan.nextInt();
            int[][] array = new int[4][4];
            for(int r = 0;r<4;r++)
            {
                for(int c = 0;c<4;c++)
                {
                    array[r][c] = scan.nextInt();
                }
            }
            int[] thing = array[firstRow-1];
            int secondRow = scan.nextInt();
            int[][] secondArray = new int[4][4];
            for(int r = 0;r<4;r++)
            {
                for(int c = 0;c<4;c++)
                {
                    secondArray[r][c] = scan.nextInt();
                }
            }
            int[] thing2 = secondArray[secondRow-1];
            int answer = 0;
            Arrays.sort(thing);
            Arrays.sort(thing2);
            //System.out.println(Arrays.toString(thing));
            //System.out.println(Arrays.toString(thing2));
            int count = 0;
            for(int i =0;i<thing.length;i++)
            {
                if(Arrays.binarySearch(thing2,thing[i])>-1)
                {
                    count++;
                    answer = thing[i];
                }
            }
            if(count>1)
            {
                out.println("Case #" + z + ": Bad magician!");
            }
            else if(count==0)
            {
                out.println("Case #" + z + ": Volunteer cheated!");
            }
            else
            {
                out.println("Case #" + z + ": "+answer);
            }
        }
        out.close();
        System.exit(0);
    }
}
