package methodEmbedding.Standing_Ovation.S.LYD267;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i = 1; i <= t; i ++){
			int k = scanner.nextInt();
			String s = scanner.nextLine();
			s = s.substring(1, s.length());
			//System.out.println(s);
			int res = 0;
			int count = 0;
			for(int j = 0; j < s.length(); j++){
				int nr = (int) (s.charAt(j)-'0');
				//System.out.println(nr);
				if(nr > 0 && count < j && i > 0){
					res += j - count;
					count = j;
					count += nr;
				} else {
					count += nr;
				}
			}
			System.out.println("Case #"+i+": "+res);
		}
	}

}
