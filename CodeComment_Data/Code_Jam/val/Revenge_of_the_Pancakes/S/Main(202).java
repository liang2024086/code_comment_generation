package methodEmbedding.Revenge_of_the_Pancakes.S.LYD851;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	static int T;
	static String line;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/qualification/b_revengeOfThePancakes/B-small-attempt0.in"));
		System.setOut(new PrintStream("src/qualification/b_revengeOfThePancakes/B-small-attempt0.out"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine().trim());
		for(int test_case = 1; test_case <= T; test_case++){
			line = br.readLine();
			char tmp = line.charAt(0);
			int count = 0;
			for(int i = 1; i < line.length(); i++){
				char side = line.charAt(i);
				if(side != tmp){
					count++;
				}
				tmp = side;
			}
			if((line.charAt(0) == '-' && count % 2 == 0) || (line.charAt(0) == '+' && count % 2 == 1)) count++;
			System.out.println("Case #"+test_case+": "+count);
		}
	}
}
