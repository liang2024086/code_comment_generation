package methodEmbedding.Standing_Ovation.S.LYD1799;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProbA {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("A-small-attempt0.in"));
		PrintWriter outFile = new PrintWriter("output.txt");
		int T = inFile.nextInt();
		
		for(int t=1; t<=T; t++) {
			int numFriends = 0;
			int numStanding = 0;
			int maxS = inFile.nextInt();
			String s = inFile.nextLine().trim();
			
			for(int i=0; i<=maxS; i++) {
				if(numStanding >= i) {
					numStanding += Integer.parseInt(s.substring(i, i+1));
				} else {
					numFriends += i - numStanding;
					numStanding = i;
					numStanding += Integer.parseInt(s.substring(i, i+1));
				}
			}
			
			System.out.println("Case #" + t + ": " + numFriends);
			outFile.println("Case #" + t + ": " + numFriends);
		}
		outFile.close();
	}

}
