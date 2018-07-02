package methodEmbedding.Standing_Ovation.S.LYD163;

import java.util.Scanner;


public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i = 1; i<= N; i++){
			int A = scanner.nextInt();
			int MA = 0;
			int clapMan = 0;
			
			String SInput = scanner.next(); 
			int [] S = new int[A+1];
			
			for (int j = 0; j < SInput.length(); j++  ){
				S[j] = Integer.parseInt(SInput.charAt(j) + "");
				// System.out.println(clapMan +": " + j);
				if( j > clapMan) {
					MA++;
					clapMan = clapMan + 1;
				}
				clapMan = clapMan + S[j];
			}
			
			System.out.println("Case #"+ i +": " + MA);
			
		}
		
	}

}
