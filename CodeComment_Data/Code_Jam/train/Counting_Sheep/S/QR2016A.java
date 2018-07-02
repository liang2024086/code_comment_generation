package methodEmbedding.Counting_Sheep.S.LYD735;


import java.util.*;
import java.io.*;

public class QR2016A {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("C:\\codejam\\A-small-attempt0.in");
	    
		PrintWriter writer = new PrintWriter("C:\\codejam\\A-small-attempt0.out", "UTF-8");
        Scanner input = new Scanner(file);
     
        int totalTest = input.nextInt();
        
        for (int test=0; test < totalTest; test++){
        	int origSheep = input.nextInt();
    		boolean[] digits = {false, false, false, false, false, false, false, false, false, false};
    		try {
	    		if (origSheep == 0) {
	    			writer.printf("Case #%d: INSOMNIA\n", test + 1);
	    			System.out.printf("Case #%d: INSOMNIA\n", test + 1);
	    		} else {
	    		
		    		boolean alldigits = false;
		    		int sheep=origSheep;
		    		while (!alldigits){
		    			String strSheep = Integer.toString(sheep);
		    			for (int i=0;i<strSheep.length();i++){
		    				digits[Character.getNumericValue(strSheep.charAt(i))] = true;
		    			}
		    			alldigits = true;
		    			for (int i=0;i<10;i++){
		    				if (!digits[i]) {alldigits = false; }
		    			}
		    			if (!alldigits){sheep+=origSheep;}
		    		}
		    		
		    		writer.printf("Case #%d: %d\n", test + 1, sheep);
	    			System.out.printf("Case #%d: %d\n", test + 1, sheep);
	    		}
	    	}
    		catch (Exception ex){
    			writer.printf("Case #%d: INSOMNIA\n", test + 1);
    			System.out.printf("Case #%d: INSOMNIA\n", test + 1);
    		}
    		
        }

        writer.close();
	}
}
