package methodEmbedding.Counting_Sheep.S.LYD1115;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class countingSheep {
	 
	
	public static void main(String[] args) throws IOException {
		FileWriter output = new FileWriter("D:\\Desktop\\jam\\output.txt");
		BufferedWriter buffOut = new BufferedWriter(output);
		BufferedReader reader = new BufferedReader(new FileReader("D:\\Desktop\\jam\\sample.txt"));
		
		ArrayList<Character> sleepCheck;
		long caseNum = 1;
		
		
		long num = 0;
		long initial = 0;
		String line;
		Boolean sleep = false;
		line = reader.readLine();
		
		while ((line = reader.readLine()) != null) {
			System.out.println("Starting case " + caseNum);
			System.out.println(line);
			initial = Long.parseLong(line);
			num = initial;
			sleepCheck = new ArrayList<>();
			
			if (num==0) {
				buffOut.write("Case #" + caseNum + ": INSOMNIA");
				buffOut.newLine();
				caseNum++;
				continue;
			}
			while (!sleep) {
				for (int i=0;i<line.length(); i++) {
					if (!(sleepCheck.contains(line.charAt(i)))) {
						sleepCheck.add(line.charAt(i));
						if (sleepCheck.size()==10) {
							buffOut.write("Case #" + caseNum + ": " + num);
							buffOut.newLine();
							sleep = true;
						}
					}
				}
				num = num+initial;
				line = Long.toString(num);
			}
			sleep = false;
			caseNum++;
		}
		
		reader.close();
		buffOut.close();
	}
}
