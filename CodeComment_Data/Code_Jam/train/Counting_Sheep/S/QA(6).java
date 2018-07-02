package methodEmbedding.Counting_Sheep.S.LYD786;

import java.io.*;
import java.util.*;

public class QA {
	public static void main(String[] args) {
		String filename = "inputfile";
		String line = null;

		try {
			Scanner input = new Scanner(new File(filename));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			
			int totalCases = Integer.parseInt(input.nextLine());
			System.out.println("totalCases");

			for(int i=0; i<totalCases; i++) {

				int n = Integer.parseInt(input.nextLine());
				System.out.println("");
				System.out.println("running for " + n);
				System.out.println("");

				if(n != 0) {
					HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

					int mult = 1;
					int lastNumber = n;
					while(true) {
						int tmp = n * mult;
						lastNumber = tmp;
						System.out.println("checking " + tmp);

						while(tmp >= 10) {
							int digit = tmp % 10;

							if(!cache.containsKey(digit)) {
								cache.put(digit, digit);
							}
							if(cache.size() >= 10) break;
							tmp = tmp/10;
						}

						if(!cache.containsKey(tmp)) {
							cache.put(tmp, tmp);
						}

						if(cache.size() >= 10) break;

						mult++;
					}


					writer.println("Case #" + (i+1) + ": " + lastNumber);
				} else {
					writer.println("Case #" + (i+1) + ": INSOMNIA");
				}

			}

			writer.close();
		} catch(Exception ex) {
			// lol error handling
		}
	}
}
