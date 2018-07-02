package methodEmbedding.Speaking_in_Tongues.S.LYD1510;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class A {
	public static void main(String[] args) throws IOException {
		String filename = "A-small-attempt1";
		String inname = filename + ".in";
		String outname = filename + ".out";
		Scanner sc = new Scanner(new File(inname));
		int N = sc.nextInt();
		sc.nextLine();
		PrintWriter out = new PrintWriter(new FileWriter(outname)); 
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		String oldStr = "ynficwlbkuomxsevzpdrjgathaq ";
		String newStr = "abcdefghijklmnopqrstuvywxyz ";
		for(int i = 0; i < oldStr.length(); i++) {
			if(hm.get(oldStr.charAt(i)) == null)
				hm.put(oldStr.charAt(i), newStr.charAt(i));
		}
		for(int j = 1; j <= N; j++) {
			String o = sc.nextLine();
			String n = "";
			for(int i = 0; i < o.length(); i++) {
				n += hm.get(o.charAt(i));
			}
			out.println("Case #" + j + ": " + n);
			System.out.println("Case #" + j + ": " + n);
		}
		out.close();
	}
}
