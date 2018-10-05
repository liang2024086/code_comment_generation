package methodEmbedding.Magic_Trick.S.LYD930;

import java.util.*;
import java.io.*;

public class MagicTrick
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int T = s.nextInt();
      
      for(int i = 1; i<=T; i++)
      {
         int row1 = s.nextInt();
         ArrayList<Integer> cards = new ArrayList<Integer>(4);
         for(int j = 1; j < 5; j++)
         {
            for(int k = 1; k < 5; k++)
            {
               int num = s.nextInt();
               if(j == row1)
               {
                  cards.add(num);
               }
            }
         }
         
         int row2 = s.nextInt();
         ArrayList<Integer> cards2 = new ArrayList<Integer>(4);
         
         for(int j = 1; j < 5; j++)
         {
            for(int k = 1; k < 5; k++)
            {
               int num = s.nextInt();
               if(j == row2)
               {
                  if(cards.contains(num))
                  {
                     cards2.add(num);
                  }
               }
            }
         }
         
         if(cards2.size()==0)
            System.out.printf("Case #%d: Volunteer cheated!\n", i);
         else if(cards2.size()==1)
            System.out.printf("Case #%d: %d\n", i, cards2.get(0));
         else
            System.out.printf("Case #%d: Bad magician!\n", i);
         
      }
   }
}
