package methodEmbedding.Standing_Ovation.S.LYD211;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args){
		File a = new File("A-small-attempt0.in");
		Scanner input = null;
		try {
			input = new Scanner(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int number = input.nextInt();
		int cases = number;
		
		while(number > 0) {
			int max = input.nextInt();
			String line = "" + input.nextLine();
			line = line.trim();
			int counter = 0;
			int index = 0;
			int needed = 0;
			while(index < line.length()){
				int people = Integer.parseInt("" + line.charAt(index));
				counter += people;
				if(counter < index + 1){
					needed++;
					counter++;
				}
				index++;
			}
			
			number--;
			System.out.println("Case #" + (cases - number) + ": " + needed);
		}
		
		
	}
}
