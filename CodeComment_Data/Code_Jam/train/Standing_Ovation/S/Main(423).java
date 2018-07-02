package methodEmbedding.Standing_Ovation.S.LYD415;

import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int z, N, i, j, k;
		String s;
		int added, stand;
		for(z = 1; z <= T; z++){
			N = in.nextInt();
			s = in.next();
			added = 0;
			stand = s.charAt(0) - '0';
			for(i = 1; i < s.length(); i++){
				k = s.charAt(i) - '0';
				if(k > 0){
					//add
					if(i > stand){
						added += i - stand;
						stand += (i - stand) + k;
					}else{
						stand += k;
					}
				}
			}
			System.out.println("Case #" + z + ": " + added);
		}
	}
}
