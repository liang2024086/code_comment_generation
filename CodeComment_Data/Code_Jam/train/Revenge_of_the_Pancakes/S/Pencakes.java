package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1036;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pencakes
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Scanner input = new Scanner(System.in);
  int cases = Integer.parseInt(input.nextLine());

  for(int i=0;i<cases;i++)
  {

    String positions = input.nextLine();
    int len = positions.length();
    int[] arrangement = new int[len];
    int moves = 0,compare = -1;

    for(int j=0;j<len;j++)
    {
      if(positions.charAt(j)=='+')
      {
        arrangement[j] = 1;
      }
    }

    int index = 0;
    compare = arrangement[0];

    while(index<len)
    {
      
      for(int j=index;j<len;j++)
      {
        if(arrangement[j]!=compare)
        {
          index = j;
          moves++;

          compare = arrangement[index];

          break;
        }
        else
        {
          index++;
        }
      }

    }

    if(compare==0)
    {
      moves++;
    }





    System.out.println("Case #"+(i+1)+": "+moves);
  }
    
 }
}

 
