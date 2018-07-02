package methodEmbedding.Standing_Ovation.S.LYD731;

import java.util.Scanner;


public class a {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	
	int f = 0;
	
	for(int i = 1; i <= T; i++){
		
		int Smax = in.next().charAt(0) - 48 ;
		String S = in.next();
		int t = 0;
		
		for(int j = 0; j <= Smax; j++){
			int s = S.charAt(j) - 48;
			
			
			
			if(s == 0){
				continue;
			}
			
			if(t < j){
				f += j - t;
				t += f;
			}
			
			t +=s;
		}
		
		String answer = ("Case #" + i + ": " + f );
		f = 0;
		System.out.println(answer);
		
	}
	
	}
	
}
