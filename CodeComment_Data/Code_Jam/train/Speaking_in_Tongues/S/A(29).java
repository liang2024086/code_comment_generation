package methodEmbedding.Speaking_in_Tongues.S.LYD1668;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

class A {
	
	public static void main(String[] args) {
		try {
		PrintStream out = new PrintStream(new File("a.out"));
		System.setOut(out);
		
		char[] letters={'y', 'h', 'e', 's','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		
		Scanner theIn=new Scanner(new File("A-small-attempt0.in"));
		int n=theIn.nextInt();
		String s;
		theIn.nextLine();
		for (int i=1; i<=n; i++) {
			s=theIn.nextLine();
			System.out.print("Case #"+i+": ");
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j)==' ') System.out.print(" "); else System.out.print(letters[s.charAt(j)-97]);
			}
			System.out.println();		
		}
		}
		catch(Exception e) {};
	}
}
