package methodEmbedding.Magic_Trick.S.LYD937;

import java.io.*;
import java.util.*;
public class Magician
{
    public static void main (String[] args) throws FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(new File("inputs.txt"));
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            while(scanner.hasNextInt()){
                a.add(scanner.nextInt());
            }
            scanner.close();
        }
        sc.close();
        int numIterations = a.get(0);
        a.remove(0);
        ArrayList<String> result = new ArrayList<String>();
        String failMagic = "Bad magician!";
        String failVolunteer = "Volunteer cheated!";
        String tempString = "";
        for(int i = 0; i < numIterations; i++)
        {
            int arrayOne[][] = new int[4][4];
            int arrayTwo[][] = new int[4][4];
            int arrayChosenOne[] = new int[4];
            int arrayChosenTwo[] = new int[4];
            int counter = 0;
            int userIn1 = a.get(0);
            int userIn2 = a.get(17);
            for (int r = 0; r <4; r++)
            {
                for (int c = 0; c <4; c++)
                {
                    arrayOne[r][c] = a.get(4*r+c+1);
                }
            }
            for (int r = 0; r <4; r++)
            {
                for (int c = 0; c<4; c++)
                {
                    arrayTwo[r][c] = a.get(4*r+c+18);
                }
            }
            for(int j = 0; j<4; j++)
            {
                arrayChosenOne[j] = arrayOne[userIn1 - 1][j];
               // System.out.println(arrayChosenOne[j]);
            }
            for (int k = 0; k<4; k++)
            {
                arrayChosenTwo[k] = arrayTwo[userIn2 - 1][k];
                //System.out.println(arrayChosenTwo[k]);
            }
            for (int q = 0; q < 4; q++)
            {
                for(int w = 0; w < 4; w++)
                {
                    if(arrayChosenOne[q] == arrayChosenTwo[w])
                    {
                        counter++;
                        if(counter == 1)
                        {
                            tempString = String.valueOf(arrayChosenOne[q]);
                        }
                    }

                }
            }
            if(counter == 0)
            {
                result.add("Case #" + (i+1) +": " + failVolunteer);
            }
            else
            {
                if(counter > 1)
                {
                    result.add("Case #" + (i+1) +": " + failMagic);
                }
                else
                {
                    if (counter == 1)
                    {
                        result.add("Case #" + (i+1) +": " + tempString);
                    }
                }
            }
           for(int p = 0; p < 34; p++)
           {
               a.remove(0);
           }
        }
       FileWriter writer = new FileWriter("outputs.txt");
       for (String str: result)
       {
           writer.write(str + "\r\n");
       }
       writer.close();
    }
}
