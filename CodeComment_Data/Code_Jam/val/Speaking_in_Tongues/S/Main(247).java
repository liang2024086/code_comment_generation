package methodEmbedding.Speaking_in_Tongues.S.LYD1068;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static Map<Character, Character> convert;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		convert = new HashMap<Character, Character>();

		convert.put('a', 'y');
		convert.put('z', 'q');
		convert.put('e', 'o');
		convert.put('r', 't');
		convert.put('t', 'w');
		convert.put('y', 'a');
		convert.put('u', 'j');
		convert.put('i', 'd');
		convert.put('o', 'k');
		convert.put('p', 'r');
		convert.put('q', 'z');
		convert.put('s', 'n');
		convert.put('d', 's');
		convert.put('f', 'c');
		convert.put('g', 'v');
		convert.put('h', 'x');
		convert.put('j', 'u');
		convert.put('k', 'i');
		convert.put('l', 'g');
		convert.put('m', 'l');
		convert.put('w', 'f');
		convert.put('x', 'm');
		convert.put('c', 'e');
		convert.put('v', 'p');
		convert.put('b', 'h');
		convert.put('n', 'b');

		Integer nb = null;
		Integer numero = 1;

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		reader.readLine();

		StringBuffer chaine = new StringBuffer(100);
		try {
			InputStream ips = new FileInputStream("/home/pilou/tmp.txt");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				if (nb == null) {
					nb = Integer.parseInt(ligne);
					chaine.append("Cydc #" + numero + ": ");
					numero++;
				} else {
					if (numero <= nb)
						chaine.append(ligne + "\nCydc #" + numero + ": ");
					else
						chaine.append(ligne);
					numero++;
				}
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		PrintWriter ecrivain = new PrintWriter(new BufferedWriter(
				new FileWriter("/home/pilou/out.txt")));
		
		for (int i = 0; i < chaine.length(); i++) {
			if (convert.containsKey(chaine.charAt(i)))
				ecrivain.print(convert.get(chaine.charAt(i)));
			else
				ecrivain.print(chaine.charAt(i));
		}
		
		ecrivain.close();

	}

}
