package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1;

import java.io.*;
import java.util.*;

public class Cookies{
	public static void main(String [] args){
		 File file = new File("B-small-attempt0.in");
		 int counter = 1;
		 String [] line = null;
		 boolean foundTheSmallest = false;
		 double previous, nextN = 0.0;
		 int perSecond = 2;
		 int casenum = 1;
 
        try {
 
            Scanner scanner = new Scanner(file);
            double c,f,x = 0.0;
            scanner.nextLine();

            while (scanner.hasNextLine()) {
            	foundTheSmallest = false;
            	counter = 1;
            	line = scanner.nextLine().split(" ");
            	c = Double.parseDouble(line[0]);
            	f = Double.parseDouble(line[1]);
            	x = Double.parseDouble(line[2]);

            	nextN = x/2;

            	while(!foundTheSmallest){
            		previous = nextN;
            		//nextN = x/(perSecond+counter*f))+ c/(perSecond+(counter-1)*f);
					//previous = nextN;
					nextN = previous - x/(perSecond+(counter-1)*f) + x/(perSecond+counter*f) + c/(perSecond+(counter-1)*f);

            		if (previous < nextN) {
						foundTheSmallest = true;
						System.out.println("Case #" + casenum + ": " + previous);
					}
            		
            		counter ++;
            	}
            	casenum ++;

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}

}
