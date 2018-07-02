package methodEmbedding.Speaking_in_Tongues.S.LYD406;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class A {
	
	String cipher="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qeez";
	String plain= "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zooq";
	Map<Character,Character> M=new TreeMap<Character,Character>();
	
	A() {
		for (int i=0; i<cipher.length(); ++i)
			M.put(cipher.charAt(i), plain.charAt(i));
		
		Scanner in=new Scanner(System.in);
		for (int T=new Integer(in.nextLine().trim()),TC=1; T-->0; ++TC) {
			String line=in.nextLine();
			System.out.printf("Case #%d: ", TC);
			for (char c : line.toCharArray())
				System.out.print(M.get(c));
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new A();
	}

}
