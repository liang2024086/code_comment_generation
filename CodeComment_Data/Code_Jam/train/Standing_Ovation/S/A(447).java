package methodEmbedding.Standing_Ovation.S.LYD518;

import java.io.*;
import java.util.*;

public class A {
   
 public static void main(String[] args) {
	    File file = new File("A-small.in");
        Scanner in;
		try {
			PrintWriter writer = new PrintWriter("A-small.out", "UTF-8");
			in = new Scanner(file);
			 int a;
		        a = in.nextInt();
		        int testNo=1;
		        while (in.hasNext()){
		        int b;
		        b = in.nextInt();
		        String s = in.next();
		        int sumStand=0;
		        int toHire=0;
		        for(int i=0;i<s.length();i++){
		        	if (sumStand>=i){
		        		sumStand+=Character.getNumericValue(s.charAt(i));
		        	}else{
		        		toHire = toHire+i-sumStand;
		        		sumStand=i+Character.getNumericValue(s.charAt(i));
		        	}

		        }
				writer.println("Case #"+testNo+": "+toHire);
	        	testNo++;
		        }
				writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
   }
}
