package methodEmbedding.Speaking_in_Tongues.S.LYD162;

import java.util.ArrayList;
import java.util.Scanner;


public class A {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] googles = new char[] {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};
		char[] ingles = new char[26];
		String[] frasesEntradas = new String[3];
		String[] frasesSaida = new String[3];
		frasesEntradas[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		frasesEntradas[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		frasesEntradas[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		frasesSaida[0] = "our language is impossible to understand";
		frasesSaida[1] = "there are twenty six factorial possibilities";
		frasesSaida[2] = "so it is okay if you want to just give up";

		for (int i = 0; i < 3; i++) {
			String[] palavrasEntrada = frasesEntradas[i].split("");
			String[] palavrasSaida = frasesSaida[i].split("");
			for (int j = 0; j < palavrasEntrada.length; j++) {
				for (int j2 = 0; j2 < palavrasEntrada[j].length(); j2++) {
					for (int k = 0; k < googles.length; k++) {
						if(googles[k] == palavrasEntrada[j].charAt(j2)) {
							ingles[k] = palavrasSaida[j].charAt(j2);
						}
					}
				}
			}
		}
		
		ingles[25] = 'q';
		ingles[16] = 'z';

		
//		for (int i = 0; i < googles.length; i++) {
//			System.out.println(i + " " +googles[i] + " -> " + ingles[i] + " == " + ((byte)googles[i] - (byte)ingles[i]));
//		}
		
		int t = s.nextInt();
		s.nextLine();
		for (int i = 0; i < t; i++) {
			String frase = s.nextLine();
			String fraseResposta = "";
			for (int j = 0; j < frase.length(); j++) {
				char letra = frase.charAt(j);
				if(letra == ' '){
					fraseResposta += " ";
				}
				for (int k = 0; k < googles.length; k++) {
					if(googles[k] == letra) {
						fraseResposta += ingles[k];
						break;
					}
				}
			}
			System.out.println("Case #"+(i+1)+": "+fraseResposta);
		}
	}
	

}
