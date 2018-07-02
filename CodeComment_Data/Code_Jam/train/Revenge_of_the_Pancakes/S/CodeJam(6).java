package methodEmbedding.Revenge_of_the_Pancakes.S.LYD853;

//B
//Revenge of the Pancakes
import java.io.*;
import java.util.*;
public class CodeJam {

	public static void main(String[] args) throws NumberFormatException, IOException{
		//BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		Scanner cin = new Scanner(System.in);
		
		int T = cin.nextInt();
		
		for(int tcase = 1; tcase <= T; tcase++){
			String S = cin.next();
			int flips = 0;
			for(int i = 1; i < S.length(); i++){
				int dif = S.charAt(i) - S.charAt(i - 1);
				
				if(dif != 0){
					flips++;
				}
			}
			if(S.charAt(S.length() - 1) == '-'){
				flips++;
			}
			System.out.println("Case #" + tcase + ": " + flips);
		}
	}
}
