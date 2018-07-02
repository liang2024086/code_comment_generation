package methodEmbedding.Standing_Ovation.S.LYD1918;


import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileReader file = new FileReader("A-small-attempt1.in");
			BufferedReader br = new BufferedReader(file);
			
			String line = "";
			int cases = 0;
			
			if((line = br.readLine()) != null){
				cases = Integer.parseInt(line);
			}
			//create array for all the storeitems
			
			ovation[] ovations = new ovation[cases];
			
			for(int i = 0; i < cases; i++){
				String nl = br.readLine();
				if(Integer.parseInt(nl.substring(0, 1)) != 0){
					int spot = nl.indexOf(" ");
					ovations[i] = new ovation(Integer.parseInt(nl.substring(0, spot)), nl.substring(spot+1));
				}
				
			}

			////////////////print to file//////////////////////////
			PrintWriter writer = new PrintWriter("outputMini.txt", "UTF-8");
			
			for(int i = 0; i < ovations.length; i++){
				if( ovations[i] != null){
					int caseNumber = i+1;
					writer.println("Case #"+caseNumber+": " + ovations[i].answer());
					System.out.println(ovations[i].answer());
				}else{
					int caseNumber = i+1;
					writer.println("Case #"+caseNumber+": 0");
					System.out.println("0");

				}

			}
			
			writer.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
