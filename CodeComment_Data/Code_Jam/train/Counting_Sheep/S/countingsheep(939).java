package methodEmbedding.Counting_Sheep.S.LYD564;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class countingsheep
{
	int count=0;
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner in = new Scanner(System.in);
	   int testcases; 
	   testcases = in.nextInt();int hash = testcases+1;
	   while(testcases>0){
	   int[] answer = new int[10];
	   int N; int count=10;
	   N = in.nextInt();
	   if(N==0){
	   	System.out.println("Case #"+(hash-testcases)+":  INSOMNIA");testcases--;continue;
	   }
	   int var=0; int i=1;String str; int val;
	   while(count>0){
	   		var = i*N;
	   		str = Integer.toString(var);
	   		for(int j=0;j<str.length();j++){
	   			val = str.charAt(j)-48;
	   			if(answer[val]==0){
	   				answer[val]=-1; count--;
	   			}
	   		}
	   		i+=1;
	   }
	  System.out.println("Case #"+(hash-testcases)+":  "+var);
	   testcases--;
	}
	}
}
