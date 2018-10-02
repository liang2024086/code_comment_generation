package methodEmbedding.Standing_Ovation.S.LYD468;


import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		int testCaseNumber = 1;
		while(testCaseNumber <= testCases){
			int Smax = in.nextInt();
			String temp = in.next();
			int spectatorsStanding = 0;
			int extraCustomers = 0;
			for(int i=0; i<=Smax; i++){
				if(spectatorsStanding < i && Character.getNumericValue(temp.charAt(i)) != 0){
					extraCustomers = extraCustomers + (i-spectatorsStanding);
					spectatorsStanding = spectatorsStanding + (i-spectatorsStanding) + Character.getNumericValue(temp.charAt(i));
				}else{
					spectatorsStanding = spectatorsStanding + Character.getNumericValue(temp.charAt(i));	
				}				
			}
			System.out.println("Case #"+testCaseNumber+": "+extraCustomers);
			testCaseNumber++;
		}
		in.close();
	}
}
