package methodEmbedding.Revenge_of_the_Pancakes.S.LYD204;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class yumyum {
	public static void main(String[] args){
		try{
			FileReader reader = new FileReader("B-small-attempt0.in");
			BufferedReader buffReader = new BufferedReader(reader);
			
			FileWriter writer = new FileWriter("output.txt");
			BufferedWriter buffWriter = new BufferedWriter(writer);
			
			String line=buffReader.readLine();
			int caseNum = 1;
			
			while ((line=buffReader.readLine())!=null){
				
				int flips=0;
				int i;
				
				for(i=0;i<line.length()-1;i++){
					
					if (!line.substring(i,i+1).equals(line.substring(i+1,i+2))){
						flips++;
					}
					
				}
				if (line.substring(i,i+1).equals("-")){
					flips++;
				}

				buffWriter.write("case #" + Integer.toString(caseNum) + ": " + Integer.toString(flips));
				buffWriter.newLine();
				
				caseNum++;
			}
			
			buffWriter.close();
			buffReader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
