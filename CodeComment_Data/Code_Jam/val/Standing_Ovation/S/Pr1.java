package methodEmbedding.Standing_Ovation.S.LYD1260;

import java.util.Scanner;


public class Pr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int S, friends, standing;
		String input;
		for(int t=1; t<=T; t++){
			S = s.nextInt();
			input = s.next();
			friends = 0;
			standing = input.charAt(0) - '0';
			for(int i=1; i<=S; i++){
				if(standing < i){
					friends += i-standing;
					standing = i + (input.charAt(i)-'0');
				}
				else standing += input.charAt(i)-'0';
			}
			System.out.println("Case #"+t+": "+friends);
		}
	}

}
