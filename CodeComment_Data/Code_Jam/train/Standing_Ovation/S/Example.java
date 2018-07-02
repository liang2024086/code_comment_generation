package methodEmbedding.Standing_Ovation.S.LYD2172;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = new String();
		int t = scanner.nextInt();
		int n,x,total,callFriends;
		char digit;
		for(int i=0; i<t; i++){
			total=0;
			callFriends=0;
			n = scanner.nextInt();
			string = scanner.next();
			for(int j=0; j<n+1 ; j++){
				digit = string.charAt(j);
				x = Character.getNumericValue(digit);
				if(total<j){
					callFriends+=j-total;
					total += j-total;
				}
				 total+=x;				
			}
			System.out.println("Case #"+(i+1)+": "+callFriends);
		}
	}
};
