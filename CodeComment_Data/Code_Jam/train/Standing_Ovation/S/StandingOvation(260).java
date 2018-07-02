package methodEmbedding.Standing_Ovation.S.LYD519;

import java.util.Scanner;


public class StandingOvation {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int num_cases = input.nextInt();
		int max;
		String bitString;
		int standing = 0;
		int invited;
		for(int i=0;i<num_cases;i++){
			invited = 0;
			standing = 0;
			max = input.nextInt();
			bitString = input.next();
			//System.out.println(max+" "+bitString);
			standing+=bitString.charAt(0)-'0';
			for(int j = 1;j<=max;j++){
				//System.out.println((bitString.charAt(j)-'0')+" string representation "+ standing +" number standing" );
				if(standing<j){
					int difference = j-standing;
					invited+=difference;
					standing+=difference;
				}
				standing+=bitString.charAt(j)-'0';
			}
			
			System.out.println("Case #"+(i+1)+": "+invited);
		}
	}

}
