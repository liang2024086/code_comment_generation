package methodEmbedding.Speaking_in_Tongues.S.LYD75;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;


public class A {
	public static void main(String args[]) throws IOException {
		Hashtable<Character, Character> dictionary = new Hashtable<Character, Character>();
		String str = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String mappedString = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		for (int i = 0; i < str.length(); i++) dictionary.put(str.charAt(i), mappedString.charAt(i));
		dictionary.put('z', 'q');
		dictionary.put('q', 'z');
		//dictionary.put('a', 'y');
		//dictionary.put('e', 'o');

		System.out.println(dictionary.toString());
		
		FileWriter fstream = new FileWriter("output");
		BufferedWriter out = new BufferedWriter(fstream);
	
		Scanner sc = new Scanner(new File("input"));
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String rString = sc.nextLine();
			//System.out.println(rString);
			String wString = new String();
			for (int j = 0; j < rString.length(); j++) wString += dictionary.get(rString.charAt(j));
			out.write("Case #" + (i+1) + ": " + wString + "\n");
		}
		out.close();
	}
}
