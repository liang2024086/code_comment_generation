package methodEmbedding.Revenge_of_the_Pancakes.S.LYD867;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;

public class GoogleCodeJammer {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		
		int t = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= t; ++i) {
			String n = in.nextLine();
			Pattern p = Pattern.compile("\\+\\-");
			Matcher m = p.matcher(n);
			
			int flipCount = 0;
			
			if (n.charAt(0) == '-') {
				flipCount++;
			} 

			while (m.find()) {
				flipCount += 2;
			}

			System.out.println("Case #" + i + ": " + flipCount);
		}
	}

}
