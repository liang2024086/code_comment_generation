package methodEmbedding.Standing_Ovation.S.LYD1991;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int q = sc.nextInt();
			String a = sc.next();
			int count = 0;
			int stand = 0;
			int standAntes = 0;
			for(int shylvl = 1; shylvl <= q; shylvl++) {
				stand +=(a.charAt(shylvl) - 48);
				standAntes +=(a.charAt(shylvl - 1) - 48);
				if(count + standAntes < shylvl)
					count++;
			}
			
			System.out.println("Case #" + i +": " + count);
		}
		
		sc.close();
	}

}
