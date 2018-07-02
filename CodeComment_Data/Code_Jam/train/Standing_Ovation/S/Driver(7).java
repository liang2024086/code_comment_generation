package methodEmbedding.Standing_Ovation.S.LYD1203;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			File file = new File("output.txt");
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			int cases = Integer.parseInt(sc.nextLine());
			int currentStanding, totalStanding;
			int result = 0;
			String inputLine = "";
			for (int i = 0; i < cases; i++){
				currentStanding = 0;
				result = 0;
				inputLine = sc.nextLine();
				totalStanding = inputLine.charAt(0) - 48;
				System.out.println(totalStanding);
				for (int j = 0; j < totalStanding + 1; j++){
					currentStanding += inputLine.charAt(j + 2) - 48;
					if (currentStanding + result <= j){
						result += 1;
					}
				}
				output.write("Case #" + (i + 1) + ": " + result);
				output.newLine();
			}
			output.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
