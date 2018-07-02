package methodEmbedding.Standing_Ovation.S.LYD1259;


import java.util.Scanner;

public class AudienceShyness {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int linetotal = 0;
		int need = 0;
		int numTestCases = sc.nextInt();
		for(int i = 0 ; i < numTestCases; i++){
			int lineMax = sc.nextInt();
			String lineDigits = sc.next();
			for(int j = 0; j <= lineMax; j++){
				int digit = Integer.parseInt("" + lineDigits.charAt(j));
				if(linetotal < j) {
					need++;
					linetotal++;
				}
				else if(j == 0 && digit == 0){
					need++;
					linetotal++;
				}
				linetotal += digit;
			}
			System.out.println("Case #" + (i+1) + ": " + need);
			need = 0;
			linetotal = 0;
		}
	}

}
