package methodEmbedding.Revenge_of_the_Pancakes.S.LYD428;


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws Throwable {
		//Scanner scanner = new Scanner(new File("d:/a.txt"));		
		Scanner scanner = new Scanner(new File("D:/abhishek.ganguly/My Downloads/B-small-attempt0.in"));
		//Scanner scanner = new Scanner(new File("D:/abhishek.ganguly/My Downloads/B-large.in"));
		
		java.io.PrintStream ps = new PrintStream(new File ("d:/a.out"));

		int T = scanner.nextInt();
		scanner.nextLine();
		
		for (int t = 0; t < T; t++) {
			String str = scanner.nextLine();
			int flips=0;		
						
			for(int lastBad = str.lastIndexOf("-");
					lastBad > -1;
					lastBad = str.lastIndexOf("-")) {
				
				String goodPart = "";
				if(lastBad+1 < str.length()) {
					goodPart = str.substring(lastBad+1);
				}
				
				String badPart = str.substring(0, lastBad+1);
								
				int firstBad = badPart.indexOf("-");
				if(firstBad > 0) {
					//it starts with good part
					String goodPrefix = badPart.substring(0, firstBad);
					String badSuffix = badPart.substring(firstBad);
					
					//first flip the good to bad
					String flippedPrefix = goodPrefix.replace("+", "-");
					flips++;
					
					badPart = flippedPrefix + badSuffix;
				}
				
				String r1 = new StringBuilder(badPart).reverse().toString();
				String r2 = r1.replace("-", "*").replace("+", "-").replace("*", "+");
				flips++;
				
				str = r2 + goodPart;
			}
			
			int t1 = t+1;
			ps.println("Case #" + t1 + ": " + flips);
		}
		
		System.out.println("Done " + T);
	}
	
	

}
