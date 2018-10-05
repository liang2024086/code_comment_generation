package methodEmbedding.Speaking_in_Tongues.S.LYD374;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//three mappings: 
//'a' -> 'y'
//'o' -> 'e' 
//'z' -> 'q'

//Input
//3
//ejp mysljylc kd kxveddknmc re jsicpdrysi
//rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
//de kr kd eoya kw aej tysr re ujdr lkgc jv
//
//
//Output
//Case #1: our language is impossible to understand
//Case #2: there are twenty six factorial possibilities
//Case #3: so it is okay if you want to just give up

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi "
				+ "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd "
				+ "de kr kd eoya kw aej tysr re ujdr lkgc jv aozq";
		
		String output = "our language is impossible to understand "
				+ "there are twenty six factorial possibilities "
				+ "so it is okay if you want to just give up yeqz";

		Scanner sc = new Scanner(new File("A-small-attempt4.in"));
		int teller = 0;
		int numLines = 0;
		String out = "";
		String finalOut = "";
		boolean print = false;
		while (true) {
			String line = sc.nextLine();
			if (teller == 0) {
				numLines = Integer.valueOf(line);
			} else {
				print = true;
				for (int i = 0; i < Math.min(line.length(),100); i++) {
					char c = line.charAt(i);
					if (c == ' ') {
						out += c;
						continue;
					} else {
						for (int j = 0; j < input.length(); j++) {
							char inn = input.charAt(j);
							if (inn == c) {
								out += output.charAt(j);
								break;
							}
						}
					}
				}
			}

			if (print) {

				System.out.println("Case #" + teller + ": " + out);
				finalOut += "Case #" + teller + ": " + out + "\n";
				out = "";
				if (teller == numLines) {
					break;
				}
			}
			teller++;
		}

		PrintWriter writer = new PrintWriter(new File("out.txt"));

		writer.print(finalOut);
		writer.close();

	}
}
