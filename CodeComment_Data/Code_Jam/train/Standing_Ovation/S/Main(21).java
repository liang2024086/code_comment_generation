package methodEmbedding.Standing_Ovation.S.LYD2022;

import java.util.*;

public class Main {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		
		for(int i = 0; i < cases; i++){
			int maxShy = in.nextInt();
			int clapping = 0;
			int friends = 0;
			String people = in.nextLine();
			people = people.substring(1);
			for(int j = 0; j < people.length();j++){
				int newClapping = Character.getNumericValue(people.charAt(j));
				clapping = clapping + newClapping;
				if(clapping < j+1){
					friends += j+1 - clapping;
					clapping = j+1;
				}
			}
			System.out.print("Case #");
			System.out.print(i+1);
			System.out.print(": ");
			System.out.println(friends);
		}
	}
}
