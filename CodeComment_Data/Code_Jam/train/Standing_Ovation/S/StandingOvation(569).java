package methodEmbedding.Standing_Ovation.S.LYD993;

import java.io.BufferedReader;
import java.io.FileReader;


public class StandingOvation {

	public static void main(String[] args) {
		String output = "Case #";
		int testCase;
		BufferedReader br;
		String[] temp;
		int[] audience;
		int Smax;
		int invites;
		int totalAudience;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\John\\Downloads\\A-small-attempt0.in"));
			testCase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testCase; i++){
				temp = br.readLine().split(" ");
				Smax = Integer.parseInt(temp[0]);
				audience = new int[Smax + 1];
				for(int j = 0; j <= Smax; j++){
					audience[j] = Integer.parseInt(temp[1].substring(j, j+1));
				}
				invites = 0;
				totalAudience = 0;
				for(int j = 0; j < audience.length; j++){
					while(totalAudience < j){
						invites++;
						totalAudience++;
					}
					totalAudience += audience[j];
				}
				
				
				System.out.println(output + (i + 1) + ": " + invites);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
