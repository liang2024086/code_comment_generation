package methodEmbedding.Magic_Trick.S.LYD1835;

import java.util.*;

class Magic
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    TreeSet<Integer> set = new TreeSet<Integer>();
    TreeSet<Integer> set2 = new TreeSet<Integer>();

    int cases = scan.nextInt();
    int[][] matrix = new int[4][4];
    int guess = 0;

    for(int x = 1; x <= cases; x++)
    {
      guess = scan.nextInt();

      for(int i = 0; i < 4; i++)
        for(int j = 0; j < 4; j++)
          matrix[i][j] = scan.nextInt();

      for(int i = 0; i < 4; i++)
        set.add(matrix[guess-1][i]);
      
      guess = scan.nextInt();

      for(int i = 0; i < 4; i++)
        for(int j = 0; j < 4; j++)
          matrix[i][j] = scan.nextInt();

      for(int i = 0; i < 4; i++)
        if(!set.add(matrix[guess-1][i]))
          set2.add(matrix[guess-1][i]);

      System.out.print("Case #" + x + ": ");

      if(set2.size() == 1)
        System.out.println(set2.first());
      else if(set2.size() == 0)
        System.out.println("Volunteer cheated!");
      else
        System.out.println("Bad magician!");

      set.clear();
      set2.clear();
    }
  }
}
