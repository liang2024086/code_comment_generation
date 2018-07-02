package methodEmbedding.Standing_Ovation.S.LYD1089;

import java.util.Scanner;


public class StandinOvation {
	
	private static Scanner in = new Scanner(System.in);
	private static boolean debugEnRun = false;

	public static void main(String[] args) {
		
		
		int testCase = in.nextInt();
		
		if(debugEnRun){
		System.out.println("Testcase count  "+testCase);
		}
		
		for (int i = 0; i < testCase; i++) {
			
			int shyMax =  in.nextInt();
			
			if(debugEnRun){
				System.out.println("ShyMAx value  "+shyMax);
				}
			
			String  shyValues = in.next();
			
			if(debugEnRun){
				System.out.println("Shy values full  "+shyValues);
				}
			
			double temp = 0, count =0;
			for (int j = 0; j <= shyMax; j++) {
				
				
				int shyCurrent = ((int)shyValues.charAt(j))  - 48;
				
				if(debugEnRun){
					System.out.println("Shy Values for char at "+ j + "  "+shyCurrent);
					}
				
				if(j ==0){
					temp = shyCurrent * 1; 
				}
				else{
					
					double currentReqdShyLevel =  j;
					if(temp>= currentReqdShyLevel){
						temp += shyCurrent ;
					}
					else{
						count += (currentReqdShyLevel - temp);
						temp = temp +shyCurrent + (currentReqdShyLevel - temp) ; 
					}
					
				}
			}
			
			System.out.println("Case #"+(i+1) +": " + (int)count);
			temp = 0; count =0;
		}
		in.close();
	}

}
