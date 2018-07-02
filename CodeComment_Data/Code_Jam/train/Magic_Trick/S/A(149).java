package methodEmbedding.Magic_Trick.S.LYD61;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
	public static void main(String args[]) throws FileNotFoundException{
		  Scanner   in = new Scanner(new File("A-small-attempt0.in"));		
	      PrintStream	out = new PrintStream(new File("A-small-attempt0.out"));
	      int t = in.nextInt();
	      in.nextLine();
	      int r1,r2;
	      int[]count;
	      int temp;
	      int cases=0;
	      while(in.hasNext()){
	    	  count=new int[17];
	    	  cases++;
	    	  r1=in.nextInt();
	    	  in.nextLine();
	    	  for(int i=1;i<=4;i++){
	    		  for(int j=1;j<=4;j++){
	    			  temp=in.nextInt();
	    			  if(i==r1)
	    				  count[temp]++;
	    		  }
	    		  if(in.hasNext())
	    			  in.nextLine();
	    	  }
	    	  r2=in.nextInt();
	    	  in.nextLine();
	    	  for(int i=1;i<=4;i++){
	    		  for(int j=1;j<=4;j++){
	    			  temp=in.nextInt();
	    			  if(i==r2)
	    				  count[temp]++;
	    		  }
	    		  if(in.hasNext())
	    			  in.nextLine();
	    	  }
	    	  int two=0;
	    	  int pos=0;
	    	  for(int i=1;i<count.length;i++)
	    		  if(count[i]==2){
	    			  two++;
	    			  pos=i;
	    		  }
	    	  if(two==1){
	    		  out.println("Case #"+cases+": "+pos);
	    	  }else{
	    		  if(two>=2)
	    			  out.println("Case #"+cases+": "+"Bad magician!");
	    		  else
	    			  out.println("Case #"+cases+": "+"Volunteer cheated!");
	    	  }
	    	  
	      }
	}
	
}
