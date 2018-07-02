package methodEmbedding.Standing_Ovation.S.LYD1846;

import java.util.Scanner;


public class Shell {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nbr_case = scan.nextInt();
		String ans = "";
		scan.skip("");
		
		for(int i = 0; i < nbr_case; i++)
		{
			int maxShyness = scan.nextInt();
			String str = scan.next();
			int totalClapping = Integer.parseInt(String.valueOf(str.charAt(0)));
			int missing = 0;
			int tmpMissing;
			for(int j = 1; j < str.length(); j++) {
				int curr = Integer.parseInt(String.valueOf(str.charAt(j)));				
				if (curr > 0) {
					if (totalClapping < j) {
						tmpMissing = (j - totalClapping);
						missing += tmpMissing;
						totalClapping+=tmpMissing;
					}					
					totalClapping+=curr;
				}
			}
			
			
			System.out.println("Case #" +(i+1) +": "+ missing);	
		}
		System.out.flush();
	}

}
