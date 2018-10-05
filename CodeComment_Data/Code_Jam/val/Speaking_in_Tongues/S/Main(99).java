package methodEmbedding.Speaking_in_Tongues.S.LYD886;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	private static Map<Character,Character> mapa;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		mapa = new HashMap<Character,Character>();
		mapa.put('q', 'z');
		mapa.put('z', 'q');
		char[] s1=("ejp mysljylc kd kxveddknmc re jsicpdrysi"+
		"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"+
		"de kr kd eoya kw aej tysr re ujdr lkgc jv").toCharArray();
		char[] s2 = ("our language is impossible to understand"+
			"there are twenty six factorial possibilities"+
			"so it is okay if you want to just give up").toCharArray();
		
		for(int i=0;i<s1.length;i++){
			mapa.put(s1[i], s2[i]);
		}
		for(Character c : mapa.keySet()){
			System.out.println(c + " -> "+mapa.get(c));
		}
		Scanner sc = new Scanner(Thread.currentThread().getContextClassLoader().getResourceAsStream("A-small-attempt3.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Erich\\Desktop\\A-small-attempt3.out"));
		int qtd = sc.nextInt();
		sc.nextLine();
		for(int j=0;j<qtd;j++){
			String aux = sc.nextLine();
			char []entrada = aux.toCharArray();
			for(int i=0;i<entrada.length;i++){
				entrada[i]=mapa.get(entrada[i]);
			}
			String saida = "Case #"+(j+1)+": "+new String(entrada)+"\n";
			bw.write(saida);
		}
		bw.flush();
		bw.close();
	}

}
