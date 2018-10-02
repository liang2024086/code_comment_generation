package methodEmbedding.Speaking_in_Tongues.S.LYD1286;

import java.io.*;

public class Main {
	public static void main (String[] args) {
		char [] code = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		int i = 1;
		try{
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			String ligne;
			ligne = in.readLine();
			ligne = in.readLine();
			while (ligne != null) {
				System.out.print("Case #" + i + ": ");
				int longueur = ligne.length();
				for (int j=0;j<longueur ;j++ ) {
					char car = ligne.charAt(j);
					if (car == ' ') {
						System.out.print(" ");
						
					}
					else {
						System.out.print(code[Character.getNumericValue(car)-10]);
					}
				}
				System.out.println();
				i++;
				ligne = in.readLine();
			}
			in.close();
		} catch (Exception e){
			System.err.println("Erreur !");
		}

		
	}
}
