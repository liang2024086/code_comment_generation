package methodEmbedding.Magic_Trick.S.LYD2007;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MagicTrick {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");
	
	
	public static void main(String[] args) {
		String output = "";
		int testCases, ans1, ans2, amountFound, lastFound = 0;
		
		
		String[][] cards1 = new String[4][4];
		String[][] cards2 = new String[4][4];
		
		try{
			testCases = Integer.parseInt(stdin.readLine());	
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			
			//loop through test cases
			for (int i = 0; i < testCases; i++) {
				amountFound = 0;
				
				ans1 = Integer.parseInt(stdin.readLine());
				cards1[0] = stdin.readLine().split(" ");
				cards1[1] = stdin.readLine().split(" ");
				cards1[2] = stdin.readLine().split(" ");
				cards1[3] = stdin.readLine().split(" ");
				
				ans2 = Integer.parseInt(stdin.readLine());
				cards2[0] = stdin.readLine().split(" ");
				cards2[1] = stdin.readLine().split(" ");
				cards2[2] = stdin.readLine().split(" ");
				cards2[3] = stdin.readLine().split(" ");
				
				
				
				for (int j = 0; j < cards1[ans1-1].length; j++) {
					
					for (int k = 0; k < cards2[ans2-1].length; k++) {
						if(cards1[ans1-1][j].equals(cards2[ans2-1][k])){
							amountFound++;
							lastFound = Integer.parseInt(cards1[ans1-1][j]);
						}
					}
				}
				
				
				
				output += "Case #" + (i+1) + ": ";
				if(amountFound == 0){
					output += "Volunteer cheated!";
				}else if(amountFound == 1){
					output += lastFound;
				}else{
					output += "Bad magician!";
				}
				output += "\n";
			}
			
			//System.out.println(output);
			writer.println(output);
			writer.close();
				
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
