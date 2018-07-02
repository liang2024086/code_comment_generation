package methodEmbedding.Counting_Sheep.S.LYD419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class QualifA {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintStream out = new PrintStream(
			new FileOutputStream("C:\\Users\\Valentin\\workspace\\GoogleCodeJam2016\\qualif_a_out.txt"));
		System.setOut(out);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Valentin\\workspace\\GoogleCodeJam2016\\A-small-attempt0.in")));
		int t = Integer.parseInt(in.readLine());
		for (int k = 0; k < t; k++) {
			long n = Long.parseLong(in.readLine());
			
			if (n == 0) {
				System.out.println("Case #" + (k+1) + ": INSOMNIA");
				continue;
			}
			
			Set<Character> set = new HashSet<>();
			for (int i = 48; i < 58; i++) {
				set.add((char) i);
			}
			
			long temp = n;
			
			while (!set.isEmpty()) {				
				String str = Long.toString(temp);
				for (int i = 0; i < str.length(); i++) {
					set.remove(str.charAt(i));
				}
				temp += n;
			}
			
			System.out.println("Case #" + (k+1) + ": " + (temp - n));
			
		}
		
	}

}
