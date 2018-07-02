package methodEmbedding.Counting_Sheep.S.LYD1523;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int limit = 100;
		
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		
		for (int currentCase = 1; currentCase <= total; currentCase++) {
			
			Set<Integer> numbersSeen = new HashSet<Integer>();
			int currentN = in.nextInt();
			int multiplier = 1;
			int currentOutcome = 0;
			
			while (numbersSeen.size() < 10 && multiplier <= limit) {
				
				currentOutcome = currentN * multiplier;
				String s = currentOutcome + "";
				
				for (int x = 0; x < s.length(); x++){
				    int c = Character.getNumericValue(s.charAt(x));
				    // System.out.println(c);
				    numbersSeen.add(c);
				}
				
				multiplier++;
			}
			
			if (numbersSeen.size() == 10) {
				System.out.println("Case #" + currentCase + ": " + currentOutcome);
			} else {
				System.out.println("Case #" + currentCase + ": " + "INSOMNIA");
			}
		}
	}
}
