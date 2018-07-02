package methodEmbedding.Magic_Trick.S.LYD1643;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solver {
	public static void main(String[] args) throws IOException{
		if(args.length > 0){
			File file = new File(args[0]);
			Scanner scanner = new Scanner(file);
			String topLine = scanner.nextLine();
			FileWriter fstream = new FileWriter(args[0] + ".out");
			BufferedWriter out = new BufferedWriter(fstream);

			int numberOfTestCases = Integer.parseInt(topLine);

			for(int i = 0; i < numberOfTestCases; i++){
				String values = scanner.nextLine();
				int firstRow = Integer.parseInt(values) - 1;
				int secondRow = 0;
				int firstGuesses[] = new int[4];
				int secondGuesses[] = new int[4];
				
				for(int j = 0; j < 4; j++){
					String vals[] = scanner.nextLine().split(" ");
					if(j == firstRow){
						for(int k = 0; k < 4; k++){
							firstGuesses[k] = Integer.parseInt(vals[k]);
							System.out.print(firstGuesses[k] + " ");
						}
					}
				}
				
				secondRow = Integer.parseInt(scanner.nextLine()) - 1;
				System.out.println("");
				for(int j = 0; j < 4; j++){
					String vals[] = scanner.nextLine().split(" ");
					if(j == secondRow){
						for(int k = 0; k < 4; k++){
							secondGuesses[k] = Integer.parseInt(vals[k]);
							System.out.print(secondGuesses[k] + " ");
						}
					}
				}
				System.out.println("");
				boolean cheated = true;
				int answers = 0;
				for(int j = 0; j < 4; j++){
					for(int k = 0; k < 4; k++){
						if(firstGuesses[j] == secondGuesses[k]){
							cheated = false;
							System.out.println("Found pairs " + secondGuesses[k] + " : " + firstGuesses[j]);;
							if(answers == 0){
								answers = firstGuesses[j];
							}else{
								answers = -1;
							}
						}
					}
				}
				
				String output = "";
				if(cheated){
					output = "Volunteer cheated!";
				}else if(answers == -1){
					output = "Bad magician!";
				}else{
					output = answers + "";
				}
				System.out.println("Case #" + (i+1) + " of " + numberOfTestCases + " done");
				System.out.println("Case #" + (i+1) + ": " + output+ "\n");
				out.write("Case #" + (i+1) + ": " + output+ "\n");
			}
			out.flush();
			out.close();
			fstream.close();
			scanner.close();
			System.out.println("Done");

		}
		else{
			System.out.println("Please use file as arguement");
		}
	}
}
