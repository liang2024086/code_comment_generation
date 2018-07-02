package methodEmbedding.Standing_Ovation.S.LYD879;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt4.in"));
		BufferedWriter w = new BufferedWriter(new FileWriter("out.txt"));
		if (sc.hasNextInt()) {
			int testNumber = sc.nextInt();
			for (int i = 1; i <= testNumber; i++) {
				int audience = 0;
				int result = 0;
				int length = sc.nextInt();
				String people = sc.next();
				for (int j = 0; j < length+1; j++) {
					if (people.charAt(j)!='0' && audience < j) {
						result += j-audience;
						audience += j-audience;
					}
					audience += Integer.parseInt(""+people.charAt(j));
				}
				w.write("Case #"+i+": "+result+"\n");
			}
			sc.close();
			w.close();
		}
	}
}
