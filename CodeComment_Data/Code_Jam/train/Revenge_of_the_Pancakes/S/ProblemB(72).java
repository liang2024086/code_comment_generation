package methodEmbedding.Revenge_of_the_Pancakes.S.LYD190;


import java.util.*;

public class ProblemB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String[] testCase = new String[t];
		int [] result = new int[t];

		for(int i = 0; i < t; i++){
			testCase[i] = sc.nextLine();
		}
		
//		for(String s:testCase){
		for(int j = 0; j < t; j++){
			String s = testCase[j]; 
			int count = 0;
			while(true){
				
				if(s.indexOf('-')==-1)	break;//-?? ?????? ????
				else if(s.indexOf('+')==-1) {
					count += 1;
					break;
				}
								
				if(s.charAt(0)=='-'){
					String flip = s.substring(0, s.indexOf("+"));
					s = s.substring(s.indexOf("+"));
					flip = flip.replace('-', '+');
					s = flip.concat(s);
				}else if(s.charAt(0)=='+'){
					String flip = s.substring(0, s.indexOf("-"));
					s = s.substring(s.indexOf("-"));
					flip = flip.replace('+', '-');
					s = flip.concat(s);
				}
//				String reverse = s.substring(0,3);
//				reverse.replace('-', '+');
//				s = new StringBuffer(reverse).reverse().toString().concat(s.substring(3));
	//			System.out.println("-?? ????: " + s.indexOf('-'));
				count++;
			}
			result[j] = count;
		}
//		}
		for(int k = 1; k <= t; k++){
			System.out.println("Case #"+k+": "+result[k-1]);
		}
	}
}
