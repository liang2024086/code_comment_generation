package methodEmbedding.Magic_Trick.S.LYD1683;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(
					"input\\A-small-attempt0.in");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			int magicCount = Integer.parseInt(br.readLine());

			ArrayList<Object> output = new ArrayList<Object>(magicCount);

			String strLine;
			for (int i = 0; i < magicCount; i++) {
				String[] firstRow = new String[4];
				String[] secondRow = new String[4];
				
				String firstAnswer = br.readLine();

				for (int j = 0; j < 4; j++) {
					strLine = br.readLine().trim();
					
					if(j+1 == Integer.parseInt(firstAnswer)){
						firstRow = strLine.split(" ");
					}
				}
				
				String secondAnswer = br.readLine();
				
				for (int j = 0; j < 4; j++) {
					strLine = br.readLine().trim();
					
					if(j+1 == Integer.parseInt(secondAnswer)){
						secondRow = strLine.split(" ");
					}
				}
				
				int counter1 = 0, counter2=0;
				int found = 0;
				for(;counter1 <4; counter1++){
					for(counter2 = 0;counter2<4;counter2++){
						if(firstRow[counter1].equals(secondRow[counter2])){
							found++;
							if(found == 1){
								output.add(firstRow[counter1]);
							}else if(found > 1){
								output.remove(output.size() -1);
								output.add(Result.BAD_MAGICIAN);
							}
						}
					}
				}
				if(found == 0){
					output.add(Result.VOLUNTEAR_CHEATED);
				}
			}

			// Close the input stream
			in.close();

			FileWriter fstreamOut = new FileWriter(
					"output\\A-small-attemp0.out");
			BufferedWriter out2 = new BufferedWriter(fstreamOut);
			int counter = 0;
			for (Object result : output) {
				System.out.println(result.toString());
				String resultString = "";
				if(result instanceof Result){
					if(result.equals(Result.BAD_MAGICIAN)){
						resultString = "Bad magician!";
					}else if(result.equals(Result.VOLUNTEAR_CHEATED)){
						resultString = "Volunteer cheated!";
					}
				}else{
					resultString = result.toString();
				}
					
				out2.write("Case #" + String.valueOf(counter + 1) + ": "
						+ resultString + "\n");
				counter++;
			}

			out2.close();

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}

	public enum Result {
		BAD_MAGICIAN, VOLUNTEAR_CHEATED
	}

}
