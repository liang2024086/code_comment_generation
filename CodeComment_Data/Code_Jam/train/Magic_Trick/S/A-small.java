package methodEmbedding.Magic_Trick.S.LYD336;


import java.util.Scanner;

public class mainSolver {

	public static void main (String args[]){
		

		String line="";
		int cases=0;
		int caseCounter=0;
		
		boolean isOver = false;
		boolean firstLine = false;
		
		System.out.println("Paste the problem: \n");
		
		Scanner console = new Scanner(System.in);
		do{
			
			if(!firstLine){
				line = console.nextLine();
				cases = Integer.parseInt(line);
				firstLine=true;
				System.out.println("\n");
			}else{
				int matchAmount = 0;
				String matchValue = "";
				String rowLocated1 = console.nextLine();
				
				String[][] array1 = new String[4][4];
				String[][] array2 = new String[4][4];
				for (int i = 0; i < 4; i++) {
					String[] aux = console.nextLine().split(" ");
					array1[i][0] = aux[0];
					array1[i][1] = aux[1];
					array1[i][2] = aux[2];
					array1[i][3] = aux[3];
				}
				String rowLocated2 = console.nextLine();
				
				for (int i = 0; i < 4; i++) {
					String[] aux2 = console.nextLine().split(" ");
					array2[i][0] = aux2[0];
					array2[i][1] = aux2[1];
					array2[i][2] = aux2[2];
					array2[i][3] = aux2[3];
									
				}
				
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if(Integer.parseInt(array1[Integer.parseInt(rowLocated1)-1][i]) == Integer.parseInt(array2[Integer.parseInt(rowLocated2)-1][j])){
							matchAmount++;
							
							matchValue = array1[Integer.parseInt(rowLocated1)-1][i];
						}
					}
				}
				
				if(matchAmount==1){
					System.out.println("Case #"+caseCounter+": "+matchValue);
				}
				else if(matchAmount==0){
					System.out.println("Case #"+caseCounter+": "+"Volunteer cheated!");
				}
				else if(matchAmount>1){
					System.out.println("Case #"+caseCounter+": "+"Bad magician!");
				}
				
			}
			
			if(caseCounter>cases){
				isOver=true;
			}
			caseCounter++;
			
		}while(!isOver);
		
	}
	
}
