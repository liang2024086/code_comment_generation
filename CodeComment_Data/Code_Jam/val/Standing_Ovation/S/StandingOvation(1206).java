package methodEmbedding.Standing_Ovation.S.LYD1966;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(new File("C:\\Users\\Edmund\\Desktop\\Input.txt"));
			//Scanner input = new Scanner(new File("C:\\Users\\Edmund\\Desktop\\test.txt"));
			int testcases = input.nextInt();

			FileWriter fstream = new FileWriter("C:\\Users\\Edmund\\Desktop\\out.txt");
			BufferedWriter out = new BufferedWriter(fstream);

			for (int t = 1; t <= testcases; t++) {
				int max_shyness = input.nextInt();
				String audience = input.nextLine().substring(1);

				int total_people = 0;
				int add_people = 0;
				int total_add = 0;
				for(int i=0; i<audience.length();i++){
					Character val = audience.charAt(i);
					int people = Integer.parseInt(val.toString());

					if(total_people < i && people > 0){
						add_people = i - total_people;
						total_people = total_people + add_people;
						total_add += add_people;
					}
					total_people += people;
				}
				
				System.out.println("Case #" + t + ": " + total_add);
				out.write("Case #" + t + ": " + total_add);
				if(t!= testcases)
					out.newLine();
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
