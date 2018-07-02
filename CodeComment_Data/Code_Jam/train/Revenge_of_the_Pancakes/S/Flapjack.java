package methodEmbedding.Revenge_of_the_Pancakes.S.LYD181;

import java.util.Scanner;

public class FlapJack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0 ; i < T ; i++){
			String pancakes = scan.next();
			char curr = pancakes.charAt(0);
			int flips = 1;
			for(int j= 1;j<pancakes.length();j++){
				if(pancakes.charAt(j)!=curr){
					flips++;
					curr = pancakes.charAt(j);
				}
			}
			if(curr=='+')
				flips--;
			System.out.println("Case #"+(i+1)+": "+flips);
		}
		scan.close();
	}

}

