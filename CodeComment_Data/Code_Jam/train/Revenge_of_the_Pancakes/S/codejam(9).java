package methodEmbedding.Revenge_of_the_Pancakes.S.LYD316;

import java.util.Scanner;

public class codejam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		int temp=tc;
		while(tc--!=0) {
			String str = in.next();
			char pattern = str.charAt(0);
			int count = 0;
			for(int i=1;i<str.length();i++) {
				if(pattern!=str.charAt(i)) {
					pattern=str.charAt(i);
					count++;
				}
			}
			if(str.charAt(str.length()-1)=='-') count++;
			System.out.println("Case #"+(temp-tc)+": "+count);
		}
		in.close();
	}
}

