package methodEmbedding.Magic_Trick.S.LYD665;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("A-small-attempt1.in"));
			
			String string = s.nextLine();
			int amount = Integer.parseInt(string);
			
			for (int run = 1; run <= amount; run++) {
				List<Integer> list = new LinkedList<Integer>();
				
				int firstAnswer = Integer.parseInt(s.nextLine());
				
				for (int x = 1; x <= 4; x++) {
					String line = s.nextLine();
					
					if (x != firstAnswer) continue;
					
					String regex = "(\\d+) (\\d+) (\\d+) (\\d+)";
					
					for (int k = 1; k <= 4; k++) {
						list.add(Integer.parseInt(line.replaceAll(regex, "$" + k)));
					}
				}
				
				int secondAnswer = Integer.parseInt(s.nextLine());
				int fits = 0;
				int solution = 0;
				
				for (int x = 1; x <= 4; x++) {
					String line = s.nextLine();
					
					if (x != secondAnswer) continue;
					
					String regex = "(\\d+) (\\d+) (\\d+) (\\d+)";
					
					for (int k = 1; k <= 4; k++) {
						int number = Integer.parseInt(line.replaceAll(regex, "$" + k));
						
						if (list.contains(number)) {
							fits++;
							solution = number;
						}
					}
				}
				
				if (fits == 0)
					System.out.println("Case #" + run + ": Volunteer cheated!");
				else if (fits == 1) {
					System.out.println("Case #" + run + ": " + solution);
				}	
				else
					System.out.println("Case #" + run + ": Bad magician!");
			}
			
			
			s.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
