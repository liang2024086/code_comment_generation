package methodEmbedding.Counting_Sheep.S.LYD1683;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author andrew
 *
 */
public class CountingSheep {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("sheep.in"));
		FileWriter fw = new FileWriter(new File("sheep.out"));
		int t = s.nextInt();
		for (int i=0; i<t; i++) {
			int n = s.nextInt();
			if (n == 0) {
				fw.write("Case #"+(i+1)+": INSOMNIA\n");
				continue;
			}
			int k = 1;
			boolean[] digits = new boolean[10];
			int maxK = Integer.MAX_VALUE / n;
			while (k <= maxK) {
				int product = n * k;
				while (product > 9) {
					digits[product % 10] = true;
					product /= 10;
				}
				digits[product] = true;
				
				boolean cont = false;
				for (boolean b: digits) {
					if (!b) {
						cont = true;
					}
				}
				if (cont) { k++; }
				else break;
			}
			fw.write("Case #"+(i+1)+": "+(k*n)+"\n");
			
		}
		
		fw.close();
		s.close();
	}

}
