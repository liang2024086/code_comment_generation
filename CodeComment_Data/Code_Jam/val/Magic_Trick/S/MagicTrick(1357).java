package methodEmbedding.Magic_Trick.S.LYD619;

public class MagicTrick
{
      public static void main(String args[])
      {
            In in = new In(args[0]);
            int noOfCases = in.readInt();
            int[] cards1 = new int[16];
            int[] cards2 = new int[16];
            
            for (int i = 0; i < noOfCases; i++)
            {
                  int firstGuess = in.readInt();
                  
                  for (int j = 0; j < 16; j++)
                        cards1[j] = in.readInt();
                  
                  int secondGuess = in.readInt();
                  
                  for (int j = 0; j < 16; j++)
                        cards2[j] = in.readInt();
                  
                  int count = 0;
                  int card = -1;
                  
                  for (int x = (firstGuess - 1) * 4, n = x + 4; x < n; x++)
                        for (int y = (secondGuess - 1) * 4, m = y + 4; y < m; y++)
                              if (cards1[x] == cards2[y])
                              {
                                    card = cards1[x];
                                    count++;
                              }
                  
                  if (count == 0)
                        System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
                  else if (count == 1)
                        System.out.println("Case #" + (i+1) + ": " + card);
                  else
                        System.out.println("Case #" + (i+1) + ": Bad magician!");
            }

      }
}
