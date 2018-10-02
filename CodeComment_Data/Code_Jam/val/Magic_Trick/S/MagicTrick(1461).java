package methodEmbedding.Magic_Trick.S.LYD470;

import java.io.*;
import java.util.*;
public class MagicTrick
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(new File("input.in"));
      PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
      int N = sc.nextInt();
      for(int x = 0; x < N; x++)
      {
         int row1 = sc.nextInt()-1;
         int[][] arr1 = new int[4][4];
         for(int y = 0; y < 4; y++)
            for(int z = 0; z < 4; z++)
               arr1[y][z] = sc.nextInt();
         
         int row2 = sc.nextInt()-1;
         int[][] arr2 = new int[4][4];
         for(int y = 0; y < 4; y++)
            for(int z = 0; z < 4; z++)
               arr2[y][z] = sc.nextInt();
         
         Set<Integer> s1 = new HashSet<Integer>();
         Set<Integer> s2 = new HashSet<Integer>();
         for(int y = 0; y < 4; y++)
         {
            s1.add(arr1[row1][y]);
            s2.add(arr2[row2][y]);
         }
         s1.retainAll(s2);
         out.print("Case #" + (x+1) + ": ");
         if(s1.size() > 1)
            out.println("Bad magician!");
         else if(s1.size() == 0)
            out.println("Volunteer cheated!");
         else
         {
            String s = s1.toString();
            out.println(s.substring(1,s.length()-1));
         }
      }
   }
}
