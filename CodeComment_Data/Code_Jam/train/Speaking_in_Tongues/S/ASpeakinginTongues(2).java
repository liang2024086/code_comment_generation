package methodEmbedding.Speaking_in_Tongues.S.LYD766;


import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ASpeakinginTongues {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner (new File("C:/codeJam/ficheros2012/A-small-attempt0.in"));
//		Scanner out = new Scanner (new File("C:/codeJam/ficheros2012/ASpeakinginTongues.out"));
		PrintStream ps = new PrintStream("C:/codeJam/ficheros2012/A-small-attempt0.out");
		Map<Character, Character> googlerese = new HashMap<Character, Character> ();
		googlerese.put((Character) 'a', (Character)'y');
		googlerese.put((Character) 'b', (Character)'h');
		googlerese.put((Character) 'c', (Character)'e');
		googlerese.put((Character) 'd', (Character)'s');
		googlerese.put((Character) 'e', (Character)'o');
		googlerese.put((Character) 'f', (Character)'c');
		googlerese.put((Character) 'g', (Character)'v');
		googlerese.put((Character) 'h', (Character)'x');
		googlerese.put((Character) 'i', (Character)'d');
		googlerese.put((Character) 'j', (Character)'u');
		googlerese.put((Character) 'k', (Character)'i');
		googlerese.put((Character) 'l', (Character)'g');
		googlerese.put((Character) 'm', (Character)'l');
		googlerese.put((Character) 'n', (Character)'b');
		googlerese.put((Character) 'o', (Character)'k');
		googlerese.put((Character) 'p', (Character)'r');
		googlerese.put((Character) 'q', (Character)'z');
		googlerese.put((Character) 'r', (Character)'t');
		googlerese.put((Character) 's', (Character)'n');
		googlerese.put((Character) 't', (Character)'w');
		googlerese.put((Character) 'u', (Character)'j');
		googlerese.put((Character) 'v', (Character)'p');
		googlerese.put((Character) 'w', (Character)'f');
		googlerese.put((Character) 'x', (Character)'m');
		googlerese.put((Character) 'y', (Character)'a');
		googlerese.put((Character) 'z', (Character)'q');
		googlerese.put((Character) ' ', (Character)' ');
		int T = new Integer (in.nextLine());
		for (int nCase = 1; nCase < T + 1; nCase++) {
			String line = in.nextLine();
			String decodeLine = new String();
			for(int i = 0; i < line.length(); i++){
				Character key = line.charAt(i);
				decodeLine += googlerese.get(key);
			}
			System.out.format("Case #%d: %s\n", nCase, decodeLine);
			ps.format("Case #%d: %s\n", nCase, decodeLine);
		}
		ps.flush();
		ps.close();
	}
}
