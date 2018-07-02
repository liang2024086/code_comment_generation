package methodEmbedding.Standing_Ovation.S.LYD361;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File fileInput = new File("A-small-attempt0.in");
		File fileOutput = new File("output.out");
		
		BufferedReader reader = new BufferedReader(new FileReader(fileInput));
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
		
		int cases = Integer.parseInt(reader.readLine());
		
		for (int c = 0; c < cases; c++) {
			
			String commands[] = reader.readLine().split(" ");
			int n = Integer.parseInt(commands[0]);
			String peopleStr[] = commands[1].split("");
			int people[] = new int[n+1];
			
			for (int i = 0; i<n+1; i++) {
				people[i] = Integer.parseInt(peopleStr[i]);
			}
			
			int peopleClapped = 0;
			int friendsNeeded = 0;
			
			for(int i = 0; i<n+1; i++) {
				
				if(people[i]>0) {
					if(peopleClapped>=i) {
						peopleClapped += people[i];
					} else {
						friendsNeeded+=(i-peopleClapped);
						peopleClapped+=((i-peopleClapped) + people[i]);
					}
				}
				
			}
			
			writer.write("Case #" + (c+1) + ": " + friendsNeeded + "\n");
				
		}
		
		reader.close();
		writer.close();
	}

}

