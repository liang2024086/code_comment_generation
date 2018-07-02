package methodEmbedding.Magic_Trick.S.LYD1417;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author DJEUDJI
 *
 */
public class Magicfinal {

	
	public static void main(String[] args) {
		try {
			BufferedReader fichier = new BufferedReader(new FileReader("A-small-attempt2.in"));
			BufferedWriter sortie = new BufferedWriter( new FileWriter("./A-small-attempt2.out"));
			
			String ligne;
			 int i = 1;
			 @SuppressWarnings("unused")
			String max = fichier.readLine();
			 while ((ligne = fichier.readLine()) != null) {
		          //System.out.println(ligne);
				    String[] tab;
				    String[] sol;
				    String[] tab1 = fichier.readLine().split(" ");
				    String[] tab2 = fichier.readLine().split(" ");
				    String[] tab3 = fichier.readLine().split(" ");
				    String[] tab4 = fichier.readLine().split(" ");
				    
				    int choix1 = Integer.parseInt(ligne);
				        switch (choix1){
				        case 1 : tab = tab1; break;
				        case 2 : tab = tab2; break;
				        case 3 : tab = tab3; break;
				        case 4 : tab = tab4; break;
				        default : tab = new String[4];
				        }
				  
				        int choix2 = Integer.parseInt(fichier.readLine());
				        
				    String[] tab5 = fichier.readLine().split(" ");
				    String[] tab6 = fichier.readLine().split(" ");
				    String[] tab7 = fichier.readLine().split(" ");
				    String[] tab8 = fichier.readLine().split(" ");
				  
				        
				        switch (choix2){
				        case 1 : sol = tab5; break;
				        case 2 : sol = tab6; break;
				        case 3 : sol = tab7; break;
				        case 4 : sol = tab8; break;
				        default : sol = new String[4];
				        }
				        
				        int valeur=0;
				        int position=0;
				        for (int j=0;j<4;j++){
				        	for(int k=0; k<4; k++){
				        		if (tab[j].equals(sol[k])){
				        				valeur+=1;
				        				position = j;
				        		}
				        	}
				        }
                  if(valeur==1){
                	  sortie.write("Case #"+i+": "+tab[position]);
                  }else if(valeur==0){
                	  sortie.write("Case #"+i+": Volunteer cheated!");
                  }else if(valeur>1){
                	  sortie.write("Case #"+i+": Bad magician!");
                  }
		          
		          sortie.newLine();
		          i+=1;
		      }
			 
			
			sortie.close();
			fichier.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.print("fichier non trouv???");
			e.printStackTrace();
		} finally {
		
		}
	}

}
