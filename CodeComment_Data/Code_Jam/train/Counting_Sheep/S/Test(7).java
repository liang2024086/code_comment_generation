package methodEmbedding.Counting_Sheep.S.LYD569;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test
{
  public static void main(String[] args) 
  {
	  
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int inputCount = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    
    for (int i = 1; i <= inputCount; ++i) 
    {
      int n = in.nextInt();
//      int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      Set<Integer> set = new HashSet<Integer>();
      set.add(0);
      set.add(1);
      set.add(3);
      set.add(4);
      set.add(5);
      set.add(6);
      set.add(7);
      set.add(8);
      set.add(9);
      
      for (int index = 1; index < 100; index++)
      {
    	  int num = index * n;
    	  int temp = num;
    	  while (temp > 0)
    	  {
    		  int digit = (temp % 10);
//    		  System.out.println(num +" :: " + temp + " ::: " +  digit);
    		  temp = temp / 10;
    		  set.remove(digit);
    		  if (set.size() == 0)
    		  {
    			  System.out.println("Case #" + i + ": " + num);
    			  index = 100;
    			  break;
    		  }	  
    	  }
      }
      if (set.size() > 0)
      {
    	  System.out.println("Case #" + i + ": INSOMNIA");
      }
      
      
    }
  }
}
