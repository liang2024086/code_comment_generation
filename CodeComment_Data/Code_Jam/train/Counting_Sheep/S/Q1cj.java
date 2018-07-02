package methodEmbedding.Counting_Sheep.S.LYD441;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Q1cj {
	public static void main(String args[]) throws IOException, FileNotFoundException{
	Scanner in = new Scanner(new File("A-small-attempt2.in"));
	BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt2.out"));
				int T=in.nextInt();
	        	 for(int i=0;i<T;i++){
	   	    	  int product = 0;
	   	    	  String ps = null;
	   	    	  int N=in.nextInt();
	   	    	if(N==0){
		    		  out.write("Case #"+(i+1)+":"+"INSOMNIA"+"\n");
		    		  continue;
		    	  }
	   	    	for(int j=1;;j++){
		    		  
	    		    product=N*j;
	    			ps=ps+product;
	    			//System.out.println(product);
	    			if(ps.contains("0")&&ps.contains("1")&&ps.contains("2")&&ps.contains("3")&&ps.contains("4")&&ps.contains("5")&&ps.contains("6")&&ps.contains("7")&&ps.contains("8")&&ps.contains("9")){
	  	    		  out.write("Case #"+(i+1)+":"+product+"\n");
	    			break;
	  	    	  }    		  
	    		  }
	        	 }
	   out.close();      
}
}


