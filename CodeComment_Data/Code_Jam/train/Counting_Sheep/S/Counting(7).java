package methodEmbedding.Counting_Sheep.S.LYD1037;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Counting {

	Counting() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		int num = Integer.parseInt(reader.readLine());
		for(int i = 1; i<= num; i++){
			String result = "";
			int beat = Integer.parseInt(reader.readLine());
			String beatStr = String.valueOf(beat);
			String [] allNum = new String [10];
			
			if (beat == 0){
				result = "INSOMNIA";
			}
			else{
				int z = 1;
				int beatR = beat;
				while (allNum[0] == null || allNum[2] == null || allNum[3] == null
					|| allNum[4] == null || allNum[5] == null || allNum[6] == null
				    || allNum[7] == null || allNum[8] == null || allNum[9] == null || allNum[1] == null){
					z = z + 1;
					for (int a = 0; a < beatStr.length(); a++){
						
						int j = Character.getNumericValue(beatStr.charAt(a));
						allNum[j] = "y";
					}
					result = String.valueOf(beat);
					beat = beatR * z;
					beatStr = String.valueOf(beat);
				}
			}
			writer.write("Case #"+i+": "+result);
			writer.newLine();
		}
		writer.close();
		reader.close();
	}
	
	public static void main(String[] args) throws IOException{
		Long start = System.currentTimeMillis();
		new Counting();
		System.out.println((System.currentTimeMillis()-start) / 1000 + "sec");
	}
}
