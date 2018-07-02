package methodEmbedding.Magic_Trick.S.LYD493;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
        try {
            File inputFile = new File("C:/Users/Ryuuzaki/Documents/GoogleCodeJam2014/A/A-small-attempt0.in");
            File outputFile = new File("C:/Users/Ryuuzaki/Documents/GoogleCodeJam2014/A/output.out");
            Scanner scanner = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFile);
            String ligne = null;
            int firstRep = 0;
            String firstRow = null;
            int secondRep = 0;
            String secondRow = null;
            int i = 0;
            String rep = null;
            
            int maxCaseNumber = Integer.parseInt(scanner.nextLine());
            
            
            for(int caseNumber=0;caseNumber<maxCaseNumber;caseNumber++){
	            
            	//1?re ligne choisie
            	firstRep = Integer.parseInt(scanner.nextLine());
	            for (i = 0;i<firstRep-1;i++){
	            	scanner.nextLine();
	            }
	            firstRow = scanner.nextLine();
	            for (i = 0;i<(4-firstRep);i++){
	            	scanner.nextLine();
	            }
	            
	            //2?me ligne choisie
	            secondRep = Integer.parseInt(scanner.nextLine());
	            for (i = 0;i<secondRep-1;i++){
	            	scanner.nextLine();
	            }
	            secondRow = scanner.nextLine();
	            for (i = 0;i<(4-secondRep);i++){
	            	scanner.nextLine();
	            }
	            
	            String chiffresFirstRow[] = firstRow.split(" ");
	            String chiffresSecondRow[] = secondRow.split(" ");
	            int similitude = 0;
	            
	            //Recherche de similitude entre les lignes choisies
	            for (String strChiffre1 : chiffresFirstRow) {
	            	for (String strChiffre2 : chiffresSecondRow) {
						if (strChiffre1.equals(strChiffre2)){
							rep = strChiffre1;
							similitude++;
						}
					}
				}
	            
	            if (similitude==0){
	            	rep = "Volunteer cheated!";
	            }
	            else if (similitude>1){
	            	rep = "Bad Magician!";
	            }
            
	            System.out.println("rep "+ rep);
	            
	            // Output
	            output.println("Case #"+(caseNumber+1)+": "+rep);
                output.flush();
	            
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
}
