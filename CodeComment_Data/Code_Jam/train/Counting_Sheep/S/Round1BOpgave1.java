package methodEmbedding.Counting_Sheep.S.LYD1392;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Round1BOpgave1
{

    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new FileInputStream("A-small-attempt0-in.txt"));
            Formatter output = new Formatter("A-small-attempt0-out.txt");
            List<Integer> sheep;
            
            int T = input.nextInt();
            int N;
            int nextN;
            int[] NtoIntArray;
            
            for (int i = 0; i < T; i++)
            {
                N = input.nextInt();
                if (N == 0)
                {
                    output.format("Case #%d: %s \n", i + 1, "INSOMNIA");
                }
                else 
                {
                    sheep = new ArrayList<>();
                    nextN = N;
                    while (sheep.size() < 10)
                    {
                        // convert N to int array
                        char[] NtoCharArray = String.valueOf(nextN).toCharArray();
                        NtoIntArray = new int[NtoCharArray.length];
                        for(int j=0; j<NtoCharArray.length; j++)
                        {
                            NtoIntArray[j] = Integer.parseInt(NtoCharArray[j]+"");
                        }

                        // add digits of N to sheep
                        for (int digit : NtoIntArray)
                        {
                            int k=0;
                            while (k<sheep.size() && !(sheep.get(k)).equals((Integer)digit))
                                k++;
                            if(k==sheep.size())
                                sheep.add(digit);
                        } 
                        if (sheep.size() <10)
                            nextN+=N;
                    }
                    output.format("Case #%d: %s \n", i + 1, nextN+"");
                }
            }

            if (output != null && input != null)
            {
                output.close();
                input.close();
            }

        } catch (FileNotFoundException ex)
        {
            System.err.println("An error has occured.");
            System.exit(1);
        }
    }
}
