package methodEmbedding.Counting_Sheep.S.LYD717;

import java.util.*;
import java.io.*;


public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(new File("sheepIn.txt"));
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileOutputStream("sheepOut.txt"));
		
		int numCases = sc.nextInt();
		for(int i = 1; i <= numCases; i++) {
			int input = sc.nextInt(); 
			
			if(input == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				out.println("Case #" + i + ": INSOMNIA");
			}
			
			else {
				HashSet<Character> charsUsed = new HashSet<>();
				int j = 1;
				while(true) {
					String toAdd = "" + (input * j);
					for(int k = 0; k < toAdd.length(); k++) {
						charsUsed.add(toAdd.charAt(k));
					}
					if(charsUsed.size() == 10) {
						System.out.println("Case #" + i + ": " + toAdd);
						out.println("Case #" + i + ": " + toAdd);
						break;
					}
					j++;
				}
			}
		}
		
		out.close();
	}

}
