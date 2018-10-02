package methodEmbedding.Magic_Trick.S.LYD1525;

import java.io.*;
import java.util.*;
public class MagicTrick
{
  public static void main(String[] args) throws Exception
  {
    Scanner in = new Scanner(new File("A-small-attempt0.in"));
    PrintStream out
     = new PrintStream("A-small-practice-out");
    int cases = in.nextInt();
    for (int caseNum =0; caseNum<cases;caseNum++)
    {
      int answer1 = in.nextInt()-1;
      int[][] board1 =new int[4][4];
      // int[x][y] or int[col][row]
      for (int row=0;row<4;row++)
        for (int col=0;col<4;col++)
          board1[row][col] = in.nextInt();
      // read board 2      
      int answer2 = in.nextInt()-1;
      int[][] board2 =new int[4][4];
      // int[x][y]
      for (int row=0;row<4;row++)
        for (int col=0;col<4;col++)
          board2[row][col] = in.nextInt();
      // finished reading.
      // find whats in answer row in board1
      List<Integer> answerRow1 = new ArrayList<Integer>();
      for (int item=0;item<4;item++)
        answerRow1.add(new Integer(board1[answer1][item]));

      // find what is in the second board
      List<Integer> answerRow2 = new ArrayList<Integer>();
      for (int item=0;item<4;item++)
        answerRow2.add(new Integer(board2[answer2][item]));

      // find out whats in both.
      List<Integer> ans = new ArrayList<Integer>();
      for (Integer i: answerRow1)
        //if (answer2.contains(i))  java :))
        for (int j=0;j<4;j++)
          if(answerRow2.get(j).equals(i))
            ans.add(i);

      for (int i: ans)
        System.err.println("Debug: " + i);
      System.err.println("---");
      out.print("Case #" + (caseNum+1)+": ");
      if (ans.size()==1)
        out.println(ans.get(0));
      else if (ans.size()==0)
        out.println("Volunteer cheated!");
      else
        out.println("Bad magician!");
    } // cases
      out.close();
      in.close();
  }
}
