package methodEmbedding.Speaking_in_Tongues.S.LYD834;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class R0_1_2012 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			String english = "yhesocvxduiglbkrztnwjpfmaq";
			String googlese = "abcdefghijklmnopqrstuvwxyz";
			
			int T = Integer.parseInt(bf.readLine());
			
			for (int i=0; i<T; i++) {
				
				String G = bf.readLine();
				StringBuffer E = new StringBuffer("");
				for (int j=0; j<G.length(); j++) {
					
					if (G.charAt(j) == ' ') 
						E.append(" ");
					else {
						int pos = googlese.indexOf(G.substring(j, j+1));
						E.append(english.charAt(pos));
					}
					
				}
				
				System.out.println("Case #" + (i+1) + ": " + E.toString());
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
