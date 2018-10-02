package methodEmbedding.Counting_Sheep.S.LYD1393;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("C:/Users/Virginia Farias/Downloads/CodeJam/A/A.in"));
	    int cases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/Virginia Farias/Downloads/CodeJam/A/A.out"));
	    for (int i = 1; i <= cases; ++i) {
	    	Set<Integer> list = new HashSet<Integer>();
	    	String number = in.next();
	    	Integer numberOriginal = Integer.valueOf(number);
	    	if (number.equals("0")) {
	    		System.out.println("Case #" + i + ": INSOMNIA");
	    		pw.println("Case #" + i + ": INSOMNIA");
	    		continue;
	    	}
	    	for (int t = 0; t < number.length(); t++) {
	    		list.add(Integer.valueOf(String.valueOf(number.charAt(t))));
	    	}
	    	if (list.size() == 10) {
	    		System.out.println("Case #" + i + ": " + number);
	    		pw.println("Case #" + i + ": " + number);
	    		continue;
	    	}
	    	int mult = 1;
	    	while (list.size() != 10) {
	    		mult++;
	    		for (int t = 0; t < number.length(); t++) {
	    			list.add(Integer.valueOf(String.valueOf(number.charAt(t))));
		    	}
	    		if (list.size() != 10) {
	    			number = String.valueOf(numberOriginal * mult);
	    		}
			}
	    	System.out.println("Case #" + i + ": " + number);
    		pw.println("Case #" + i + ": " + number);
	    	
	      /*Integer items = in.nextInt();
	      Integer[] lineValues = new Integer[items];
	      for (int t = 0; t < items; t++) {
	    	  lineValues[t] = in.nextInt();
	      }
	      //Arrays.sort(lineValues);
	      boolean encontrou = false;
	      for (int m = lineValues.length - 1; m >0; m--) {
	    	  if(encontrou) {
	    		  break;
	    	  }
	    	  if (lineValues[m] > credit) {
	    		  continue;
	    	  }
	    	  for (int n = m-1; n >= 0; n--) {
	    		  if (lineValues[m] + lineValues[n] > credit) {
		    		  continue;
		    	  }
	    		  if (lineValues[m] + lineValues[n] == credit) {
	    			  System.out.println("Case #" + i + ": " + (n+1) + " " + (m+1));
	    			  pw.println("Case #" + i + ": " + (n+1) + " " + (m+1));
	    			  encontrou = true;
	    			  break;
		    	  }
	    	  }
	    	  
	      }*/
	    }
	    pw.flush();
		pw.close();
		in.close();
		
	}

}
