package methodEmbedding.Magic_Trick.S.LYD368;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	private static Scanner sc = null;
	
	public static void main(String args[]) throws Exception {
		
		sc = new Scanner(new FileInputStream("./src/A-small-attempt5.txt"));
		int nb_test = sc.nextInt();
		
		if (nb_test >= 1 && nb_test <= 100) {
			int[] n = new int[nb_test];
			int[] nb = new int[nb_test];
			for (int i = 0; i < nb_test; i++) {
				
				//premier arragement
				int num_lign_arrang1 = sc.nextInt();

				int[][] sqGrid1 = new int[4][4];
				if (num_lign_arrang1 >= 1 && num_lign_arrang1 <= 4) {
					for(int j = 0; j < 4; j++) 
						for(int k = 0; k < 4; k++) {
							sqGrid1[j][k] = sc.nextInt();
						}

				} else {
					throw new Exception("le numero de la ligne choisie doit etre entre 1 et 4");
				}
				
				//deuxieme arragement
				int num_lign_arrang2 = sc.nextInt();

				int[][] sqGrid2 = new int[4][4];
				if (num_lign_arrang2 >= 1 && num_lign_arrang2 <= 4) {
					for(int j = 0; j < 4; j++) 
						for(int k = 0; k < 4; k++) {
							sqGrid2[j][k] = sc.nextInt();
						}	
					
				} else {
					throw new Exception("le numero de la ligne choisie doit etre entre 1 et 4");
				}
				
				//test de duplication des cartes
				Boolean distinct = true;
				Set<Integer> test1 = new HashSet<Integer>();
				for(int j = 0; j < 4; j++) 
					for(int k = 0; k < 4; k++) {
						if (!test1.add(sqGrid1[j][k])) {
							distinct = false;
						}
					}	
				Set<Integer> test2 = new HashSet<Integer>();
				for(int j = 0; j < 4; j++) 
					for(int k = 0; k < 4; k++) {
						if (!test2.add(sqGrid2[j][k])) {
							distinct = false;
						}
					}
				
				//calcul output
				n[i] = 0;
				if (distinct) {
					for (int j = 0; j < 4; j ++) {
						for (int k = 0; k < 4; k ++) {
							if (sqGrid2[num_lign_arrang2-1][j] == sqGrid1[num_lign_arrang1-1][k]) {
								n[i]++;
								nb[i] = sqGrid2[num_lign_arrang2-1][j];
							}
						}
					}
				} else {
					throw new Exception("les numeros de chacunes des grilles doivent etre tous differents");
				}

			}
			
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
			
			//output
			for(int i = 0; i < nb_test; i++) {
				if (n[i] == 0) {
					fluxSortie.println("Case #"+(i+1)+": Volunteer cheated!");
				}
				else if (n[i] == 1) {
					fluxSortie.println("Case #"+(i+1)+": "+nb[i]);
				}
				else {
					fluxSortie.println("Case #"+(i+1)+": Bad magician!");
				}
			}
			
			fluxSortie.close();
			
		} else {
			throw new Exception("nombre de tests invalide");
		}
	}
}
