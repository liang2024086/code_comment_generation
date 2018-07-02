package methodEmbedding.Standing_Ovation.S.LYD1074;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LaunchMainStandingOvation {

	public static void main(String[] args) {

		String fichierFrom ="A-small-attempt0.in";
		String fichierTo ="A-small-attempt0_RESULT.in";
		
		try{
			//lecture du fichier texte	
			InputStream ips=new FileInputStream(fichierFrom); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;

			//cr?ation ou ajout dans le fichier texte
			FileWriter fw = new FileWriter (fichierTo);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw);  
			
			// nombres de cas tests
			ligne = br.readLine();
			int nbCasTests = Integer.parseInt(ligne); 
			System.out.println("nbCasTests="+nbCasTests);
			
			for (int iCasTest=0 ; iCasTest<nbCasTests ; iCasTest++) {
				
				ligne = br.readLine();
				String[] value = ligne.split(" ");
				
				int shynessLevelMax = Integer.parseInt(value[0]);
//				System.out.print("  shynessLevel "+shynessLevelMax+"  [");
				
				int missingPersons = 0;
				int totalPersons = 0;
				for (int level=0 ; level<=shynessLevelMax ; level++) { 
					if (totalPersons<level) {
						missingPersons += level-totalPersons;
						totalPersons = level;
					}
					totalPersons += Integer.parseInt(String.valueOf(value[1].charAt(level)));
//					System.out.println("level "+level+"    totalP="+totalPersons+"    missingPersons="+missingPersons);
//					System.out.print("  "+level+"("+nbPersonInlevel[level]+")");
				}
//				System.out.println("-----");
				fichierSortie.println ("Case #"+(iCasTest+1)+": "+missingPersons);
			}
			br.close();
			
			fichierSortie.close();
			System.out.println("Le fichier " + fichierTo + " a ?t? cr??!"); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}	
	}
}
