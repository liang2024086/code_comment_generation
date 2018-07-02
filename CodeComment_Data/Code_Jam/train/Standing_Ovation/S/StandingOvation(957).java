package methodEmbedding.Standing_Ovation.S.LYD235;


import java.util.Scanner;

public class StandingOvation {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for (int cs = 1; cs <= cases; cs++) {
			
			int smax = sc.nextInt();
			
			char  [] chr = sc.next().toCharArray();
			
			int total = 0, result = 0;
			
			for(int i = 0; i <= smax; i++) {
				
				int shyness = Character.getNumericValue(chr[i]);
			
				if(i > total) {
					result += (i - total);
					total = i;
				}
				
				total += shyness;
			}
			
			System.out.println("Case #" + cs + ": " + result);
		}
	}

}
