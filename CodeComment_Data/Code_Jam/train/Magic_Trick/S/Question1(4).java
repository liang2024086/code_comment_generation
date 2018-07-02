package methodEmbedding.Magic_Trick.S.LYD1788;

import java.util.ArrayList;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); // Number of test case.
		
		for (int i = 1; i <= testCase; i++){
			
			int choice1 = sc.nextInt();
			int cardno = 0;
			ArrayList<Integer> cards = new ArrayList<Integer>();
			int numberTrue = 0;
			int answer = 0;
			
			for (int j = 1; j <= (choice1 - 1) * 4; j++){
				
				sc.nextInt();
				cardno++;
				
			}
			
			for (int j = 0; j < 4; j++){
				
				cards.add(sc.nextInt());
				cardno++;
				
			}
			
			while (cardno != 16){
				
				sc.nextInt();
				cardno++;
				
			}
			
			int choice2 = sc.nextInt();
			
			for (int j = 1; j <= (choice2 - 1) * 4; j++){
				
				sc.nextInt();
				cardno++;
				
			}
			
			for (int j = 1; j <= 4; j++){
				
				int temp = sc.nextInt();
				cardno++;
				
				if (cards.contains(temp)){
					
					answer = temp;
					numberTrue++;
					
				}
				
			}
			
			while (cardno != 32){
				
				sc.nextInt();
				cardno++;
				
			}
			
			if (numberTrue == 0){
				
				System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				
			} else if (numberTrue == 1){
				
				System.out.println("Case #" + i + ": " + answer);
				
			} else {
				
				System.out.println("Case #" + i + ": " + "Bad magician!");
				
			}
			
		}

	}

}
