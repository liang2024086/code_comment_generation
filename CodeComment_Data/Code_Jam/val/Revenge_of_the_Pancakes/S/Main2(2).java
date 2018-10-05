package methodEmbedding.Revenge_of_the_Pancakes.S.LYD85;

import java.util.Scanner;


public class Main2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++ ) {
			String test = sc.next();
			int count = 0;
			char[] chars = test.toCharArray();
			while (true) {
				int j = 0;
				for (j = test.length() - 1; j >=0 ; j--){
					if (chars[j] == '-') {
						break;
					}
				}
				if (j < 0) {
					System.out.println("Case #"+ (i+1)+": " + count);
					break;
				}
				count++;
				for (int k = 0; k <=j ; k++) {
					char ch = chars[k];
					if (ch == '-') {
						chars[k] = '+';
					} else {
						chars[k] = '-'; 
					}
				}
			}
		}
	}
}
