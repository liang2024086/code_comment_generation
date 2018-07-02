package methodEmbedding.Speaking_in_Tongues.S.LYD1670;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		 String entree = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		 String sortie = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		char[] map = new char[256];
		
		for(int i=0; i<entree.length(); i++) {
				char input = entree.charAt(i);
				map[input] = sortie.charAt(i);
		}
		map['y'] = 'a';
		map['e'] = 'o';
		map['q'] = 'z';
		map['z'] = 'q';

	BufferedReader in = new BufferedReader(new FileReader("A-small-attempt2.in"));
	FileWriter fw = new FileWriter("A-small.out");
	int N = new Integer(in.readLine());
	for (int cases = 1; cases <= N; cases++) {
		String s = in.readLine();
		String trans = "";
		for(int i=0; i<s.length();i++) {
			trans=trans+map[s.charAt(i)];
		}
		fw.write("Case #" + cases + ": " + trans + "\n");
	}
	fw.flush();
	fw.close();
}

}
