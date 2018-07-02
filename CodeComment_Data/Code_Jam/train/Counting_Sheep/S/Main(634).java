package methodEmbedding.Counting_Sheep.S.LYD1178;


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
	      Scanner in=new Scanner(new File("/Users/shinian/Downloads/A-small-attempt1.in"));
	      int tt=in.nextInt();
	      int kk=0;
	      while(in.hasNext())
	      {
	    	  kk++;
	    	  int a=in.nextInt();
	    	  if(a==0)
	    	  {
	    		  System.out.println("Case #"+kk+": INSOMNIA");
	    	  }
	    	  else
	    	  {
		    	  Set<Character> mp=new HashSet<Character>();
		    	  int b=a;
			      while(true)
			      {
			    	  String s=b+"";
			    	  for(int i=0;i<s.length();i++)
			    	  {
			    		  mp.add(s.charAt(i));
			    	  }
			    	  if(mp.size()==10)
			    	  {
			    		  System.out.println("Case #"+kk+": "+ b);
			    		  break;
			    	  }
			    	  b+=a;
			      }
	    	  }
	      }
	      in.close();
	     
	}
}
