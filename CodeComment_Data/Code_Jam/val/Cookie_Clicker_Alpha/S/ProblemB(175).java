package methodEmbedding.Cookie_Clicker_Alpha.S.LYD702;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\output.txt"));
		
		// Test cases
		int testCases = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < testCases; i++) {
			String[] line = reader.readLine().split(" ");
			double C = Double.parseDouble(line[0]);
			double F = Double.parseDouble(line[1]);
			double X = Double.parseDouble(line[2]);
			double CurProduction = 2 + F;
			double CurTime = 0;
			double NewTime = X/2;
			int Step = 0;
			
			do {
				CurTime = NewTime;
				NewTime = C/2 + X/CurProduction;
				
				if (Step > 0) {
					for (int j = 1; j <= Step; j++) {
						NewTime += C/(CurProduction - j * F);
					}
				}
				
				CurProduction += F;
				Step++;				
			} while (NewTime < CurTime);
			
			writer.write("Case #" + (i+1) + ": " + CurTime + "\n");
		}	
		
		writer.close();
		reader.close();
	}

}
