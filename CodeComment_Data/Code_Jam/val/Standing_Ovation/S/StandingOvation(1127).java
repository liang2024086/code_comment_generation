package methodEmbedding.Standing_Ovation.S.LYD147;


import java.util.Scanner;

public class StandingOvation {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int testcases = in.nextInt();
	        int i = 0;
	        while (i < testcases) {
	        	int smax = in.nextInt();
	        	//System.out.println("smax: " + smax);
	        	String people = in.next();
	        	//System.out.println("people: " + people);
	        	int toAdd = 0;
	        	int standing = 0;
	        	for (int s = 0; s <= smax; s++) {
	        		int p = Integer.valueOf(people.charAt(s)) - 48; // ascii offset
	        		//System.out.println("s" + s + " p: " + p);
	        		if (standing < s) {
	        			//System.out.println ("standing less than s!");
	        			toAdd += s - standing;
	        			standing = s;
	        		}
	        		standing += p;
	        		//System.out.println("standing: " + standing);
	        	}
	        	
	        	System.out.println("Case #" + (i + 1) + ": " + toAdd);
	        	i++;
	        }
	        in.close();
	   }
}

