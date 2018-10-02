package methodEmbedding.Revenge_of_the_Pancakes.S.LYD635;

import java.util.Scanner;
class M2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a[] = new int [t];
		String temp = s.nextLine();
		for(int i = 0; i < t; i++) {
			int c = 0;
			String str = s.nextLine();
			if(str.indexOf('+') == -1) {
				a[i] = 1;
			}
			else
			if(str.indexOf('-') == -1) {
				a[i] = 0;
			}
			else {
				for(int j = 0 ; j < (str.length() - 1); j++) {
					if(str.charAt(j) == '-' && str.charAt(j+1) == '+')
						c++;
					if(str.charAt(j) == '+' && str.charAt(j+1) == '-')
						c++;
				}
				if(str.charAt(str.length() - 1) == '-')
				c++;
				a[i] = c;
			}
		}
		for(int i = 0; i < t; i++) {
		System.out.println("Case #" + (i + 1) + ": " + a[i]);
		}
	}
}
