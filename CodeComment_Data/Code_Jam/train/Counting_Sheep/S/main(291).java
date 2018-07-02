package methodEmbedding.Counting_Sheep.S.LYD1214;

import java.util.*;
import java.io.*;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    if(T>=1&&T<=100){
    for (int i = 1; i <= T; ++i) {
    	boolean arr[]=new boolean[10];
    	int x=1;
    	int N = in.nextInt();
    	int n=N;
    	int counter=0;
    	if(N>=0&&N<=200)
    	{
    	if(N!=0){
    	
    	while(true)
    	{ 
    		counter++;
      String number = String.valueOf(n);

      char[] digits1 = number.toCharArray();
      for(int j=0;j<digits1.length;j++)
      {
    	  arr[Character.getNumericValue(digits1[j])]=true;
      }
      int count=0;
      for(int j=0;j<10;j++)
      {
    	  if(arr[j]==true)
    		  count++;
      }
      if(count==10||counter>=1000)
    	  break;
      x++;
      n=N*x;
    	}
    	}
    	}
    	System.out.print("Case #"+i+": ");
    	if(n==0||counter>=1000)
    		System.out.println("INSOMNIA");
    	else
    		System.out.println(n);
    }
    }
  }
}
