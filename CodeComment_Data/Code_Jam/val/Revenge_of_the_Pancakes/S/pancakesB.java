package methodEmbedding.Revenge_of_the_Pancakes.S.LYD138;

import java.util.*;

public class pancakesB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		for (int i=1; i<=T; i++) {
			boolean minus = false;
			char[] string = s.next().toCharArray();
			int p = 0;
			while (p<string.length && string[p] == '-') { //firstmost +
				minus = true;
				p++;
			}
			
			char curr = '+';
			int count = 0;
			for ( ; p<string.length; p++) {
				if (string[p] != curr) {
					curr = string[p];
					count++;
				}
			}
			int answer = (count%2 == 0) ? count: count+1;
			if (minus)
				answer++;
			System.out.println("Case #"+i+": "+answer);
		}
		
		s.close();
	}

}
