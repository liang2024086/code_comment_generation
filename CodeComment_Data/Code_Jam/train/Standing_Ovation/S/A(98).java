package methodEmbedding.Standing_Ovation.S.LYD1504;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		Scanner scan = null;
		
		try {
			scan = new Scanner(System.in);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < T; i++) {
			int sMax = scan.nextInt();
			String audienceString = scan.nextLine();
			
			if(audienceString.length() == 0) {
				audienceString = "";
			} else {
				audienceString = audienceString.substring(1, audienceString.length());
			}
			
			if(audienceString.equals("")) {
				System.out.println("Case #" + (i + 1) + ": " + 0);
				continue;
			}
			
			int[] audience = new int[sMax + 1];
			
			for(int j = 0; j < audience.length; j++) {
				audience[j] = Integer.parseInt(audienceString.substring(j, j + 1));
			}
			
			int total = 0;
			int extras = 0;
			
			for(int k = 0; k < (sMax + 1); k++) {
				
				if(audience[k] != 0 && total < k) {
					for(int n = k - 1; n >= 0; n--) {
						if(total >= n) {
							audience[n] = audience[n] + (k - total);
							extras = extras + (k - total);
							total = total + (k - total);
						}
					}
					
				}
				
				total = total + audience[k];
		
			}
			
			System.out.println("Case #" + (i + 1) + ": " + extras);
		}
	}
}
