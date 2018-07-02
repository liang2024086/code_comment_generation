package methodEmbedding.Magic_Trick.S.LYD43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;


public class Magic {
	public static void main(String args[]) throws IOException{
		String fileName = "A-small-attempt1.in";
		String error1 = "Bad magician!";
		String error2 = "Volunteer cheated!";
		int caseNum = 0;
		int currentCase = 1;
		int row = 0;
		int answer = 0;

		String[] numbers = new String[4];
		HashSet<Integer> guess = new HashSet<Integer>();
		
		File file = new File("results.txt");
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		line = br.readLine();
		caseNum = Integer.parseInt(line);
		while ((line = br.readLine()) != null) {
			boolean oneAns = false;
			boolean twoAns = false;
			// guess 1
			row = Integer.parseInt(line);
			for (int i = 0; i < row; i++)
				line = br.readLine();

			numbers = line.split(" ");
			for (int i = 0; i < 4; i++) {
				guess.add(Integer.parseInt(numbers[i]));
			}
			for (int i = 0; i <= 4 - row; i++)
				line = br.readLine();

			// guess 2
			row = Integer.parseInt(line);
			for (int i = 0; i < row; i++)
				line = br.readLine();
			numbers = line.split(" ");
			
			for(int i = 0; i < 4; i++){		
				if(guess.contains(Integer.parseInt(numbers[i]))){

					if(!oneAns){
						oneAns = true;
						answer = Integer.parseInt(numbers[i]);
					}else{
						twoAns = true;
					}
				}
			}
			if(!oneAns){
				bw.write("Case #" + currentCase + ": " + error2 + "\n");
			}else if(twoAns){
				bw.write("Case #" + currentCase + ": " + error1 + "\n");
			}else{
				bw.write("Case #" + currentCase + ": " + answer + "\n");
			}
			
			currentCase++;
			guess.clear();
			for (int i = 0; i < 4 - row; i++)
				line = br.readLine();
		}
		br.close();
		bw.close();
	}
}
