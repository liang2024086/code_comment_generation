package methodEmbedding.Speaking_in_Tongues.S.LYD242;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class Tongues {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("input.in"));
		Scanner sc2 = new Scanner(new File("output.in"));
		HashMap<Character, Character> tabla = new HashMap();
		tabla.put('a', 'y');
		tabla.put('o', 'e');
		tabla.put('z', 'q');
		tabla.put('q', 'z');
		int k = 0;
		while(k<3){
			String ln = sc.nextLine();
			String ln2 = sc2.nextLine();
			
			for (int i = 0; i < ln.length(); i++) {
				tabla.put(ln.charAt(i), ln2.charAt(i+9));
			}
			
			k++;
		}
		Scanner sc3 = new Scanner(new File("input"));
		PrintWriter pw = new PrintWriter(new File("output.out"));
		int count = Integer.parseInt(sc3.nextLine());
		for (int i = 0; i < count; i++) {
			String ln = sc3.nextLine();
			String respuesta = "Case #"+(int)(i+1)+": ";
			for (int j = 0; j < ln.length(); j++) {
				respuesta+=tabla.get(ln.charAt(j));
			}
			pw.println(respuesta);
		}
		pw.close();
		

	}
}
