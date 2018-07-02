package methodEmbedding.Counting_Sheep.S.LYD392;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Small {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Coding\\Java\\CodeJam\\CountingSheep\\src\\A-small-attempt0.in");
		Scanner scn = new Scanner(file);
		int T = scn.nextInt();
		int N = 0, count, c = 0;
		boolean asleep = false;
		String ans, numbers = "0123456789", seen;
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		//Reading
		for (int i = 0; i < T; i++) {
			c = 0;
			ans="";
			seen = "";
			count = 1;
			N = scn.nextInt();
			if (N == 0) {
				ans = "INSOMNIA";
			}else {
				while (!asleep) {
					c++;
					ans = Integer.toString(N * count);
					for (int j=0; j < ans.length(); j++) {
						if (seen.indexOf(ans.charAt(j)) == -1) {
							seen += ans.charAt(j);							
						}					
					}
					for (int j = 0; j < 10; j++) {
						if (seen.indexOf(numbers.charAt(j)) == -1) {
							asleep = false;
							break;
						}
						if (j == 9) {
							asleep = true;
						}
					}
					if (c > 1000){
						ans = "INSOMNIA";
						break;
					}
					count++;
				}
			}
			writer.println("Case #"+(i+1)+": " +ans);
			asleep = false;
		}
		writer.close();
		scn.close();

	}

}
