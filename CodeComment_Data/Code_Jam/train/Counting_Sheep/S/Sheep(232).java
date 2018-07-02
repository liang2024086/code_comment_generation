package methodEmbedding.Counting_Sheep.S.LYD782;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("Sheep.txt"));
		PrintWriter pw = new PrintWriter("Sheep.out");
		int cases = scan.nextInt();
		for (int i = 1; i <= cases; i++) {
			long val = scan.nextInt();
			if (val == 0) {
				pw.println("Case #" + i + ": INSOMNIA");
			} else {
				boolean seen[] = new boolean[10];
				long print = -1;
				long cur = val;
				while (print == -1) {
					String temp = cur + "";
					for (int z = 0; z < temp.length(); z++) {
						seen[Integer.parseInt(temp.substring(z, z + 1))] = true;
					}
					boolean ok = true;
					for (int z = 0; z < seen.length; z++) {
						if (seen[z]) {

						} else {
							ok = false;
							break;
						}
					}
					if (ok) {
						print = cur;
					} else {
						cur += val;
					}
				}
				pw.println("Case #" + i + ": " + (cur));
			}
			
		}
		pw.close();
	}

}
