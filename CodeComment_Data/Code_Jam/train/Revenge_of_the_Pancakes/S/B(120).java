package methodEmbedding.Revenge_of_the_Pancakes.S.LYD957;

import java.util.*;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.nextLine());	//#test cases

		String s;
		int flips;
		for(int i = 0; i < t; i++){

			s = sc.nextLine();
			flips = 0;
			for(int j = s.length()-1; j >= 0; j--){
				if(s.charAt(j) == '+'){
					if(flips % 2 != 0){ //Impair
						flips++;
					}
				}
				else{
					if(flips % 2 == 0){ //Pair
						flips++;
					}
				}
			}

			System.out.println("Case #"+(i+1) + ": "+flips);

		}

	}



}
