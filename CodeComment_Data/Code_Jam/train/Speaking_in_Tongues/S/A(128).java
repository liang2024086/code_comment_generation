package methodEmbedding.Speaking_in_Tongues.S.LYD142;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
 */

public class A {

	static String s1 = " abcdefghijklmnopqrstuvwxyz";
	static String s2 = " yhesocvxduiglbkrztnwjpfmaq";

	static BufferedWriter writer;

	public static void main(String[] args) throws IOException {
		writer = new BufferedWriter(new FileWriter("output.out"));
		Scanner reader = new Scanner(new FileReader("input.in"));
		int nt = reader.nextInt();
		reader.nextLine();
		for(int t = 1; t <= nt; t++) {
			writer.write("Case #" + t + ": ");
			String s = reader.nextLine();
			for(int i = 0; i < s.length(); i++) {
				char c1 = s.charAt(i);
				int index = s1.indexOf(c1);
				char c2 = s2.charAt(index);
				writer.write(c2);					
			}
			writer.newLine();
		}
		writer.close();
	}


}
