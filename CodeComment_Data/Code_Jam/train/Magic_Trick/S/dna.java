package methodEmbedding.Magic_Trick.S.LYD1020;

import static java.lang.System.*;import static java.lang.Math.*;import static java.lang.Character.*;import java.io.*;import java.text.*;import java.util.*;import java.util.regex.*;import java.math.*;
public class dna {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("dna.dat"));
		int dS = Integer.parseInt(sc.nextLine());
		for (int xxy = 0; xxy < dS; xxy++) {
			int x = sc.nextInt(); sc.nextLine();
			for(int xx = 1; xx < x;xx++) sc.nextLine();
			ArrayList<String> l = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s+")));
			for(int xx = x; xx < 4;xx++) sc.nextLine();

			x = sc.nextInt(); sc.nextLine();
			for(int xx = 1; xx < x;xx++) sc.nextLine();
			ArrayList<String> g = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s+")));
			for(int xx = x; xx < 4;xx++) sc.nextLine();

			l.retainAll(g);
			System.out.println("Case #"+(xxy+1)+": "+ (l.size()==1?l.get(0):l.size()>1?"Bad magician!":"Volunteer cheated!"));
		}
	}
}
