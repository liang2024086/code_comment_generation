package methodEmbedding.Revenge_of_the_Pancakes.S.LYD921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengeOfPancakes {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int t, changes;
		char ch = 0;
		
		line = bf.readLine();
		line = line.trim();
		t = Integer.parseInt(line);
		
		for (int c = 1; c <= t; c++) {
			line = bf.readLine();
			line = line.trim();
			changes = 0;
			//System.out.println(line);
			if (line.length() > 0)
				ch = line.charAt(0);
			for (int i = 1; i < line.length(); i++) {
				if (line.charAt(i) != ch) {
					changes++;
					ch = line.charAt(i);
				}
			}
			
			if (line.length() > 0 && line.charAt(line.length() - 1) == '-')
				changes++;
			
			System.out.printf("Case #%d: %d\n", c, changes);
		}
	}

}
