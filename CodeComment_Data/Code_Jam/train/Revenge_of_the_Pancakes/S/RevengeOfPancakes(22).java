package methodEmbedding.Revenge_of_the_Pancakes.S.LYD706;

import java.util.Scanner;

public class RevengeOfPancakes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int j = 1;
		while(t-- > 0){
			String str = in.next();
			int flipCount = 0;
			char ch = str.charAt(0);
			if(ch == '-') ++flipCount;
			for(int i=1; i < str.length(); ++i){
				if(str.charAt(i) != ch && str.charAt(i) != '+'){
					flipCount += 2;
					ch = str.charAt(i);
				} else {
					ch = str.charAt(i);
				}
			}
			System.out.println("Case #"+j+": "+flipCount);
			++j;
		}
	}
}
