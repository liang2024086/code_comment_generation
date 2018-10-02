package methodEmbedding.Standing_Ovation.S.LYD2161;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(buffer.readLine().trim());
		StringBuffer result = new StringBuffer();
		
		for(int t=1; t<=T; t++){
			String input = buffer.readLine().trim();
			int ss1 = input.indexOf(' ',0);
			int sMax = Integer.parseInt(input.substring(0,ss1));
			
			char[] ss = input.substring(ss1+1).toCharArray();
			
			long standing =0,
				 invited=0;
			
			for(int i=0; i<sMax+1; i++){
				int s = Character.getNumericValue(ss[i]);
				
				if(standing + invited < i){
					invited++;
				}
				standing += s;
			}
			result.append("Case #"+t+": "+invited+"\n");
		}
		
		System.out.println(result);
	}
}
