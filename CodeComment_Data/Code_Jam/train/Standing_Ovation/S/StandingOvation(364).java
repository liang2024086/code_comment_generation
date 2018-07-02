package methodEmbedding.Standing_Ovation.S.LYD1029;


import java.util.Scanner;

class StandingOvation {
	
	public static void main( String[] args){
		
		Scanner scan = new Scanner( System.in);
		
		int numberOfTests;
		
		numberOfTests = Integer.parseInt(scan.nextLine());
		
		String[] inputs = new String[numberOfTests];
		String[] outputs = new String[numberOfTests];
		
		for ( int i = 0; i < numberOfTests; i++){
			
			inputs[i] = scan.nextLine();
			
		}
		
		for ( int i = 0; i < numberOfTests; i++){
			
			int audienceStanding = Integer.parseInt(inputs[i].charAt(2) + "");
			
			int result = 0;
			
			for ( int j = 0; j < Integer.parseInt(inputs[i].charAt(0) + ""); j++){
				
				if ( Integer.parseInt(inputs[i].charAt(j + 3) + "") != 0){
					
					if ( j + 1 <= audienceStanding){
						
						audienceStanding += Integer.parseInt(inputs[i].charAt(j + 3) + "");
						
					}
					
					else{
						
						while ( j + 1 > audienceStanding){
							
							audienceStanding ++;
							result ++;
							
						}
						
						audienceStanding += Integer.parseInt(inputs[i].charAt(j + 3) + "");
					
					}
					
				}	
				
			}
			
			outputs[i] = "Case #" + (i+1) + ": " + result;
			System.out.println("Case #" + (i+1) + ": " + result);
			
		}
		
		
	}

}
