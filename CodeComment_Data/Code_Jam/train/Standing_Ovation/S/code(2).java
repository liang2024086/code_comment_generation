package methodEmbedding.Standing_Ovation.S.LYD1323;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by JUX on 11/04/2015.
 */
public class StandingOvation {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new FileReader("input.txt"));
			String l;
			l = input.readLine();
			int n = Integer.parseInt(l);
			for (int i = 0; i < n; ++i) {
				l = input.readLine();
				int k = Character.getNumericValue(l.charAt(0));
				int j = 2;
				int z = 0;
				int s = 0;
				int r = 0;
				for(; j < k+3; ++j){
					int c = Character.getNumericValue(l.charAt(j));
					 s += c;
					while (s <= z) {
						s += 1;
						r += 1;
					}
					z += 1;
				}
				System.out.println("Case #" + (i+1) + ": " + r);
			}
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
