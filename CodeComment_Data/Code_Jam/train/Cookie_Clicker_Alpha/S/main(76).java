package methodEmbedding.Cookie_Clicker_Alpha.S.LYD483;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	private static int cases;
	
	public static void main(String[] args) {
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<String> input = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File("files/B-small-attempt0.in"));
			
			while (sc.hasNext()) {
				input.add(sc.nextLine());
			}
			sc.close();
			
			// Get nubmer of cases.
			cases = Integer.parseInt(input.get(0));
			int caseNumber = 1;
			for (int i = 1; i <= cases; i++) {
				String[] parameters = input.get(i).split(" ");
				double C = Double.parseDouble(parameters[0]);
				double F = Double.parseDouble(parameters[1]);
				double X = Double.parseDouble(parameters[2]);
				
				double counter = 2.0;
				double time = X / counter;
				boolean finished = false;
				double purchaseTime = 0;
				while (!finished) {
					
					purchaseTime += (C / (counter));
					counter += F;

					double totalTime = purchaseTime + (X / (counter));

					//System.out.println(time + " " + contender);
					if (totalTime < time) {
						time = totalTime;
						
					} else if (totalTime >= time) {
						finished = true;
					}
				}
				output.add("Case #" + caseNumber + ": " + time);
				caseNumber++;
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			PrintWriter writer = new PrintWriter("files/output.txt");
			for (String s : output) {
				writer.println(s);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

