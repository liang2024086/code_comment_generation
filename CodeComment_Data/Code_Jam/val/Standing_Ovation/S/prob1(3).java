package methodEmbedding.Standing_Ovation.S.LYD1718;

import java.io.*;
import java.util.*;

public class prob1 {
	public static void main(String args[]) {
		try {
		    File myfile = new File("A-small-attempt1.in");
		    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		    //PrintWriter inp = new PrintWriter("inp.txt", "UTF-8");
			if (myfile.exists()){
	            BufferedReader readfile = new BufferedReader(new FileReader(myfile));
	            String newl;
	            newl = readfile.readLine();
	            int testcases = Integer.parseInt(newl);
	            //inp.println(newl);
	            for (int j = 0; j < testcases; j++) {
	            	newl = readfile.readLine();
	            	String[] split = newl.split(" ");
	            	long maxshy = Integer.parseInt(split[0]);
	            	long[] shylevel = new long[(int)maxshy+1];
	            	for (int i = 0; i <= maxshy; i++) {
	            		shylevel[i] = Character.getNumericValue((split[1].charAt(i)));
	            	}

	            	long pinv = 0;
	            	long pstand = 0;
	            	for (int i = 0; i <= maxshy; i++) {
	            		if (pstand < i) {
	            			pinv += (i - pstand);
	            			pstand += (i - pstand);
	            		}
	            		if (pstand >= i) {
	            			pstand += shylevel[i];
	            		}
	            	}



	            	writer.println("Case #"+(j+1)+": "+pinv);
	            	System.out.println("Case #"+(j+1)+": "+pinv);

	            }
	        }
	        writer.close();
	        //inp.close();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }


	}
}
