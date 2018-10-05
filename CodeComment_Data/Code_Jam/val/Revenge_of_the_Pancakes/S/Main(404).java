package methodEmbedding.Revenge_of_the_Pancakes.S.LYD461;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main
{
	
	public static void main(String[] args) throws IOException
	{
	      Scanner in=new Scanner(new File("/Users/shinian/Downloads/B-small-attempt0.in"));
	      int tt=in.nextInt();
	      for(int k=1;k<=tt;k++)
	      {
	    	 String s=in.next();
	    	 s+="+";
	    	 int cnt=0;
	    	 for(int i=1;i<s.length();i++)
	    	 {
	    		 if(s.charAt(i)!=s.charAt(i-1))cnt++;
	    	 }
	    	 System.out.println("Case #"+k+": "+cnt);
	    	 
	 	  }
	      in.close();
	     
	}
}
