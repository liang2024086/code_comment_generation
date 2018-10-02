package methodEmbedding.Counting_Sheep.S.LYD1140;

import java.util.HashSet;
import java.util.Scanner;


public class CountingSheep {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		
		for(int z=1; z <= cases; z++) {
			long N = Long.parseLong(scan.nextLine());
			if(N == 0) {
				System.out.println("Case #" + z + ": INSOMNIA");
				continue;
			}
			
			HashSet<Character> seen = new HashSet<Character>();
			
			long currMultiple = 1;
			long lastSeen = -1;
			while(seen.size() < 10) {
				lastSeen = N * currMultiple;
				String temp = lastSeen + "";
				for(char c : temp.toCharArray()) {
					seen.add(c);
				}
				currMultiple++;
			}
			
			System.out.println("Case #" + z + ": " + lastSeen);
		}
	}
}
