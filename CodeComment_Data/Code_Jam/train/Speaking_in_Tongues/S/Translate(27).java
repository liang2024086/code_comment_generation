package methodEmbedding.Speaking_in_Tongues.S.LYD1687;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Translate {
	
	static Map<Character, Character> mapaLetras = new HashMap<Character, Character>();
	
	 
	public Translate() throws IOException {
		
		StringBuffer fraseTraduzida;
		
		InputStream is = new FileInputStream("c:\\A-small-attempt0.in");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("c:\\saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String s = br.readLine();
		
		int qtdLinhas = Integer.parseInt(s);
		int linhaCorrente = 1;
				
		while (linhaCorrente != qtdLinhas + 1) {
			fraseTraduzida = new StringBuffer();
			s = br.readLine();
			for (int i = 0; i < s.length(); i++) {			
				fraseTraduzida.append(mapaLetras.get(s.charAt(i)));
			}
			bw.write("Case #"+ linhaCorrente +": " + fraseTraduzida + "\n");						
			linhaCorrente ++;
		}
		
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		mapaLetras.put('a', 'y');
		mapaLetras.put('b', 'h');
		mapaLetras.put('c', 'e');
		mapaLetras.put('d', 's');
		mapaLetras.put('e', 'o');
		mapaLetras.put('f', 'c');
		mapaLetras.put('g', 'v');
		mapaLetras.put('h', 'x');
		mapaLetras.put('i', 'd');
		mapaLetras.put('j', 'u');
		mapaLetras.put('k', 'i');
		mapaLetras.put('l', 'g');
		mapaLetras.put('m', 'l');
		mapaLetras.put('n', 'b');
		mapaLetras.put('o', 'k');
		mapaLetras.put('p', 'r');
		mapaLetras.put('q', 'z'); //q
		mapaLetras.put('r', 't');
		mapaLetras.put('s', 'n');
		mapaLetras.put('t', 'w');
		mapaLetras.put('u', 'j');
		mapaLetras.put('v', 'p');
		mapaLetras.put('x', 'm');
		mapaLetras.put('z', 'q'); //  z
		mapaLetras.put('w', 'f');
		mapaLetras.put('y', 'a');
		mapaLetras.put(' ', ' ');
	
		new Translate();
	}

}
