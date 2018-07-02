package methodEmbedding.Magic_Trick.S.LYD876;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int nbTests = scan.nextInt();
        for (int test = 0; test < nbTests; test++)
        {
            int answer1 = scan.nextInt()-1;
            int[][] table1 = new int[4][4];
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    table1[i][j] = scan.nextInt();
            int answer2 = scan.nextInt()-1;
            int[][] table2 = new int[4][4];
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    table2[i][j] = scan.nextInt();
            
            int found = -1;
            for(int i = 0; i < 4; i++)
            {
                boolean inSecond = false;
                for(int j = 0; j < 4 && !inSecond; j++)
                    if(table2[answer2][j] == table1[answer1][i])
                        inSecond = true;
                if(inSecond)
                {
                    if(found == -1)
                        found = table1[answer1][i];
                    else
                    {
                        found = -2;
                        break;
                    }
                }
            }
            
            System.out.print("Case #"+(test+1)+": ");
            if(found == -2)
                System.out.println("Bad magician!");
            else if(found == -1)
                System.out.println("Volunteer cheated!");
            else
                System.out.println(found);
        }
    }
}
