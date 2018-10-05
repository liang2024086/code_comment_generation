package methodEmbedding.Standing_Ovation.S.LYD939;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args){
		try{
			Scanner scan = new Scanner(new File("C:/google15/standingOvation/A-small-attempt0.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("C:/google15/standingOvation/so_output.txt")));
			boolean isFirstLine=true;
			int T =0;
			int linecount=0;
			while(scan.hasNextLine()){
				if(isFirstLine){
					isFirstLine=false;
					T= Integer.parseInt(scan.nextLine());
					continue;
				}
				
				for(int i=0; i<T; i++){
					String line = scan.nextLine();
					String[] audience = line.split(" ");
					int maxShyness = Integer.parseInt(audience[0]);
					//int audNeeded=0;
					int currAudience=0;
					int totalAudNeeded=0;
					char[] ch = audience[1].toCharArray();
					for(int j=0; j<maxShyness+1; j++){
						int audNeeded=0;
						if(currAudience<j){
							audNeeded = j-currAudience;
							totalAudNeeded+=audNeeded;
						}
						int audAtJ = Character.getNumericValue(ch[j]);
						currAudience+=(audNeeded+audAtJ);
					}

					linecount++;
					output.write("Case #"+Integer.toString(linecount)+": "+totalAudNeeded );
					output.newLine();					
				}

				
			}
			output.close();
			System.out.println("Done");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
