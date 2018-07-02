package methodEmbedding.Speaking_in_Tongues.S.LYD1479;


import java.util.Scanner;

public class A {

	private static final String INPUT  = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qeez";
	private static final String OUTPUT = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zooq";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ts = sc.nextLine();
		int t = Integer.valueOf(ts);
		for (int i=0;i<t;i++) {
			String line = sc.nextLine();
			StringBuffer output = new StringBuffer();
			for (int j=0;j<line.length();j++) {
				char c = line.charAt(j);
				int pos = INPUT.indexOf(c);
				output.append(OUTPUT.charAt(pos));
			}
			System.out.println("Case #" + (i + 1) + ": " + output);
		}
	}
}
