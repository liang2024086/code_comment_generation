package methodEmbedding.Counting_Sheep.S.LYD1530;

import java.io.*;
import java.util.*;
public class G1 {

	public static void main (String [] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("r1.out");
	//	StringTokenizer st;
 
		 int T;

		  T=Integer.parseInt(sc.nextLine());
	//	  out.println(T);
	     int ct=1;
	  
	     while (ct<=T)
	     {	
	    	 String N=sc.nextLine();
	    	 int n= Integer.parseInt(N);
	    	 int result=-1;
			 HashSet<Character> hs = new  HashSet<Character>();
		     out.print("Case #"+ct+": "); 
		     ct++;
		     if (n==0) {
		    	 out.println("INSOMNIA");
		    	 continue; 
	    	 };
	    	 int lastnum=n;
	    	 while (result<0){
	    		 String lastN=String.valueOf(lastnum);
	    		 for (int i=0;i<lastN.length();i++) {
	    			 char x=lastN.charAt(i);
	    			 hs.add(x);
	    			 if (hs.size()==10) {
	    				 result=lastnum;
	    				 break;
	    			 }
	    	 	}
	    		lastnum+=n;
	    	 }
	    	 out.println(result);
	 
	     }
	   
	     out.flush();
	     System.out.println("Done!");
 
	}

 

}
