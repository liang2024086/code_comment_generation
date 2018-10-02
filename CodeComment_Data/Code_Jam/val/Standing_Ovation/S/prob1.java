package methodEmbedding.Standing_Ovation.S.LYD1016;


import java.io.*;

public class prob1 {
	public static void main(String args[]) throws Exception{
		BufferedReader fich = new BufferedReader(new FileReader("datasets/2015/A-small-attempt6.in"));
		//Nb cas
		int nbCas = Integer.parseInt(fich.readLine());
		
		for(int i = 0; i < nbCas; i++){
			//Lecture d'une ligne
			int tab[] 		= new int[2000];
			String ligne 	= fich.readLine();
			int nb = 0;
			for(int j = 2; j < ligne.length(); j++){
				tab[j-2] = Integer.parseInt(ligne.charAt(j)+"");
				nb++;
			}
			
			int ajout = 0;
			int nbDebout = 0;
			for(int j = 1; j < nb; j++){
				nbDebout = 0;
				for(int k = 0; k < j; k++){
					nbDebout += tab[k];
				}
				nbDebout += ajout;
				if(nbDebout < j){
					ajout++;
				}
			}
			System.out.println("Case #"+(i+1)+": "+ajout);
		}
	}
}
