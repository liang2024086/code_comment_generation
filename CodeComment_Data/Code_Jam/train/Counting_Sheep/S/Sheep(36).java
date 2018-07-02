package methodEmbedding.Counting_Sheep.S.LYD78;

import java.io.File;
import java.util.Scanner;
import java.util.HashSet;

public class Sheep {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("input.txt"));
			int cases = in.nextInt();
			for (int t = 1; t <= cases; t++) {
				int n = in.nextInt();
				int bitmask = 1 << 10;
				int sleepmask = (1 << 11) - 1;
				HashSet<Integer> hashTable = new HashSet<Integer>();
				
				int coefficient = 1;
				int result = -1;
				while(bitmask != sleepmask) {
					int currentn = (coefficient) * n;
					
					if(hashTable.contains(currentn)) break;
					hashTable.add(currentn);
					
					while(currentn > 0) {
						int remainder = currentn % 10;
						bitmask |= 1 << remainder;
						currentn = (currentn - remainder) / 10;
					}
					if (bitmask == sleepmask) result = coefficient * n;
					coefficient++;
				}
				
				if (result != -1) System.out.println("Case #" + t + ": " + result);
				else System.out.println("Case #" + t + ": INSOMNIA");
			}
			in.close();
		} catch (Exception e) {}
	}
}
