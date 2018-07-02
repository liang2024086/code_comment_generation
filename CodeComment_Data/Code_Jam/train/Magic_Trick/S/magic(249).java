package methodEmbedding.Magic_Trick.S.LYD1685;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class magic {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader (new File ("Input.in")));
		
		BufferedWriter output = new BufferedWriter(new FileWriter(new File ("Output.txt")));
		
		int n = Integer.parseInt(input.readLine());
		for (int i = 1;i <= n; i++){
			output.write("Case #" + i + ": ");
			
			int rowNum =  Integer.parseInt(input.readLine());
			int j = 1;
			for (; j < rowNum; j++)
				input.readLine();
			String row1[] = input.readLine().split(" ");
			for (j++; j <= 4; j++)
				input.readLine();
			
			rowNum = Integer.parseInt(input.readLine());
			for (j = 1; j < rowNum; j++)
				input.readLine();
			String row2[] = input.readLine().split(" ");
			for (j++; j <= 4; j++)
				input.readLine();
			
			
			String answer = "";
			boolean found = false;
			for (int a = 0; a < 4; a++){
				for (int b = 0; b < 4; b++){
					if (row1[a].equals(row2[b])){
						if (found != true){
							found = true;
							answer = row1[a];
						}
						else if (found == true)
							answer = "Bad Magician!";
					}
					
				}
			}
			if (found == false)
				answer = "Volunteer Cheated!";
			
			
			output.write(answer);
			output.newLine();
			
			
		}
		
		input.close();
		output.close();
	}

}
