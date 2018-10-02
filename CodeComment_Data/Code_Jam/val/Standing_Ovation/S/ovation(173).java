package methodEmbedding.Standing_Ovation.S.LYD1423;

import java.io.*;
import java.util.*;

public class ovation
{
   public static void main(String[] args) throws Exception
   {
      Scanner sc = new Scanner(new File("ovation.in"));
      int N = sc.nextInt();
      PrintStream outfile = new PrintStream(new FileOutputStream("ovation.out"));
      for(int x = 0; x < N; x++)
      {
         String s = sc.nextLine();
         String[] arr;
         if(s.equals(""))
            arr = sc.nextLine().split(" ");
         else
            arr = s.split(" ");
         int largest = Integer.parseInt(arr[0])+1;
         int[] nums = new int[largest];
         for(int y = 0; y < largest; y++)
            nums[y] = Integer.parseInt(arr[1].charAt(y)+"");
         int friends = 0;
         int current = 0;
         for(int y = 0; y < largest; y++)
         {
            if(current >= y)
               current += nums[y];
            else if(nums[y] != 0)
            {
               int add = y - current;
               current += add + nums[y];
               friends += add;
            }
         }
         outfile.println("Case #" + (x+1) + ": " + friends);
         System.out.println("Case #" + (x+1) + ": " + friends);
      }
      outfile.close();
      System.exit(0);
   }
}
