package methodEmbedding.Standing_Ovation.S.LYD82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String first_line = br.readLine();
		
		int testCases = Integer.parseInt(first_line);
		for(int i=0; i<testCases; i++){
			String line = br.readLine();
			String[] contents = line.split(" ");
			
			int kmax = Integer.parseInt(contents[0]);
			
			int totalStanding = Integer.parseInt(contents[1].charAt(0)+"");
			int friends = 0;
			
			for(int j=1;j<kmax+1;j++){
				if(Integer.parseInt(contents[1].charAt(j)+"") == 0)
					continue;
				
				if(totalStanding >= j){
					totalStanding += Integer.parseInt(contents[1].charAt(j)+"");
				}else{
					friends += j - totalStanding;
					totalStanding += (j - totalStanding)+Integer.parseInt(contents[1].charAt(j)+"");
				}
			}
			System.out.println("Case #"+(i+1)+": "+friends);
		}
	}

}
