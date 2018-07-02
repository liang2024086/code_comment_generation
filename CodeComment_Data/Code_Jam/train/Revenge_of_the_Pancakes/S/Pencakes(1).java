package methodEmbedding.Revenge_of_the_Pancakes.S.LYD558;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pencakes
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
	String filename = args[0];
	String filename2 = args[1];
	File fileIn = new File(filename);
	File fileout = new File(filename2);
	Scanner input = new Scanner(fileIn);
	int cases = input.nextInt();
	BufferedWriter writer = new BufferedWriter(new FileWriter(fileout));
	
  for(int i=0;i<cases;i++)
  {

    String positions = input.next();
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
    String out = "Case #"+(i+1)+": "+moves;
    writer.write(out);
	if(i+1 != cases)
		writer.newLine();
    //System.out.println("Case #"+(i+1)+": "+moves);
  }
  input.close();
  writer.close();
  
    
 }
}

 
