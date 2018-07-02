package methodEmbedding.Magic_Trick.S.LYD2155;

import java.awt.*;
import java.util.*;
import java.io.*;
public class Magic
{
    public static void main (String[]args) throws Exception
    {
        Scanner in = new Scanner (new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
        int numTimes = in.nextInt();
        for (int p = 0; p<numTimes;p++)
        {
            ArrayList<Integer> num1 = new ArrayList<Integer>();
            ArrayList<Integer> num2 = new ArrayList<Integer>();
            int row = in.nextInt();
            String temp;
            String rowNum;
            for (int x= 0; x<row;x++)
            {
                in.nextLine();
            }
            for (int x = 0; x<4;x++)
            {
                num1.add(in.nextInt());
            }
            for (int x=0;x<5-row;x++)
            {
                in.nextLine();
            }
            row = in.nextInt();
            for (int x= 0; x<row;x++)
            {
                in.nextLine();
            }
            for (int x = 0; x<4;x++)
            {
                num2.add(in.nextInt());
            }
            for (int x=0;x<5-row;x++)
            {
                in.nextLine();
            }
            int z = 0;
            String cas = "";
            String num = "";
            for (int x = 0; x<num1.size();x++)
            {
                for (int y = 0; y< num2.size();y++)
                {
                    if (num1.get(x)==num2.get(y))
                    {
                        num = num1.get(x)+"";
                        z++;
                    }
                }
            }
            int k = p+1;
            if (p<numTimes-1)
            {
                if(z==0)
                {
                    out.println ("Case #"+k+": Volunteer cheated!");
                }
                if (z>1)
                {
                    out.println ("Case #"+k+": Bad magician!");
                }
                if (z==1)
                {
                    out.println ("Case #"+k+": "+num);
                }
            }
            else
            {
                if(z==0)
                {
                    out.print ("Case #"+k+": Volunteer cheated!");
                }
                if (z>1)
                {
                    out.print ("Case #"+k+": Bad magician!");
                }
                if (z==1)
                {
                    out.print ("Case #"+k+": "+num);
                }
            }

        }
        out.close();
    }
}
