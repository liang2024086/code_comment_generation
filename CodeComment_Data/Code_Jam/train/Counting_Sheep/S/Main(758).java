package methodEmbedding.Counting_Sheep.S.LYD839;

import java.util.*;
import java.io.*;
public class Main 
{	
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    String digits = "0123456789";
    String remainingDigits=""; 
    
    int number = 0; //number choosen by Bleatrix Trotter
    int multiple = 1; //maintain multiple count
    int numberMultiple = 0; // numberMultiple = multiple * number
    String numberMultipleString=""; //contains string value of numberMultiple

    for (int i = 1; i <= t; ++i)
    {
      //We are looking for digits from 0 to 9.
      remainingDigits = digits;
      number = in.nextInt();
      
      //only for the number 0 the program would go into an infinite loop
      if(number==0)
      {
    	  System.out.println("Case #"+i+": INSOMNIA");
    	  continue;
      }
      
      //initialize multiple to 1
      multiple = 1;
      
      //If there are no digits remaining for us to lookout for we have got our answer
      while(remainingDigits.length()>0)
      {
    	  numberMultiple = multiple * number;
    	  numberMultipleString = String.valueOf(numberMultiple);
    	  
    	  while(numberMultipleString.length()>0&&remainingDigits.length()>0)
    	  {
    		char c = numberMultipleString.charAt(0);
    		
			remainingDigits = remainingDigits.replace(String.valueOf(c), "");
			numberMultipleString = numberMultipleString.replaceAll(String.valueOf(c), "");

    	  }
    	  
    	  multiple++;
      }
      
      System.out.println("Case #"+i+": "+numberMultiple);
      
    }
    in.close();
  }
}
