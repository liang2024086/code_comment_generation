package methodEmbedding.Revenge_of_the_Pancakes.S.LYD387;

import java.util.Scanner;

public class Rev {
	public static void main(String args[]) {

		int T;
		Scanner in = new Scanner(System.in);

		T = in.nextInt();
		String[] str = new String[T];
		in.nextLine();

		for(int i = 0; i < T; i++) {
			str[i] = in.nextLine();
		}

		int count;
		for(int i = 0; i < T; i++) {
			count = 0;
			int length = str[i].length();
				for(int j = 1; j < length; j++) {

					if(str[i].charAt(j) != str[i].charAt(j-1)) {
						count++;
					}					
				}

				if(str[i].charAt(length - 1) == '+') {
					System.out.println("Case #"+(i + 1)+": "+count);
				}
				else {
					System.out.println("Case #"+(i + 1)+": "+(count + 1));					
				}
		}
	}
}
