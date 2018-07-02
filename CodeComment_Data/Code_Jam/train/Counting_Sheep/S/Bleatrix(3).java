package methodEmbedding.Counting_Sheep.S.LYD1027;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Scanner;

public class Bleatrix {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(new File("/home/bhavya/Downloads/A-small-attempt0.in"));
		int count = 0;
		int cases = 0;
		int num = 0;
		PrintWriter writer = new PrintWriter(new FileWriter("/home/bhavya/Downloads/A-small-attempt0..out"));

		while (scanner.hasNextLine()) {
			if (count == 0) {
				cases = Integer.parseInt(scanner.nextLine());
				num = cases;
				count++;
			}
			if (count > 1) {
				String line = scanner.nextLine();
				int x = Integer.parseInt(line);
				BitSet bits = new BitSet(1023);
				int originalN = x;
                int j = 0;
                boolean notSlept = true;
                while (notSlept) {
				    if (Integer.parseInt(line) == 0) {
					    writer.println("Case #" + (num-cases+1)+ ": " + "INSOMNIA");
					    notSlept = false;
				    } else {
			    	    for (int i = 0 ; i < line.length(); i++) {
				            bits.set(Integer.parseInt(""+line.charAt(i)));
				            if (bits.cardinality() == 10) {
				            	writer.println("Case #" + (num-cases+1) + ": " + x);
				    	        notSlept = false;
				    	        break;
				            }
				        }
			    	    j += 1;
			    	    x = (j + 1)*originalN;
			    	    line = ""+x;
				    }
				}
			
                cases --;			
		    }
			
			count ++;
		}
		
		writer.close();
		scanner.close();
	}
}

