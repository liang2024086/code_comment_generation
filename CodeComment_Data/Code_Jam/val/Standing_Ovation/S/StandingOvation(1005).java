package methodEmbedding.Standing_Ovation.S.LYD683;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {

		String file = "";
		PrintWriter out = new PrintWriter("files/out.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("files/A-small-attempt2.in")));
			
			String line = "";
			while ((line = br.readLine()) != null) {
				file += line +"\n";
			}
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String[] lines = file.split("\n+");
		int numCases = Integer.parseInt(lines[0]);
		
		for (int i = 1; i <= numCases; i++) {
			String[] nums = lines[i].split("\\s+");
			int sMax = Integer.parseInt(nums[0]);
			int personsStanding = nums[1].charAt(0)-'0';
			int personsAdded    = 0;
			
			for (int j = 1; j < sMax+1; j++) {
				int shyness = j;
				
				System.out.println("shy="+j);
				
				if (nums[1].charAt(j) > '0' && personsStanding < shyness) {
					personsAdded += (shyness - personsStanding);
					personsStanding += personsAdded;
					System.out.println("added="+personsAdded);
				}
				
				personsStanding += nums[1].charAt(j) - '0';
			}
			
			out.println("Case #" + i + ": " + personsAdded);
		}
		
		out.close();
		
	}

}
