package methodEmbedding.Magic_Trick.S.LYD1818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MagicTric {
	
	public static void main(String[] args) throws IOException {
		
		int noOfTestCases;
		int first,second;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		noOfTestCases = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 1; i <= noOfTestCases; i++) {
			Set<String> s = new HashSet<String>();
			Set<String> s1 = new HashSet<String>();
			first = Integer.parseInt(br.readLine());
			
			for (int j = 1; j <= 4; j++) {
				if(j == first){
					str = br.readLine();		// store for processing
				}
				else { 
					br.readLine();	//ignore the remaining input
				}
			}
			
			String input1[] = str.split(" ");
			s.addAll(Arrays.asList(input1));
			
			
			second = Integer.parseInt(br.readLine());

			for (int j = 1; j <= 4; j++) {
				if(j == second){
					str = br.readLine();
				}
				else { 
					br.readLine();
				}
			}
			String input2[] = str.split(" ");
			s1.addAll(Arrays.asList(input2));
			
			s.retainAll(s1);
			
			switch(s.size()){
			case 0: 
				System.out.println("Case #"+ i + ": Volunteer cheated!");
				break;
			case 1:
				System.out.println("Case #"+ i +": " + s.iterator().next());
				break;
			default:
				System.out.println("Case #"+ i + ": Bad magician!");
			}
		}
		
	}

}
