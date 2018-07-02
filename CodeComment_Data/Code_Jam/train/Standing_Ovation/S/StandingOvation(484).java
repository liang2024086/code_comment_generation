package methodEmbedding.Standing_Ovation.S.LYD598;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class StandingOvation {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt1.in"));
		String line = reader.readLine();
		int t = Integer.parseInt(line);
		
		FileWriter writer = new FileWriter("output_2.out");
		for(int i=0; i<t; i++){
			line = reader.readLine();
			int Smax = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			line = line.substring(line.indexOf(" ")+1);
			int numOfCanStand = 0;
			
			int numberofInvited = 0;
			for(int j=0; j<=Smax ; j++){
				int currentAudience = Integer.parseInt(line.charAt(j)+"");
				
				if(j <= numOfCanStand || currentAudience == 0)
					numOfCanStand += currentAudience;
				else{
					numberofInvited += (j-numOfCanStand);
					
					numOfCanStand += (currentAudience + numberofInvited);
				}
			}
			writer.write("Case #" + (i+1) + ": " + numberofInvited + "\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
	}

}
