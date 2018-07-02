package methodEmbedding.Magic_Trick.S.LYD1763;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class A
{

   public static void main(String[] args) throws FileNotFoundException
   {
      System.setOut(new PrintStream(new File("small.out")));
      Scanner scan = new Scanner(new File("small.in"));

      int numCases = scan.nextInt();
      for (int z = 1; z <= numCases; z++)
      {
         int [][] grid1 = new int[4][4];
         int [][] grid2 = new int[4][4];
         int row1 = scan.nextInt() - 1;
         for (int i = 0; i < 4; i++)
         {
            for (int j = 0; j < 4; j++)
            {
               grid1[i][j] = scan.nextInt();
            }
         }
         int row2 = scan.nextInt() - 1;
         for (int i = 0; i < 4; i++)
         {
            for (int j = 0; j < 4; j++)
            {
               grid2[i][j] = scan.nextInt();
            }
         }
         
         boolean[] possible = new boolean[17];
         Arrays.fill(possible, true);
         for (int i = 0; i < 4; i++)
         {
            for (int j = 0; j < 4; j++)
            {
               if (i != row1)
               {
//                  System.out.println(grid1[i][j]);
                  possible[grid1[i][j]] = false;
               }
            }
         }

//         System.out.println("");
         for (int i = 0; i < 4; i++)
         {
            for (int j = 0; j < 4; j++)
            {
               if (i != row2)
               {
//                  System.out.println(grid1[i][j]);
                  possible[grid2[i][j]] = false;
               }
            }
         }
         
         int numTrue = 0;
         int numberTrue = 0;
         for (int i = 1; i <= 16; i++)
         {
            if (possible[i])
            {
               numTrue++;
               numberTrue = i;
            }
         }
         
         if (numTrue == 0)
         {
            System.out.println("Case #" + z + ": Volunteer cheated!");
         }
         else if (numTrue == 1)
         {
            System.out.println("Case #" + z + ": " + numberTrue);
         }
         else
         {
            System.out.println("Case #" + z + ": Bad magician!");
         }
      }

      scan.close();
   }

}

