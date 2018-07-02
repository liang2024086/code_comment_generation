package methodEmbedding.Cookie_Clicker_Alpha.S.LYD193;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClicker {

	private static Scanner sc = null;

	public static void main(String args[])  throws Exception {
		
		sc = new Scanner(new FileInputStream("./src/B-small-attempt0.txt"));
		int nb_test = sc.nextInt();
		if (nb_test >= 1 && nb_test <= 100) {

			//creation du flux de sortie
			PrintWriter fluxSortie = null;
			try
			{
				fluxSortie = new PrintWriter(new FileOutputStream("./src/Output.txt"));
				}
				catch(FileNotFoundException e) {
					System.out.println("Erreur d?ouverture fichier.txt.");
				System.exit(0);
			}
			
			for (int k = 0; k < nb_test; k++) {
				double C = sc.nextDouble();
				double F = sc.nextDouble();
				double X = sc.nextDouble();
				
				if ((C >= 1 && C <= 500) || (F >= 1 && F <= 4) || (X >= 1 && X <= 2000)) {
					double ancienTemps = 0.0;
					double temps = 0.0;
					int i = 0;
					
					
					temps += X/2;
					
					do {
						ancienTemps = temps;
						temps = 0.0;
						for (int j = 0; j < i; j++) {
							temps += C/(2+j*F);
						}
						
						temps += X/(2+i*F);
						i++;
						
					} while (ancienTemps >= temps);
					
					fluxSortie.println(String.format("Case #%d: %.7f", k+1, ancienTemps));
				} else {
					throw new Exception("erreur de valeurs de C, F, X");
				}
			}
			
			fluxSortie.close();
			
		} else {
			throw new Exception("nombre de tests invalide");
		}
		
	}
}
