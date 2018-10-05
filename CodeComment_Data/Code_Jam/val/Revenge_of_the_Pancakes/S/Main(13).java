package methodEmbedding.Revenge_of_the_Pancakes.S.LYD376;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int t=1;t<=n;t++){
		String s= sc.next();
		char c= s.charAt(0);
		int count=1;
		for ( int i=0; i<s.length();i++){
			if(s.charAt(i)!=c){
			count++;
			c=s.charAt(i);}
		}
		if(s.charAt(s.length()-1)=='+')
		count--;
		System.out.println("Case #"+t+": "+count);
		}
	}
}
