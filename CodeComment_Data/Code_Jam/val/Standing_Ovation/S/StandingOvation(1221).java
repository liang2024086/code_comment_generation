package methodEmbedding.Standing_Ovation.S.LYD412;


import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int numTestCases = console.nextInt();
		int j = 1;
		while(j<=numTestCases) {
			int Smax = console.nextInt();
			String str = console.next();
			int count = 0,total = 0;
			
			for(int i = 0 ; i <= Smax ; i++) {
				int a = str.charAt(i) - '0';
				if(a==0 && i==0) {
					total = 1;
					count = 1;
					continue;
				}
				if(total >= i) {
					total = total + a;
				} else {
					count = count + (i-total);
					total = total + (i-total) + a;
				}		
			}
			System.out.println("Case #" + j + ": " + count);
			j++;
		}
	}

}
