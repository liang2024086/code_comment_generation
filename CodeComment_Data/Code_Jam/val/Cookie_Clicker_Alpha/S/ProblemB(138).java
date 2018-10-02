package methodEmbedding.Cookie_Clicker_Alpha.S.LYD661;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ProblemB {
	static BufferedReader buffReader = null;
	static BufferedWriter buffWriter = null;
	static FileReader fileReader = null;
	static FileWriter fileWriter = null;
	static String input_test = "/Users/qi/Documents/problemB.test";
	static String input_small =  "/Users/qi/Documents/B-small-attempt1.in";
	static String input_large = "/home/qimeng/B-large.in";

	public static final void main(String[] args){
		try {
			//						fileReader = new FileReader(input_test);
			fileReader = new FileReader(input_small);
			//						fileReader = new FileReader(input_large);
			buffReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter("/Users/qi/Documents/problemB.out");
			buffWriter = new BufferedWriter(fileWriter);

			int total_size = Integer.parseInt(buffReader.readLine());
			//iterate through every input line
			for(int i=1; i<=total_size; i++){
				String[] strArr = buffReader.readLine().split(" ");
				Double C = Double.parseDouble(strArr[0]);
				Double F = Double.parseDouble(strArr[1]);
				Double X = Double.parseDouble(strArr[2]);

				//
				Double farmTime = 0.0;
				Double previousTime = 0.0;
				int farmBuilt = 0;
				Double time = 0.0;
				System.out.println();
				while(true){
					if(farmBuilt !=0){
						farmTime = farmTime + C/(2+(farmBuilt-1)*F);
					}
					time = farmTime + X/(farmBuilt*F+2); 
					if(previousTime !=0 && time>= previousTime){
						break;
					}
					previousTime = time;
					farmBuilt++;
				}

				System.out.println("Case #" +i+": "+ previousTime);
				buffWriter.write("Case #" +i+": " + previousTime);
				buffWriter.newLine();
				buffWriter.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffWriter.flush();		
				buffWriter.close();
				buffReader.close();
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
