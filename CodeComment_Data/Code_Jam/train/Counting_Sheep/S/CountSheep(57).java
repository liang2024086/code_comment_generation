package methodEmbedding.Counting_Sheep.S.LYD112;

import java.util.*;
import java.io.*;

public class CountSheep {
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int length;
    int d;
    int[] count = new int[10];;
    int seen=1 ;
    int c=0;
    int val = in.nextInt();
    while (in.hasNextInt()){
    	c++;
    	Arrays.fill(count, 0);
	    Long t = in.nextLong(); 
	    Long orig = t;
	    //System.out.println("t: "+orig);
	    while (t<=1000000 && t>0){
		    Long m=t;
		    length = String.valueOf(t).length();
		    for (int i = 1; i <= length; ++i) {
		    	  seen=1;
			      d =  (int) (m%10);
			      m = m/10;
			      count[d] = 1;
			      for (int j=0;j<10;j++){
			    	  if (count[j]!=1){
			    		  seen=0;
			    		  break;}
			    	  }  
		      }

	    if (seen==1){
	    	  System.out.println("Case #" + c + ": " + t);
	    	  break;}
	    else
	    	t += orig;
//	    for (int j=0;j<10;j++)
//	    	 System.out.println("Count "+j+" "+count[j]);
    }
    
	    if (t>100000 || t<=0)
	    	System.out.println("Case #" + c + ": " + "INSOMNIA");
	    
  }
  }

}
