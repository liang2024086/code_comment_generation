package methodEmbedding.Standing_Ovation.S.LYD1889;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeJam {

	public static void main(String[] args) {
		Scanner sc = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String line;
		String audience;
		int maxShyness;
		
		try {
			sc = new Scanner(new File("src\\com\\example\\codejam\\A-small-attempt1.in"));
			fw = new FileWriter(new File("src\\com\\example\\codejam\\out.txt"));
			bw = new BufferedWriter(fw);
			
			int numberOfTests = Integer.valueOf(sc.nextLine());
			
			for (int i = 0; i < numberOfTests; i++) {
				line = sc.nextLine();
				maxShyness = Integer.valueOf(line.substring(0, 1));
				audience = line.substring(2);
				int[] audiencePerLvl = new int[maxShyness + 1];
				for (int j = 0; j < audiencePerLvl.length; j++) {
					audiencePerLvl[j] = Integer.valueOf(audience.substring(j, j+1));
				}
				
				
				int totalAudience = 0;
				int audienceNeeded = 0;
				if (audiencePerLvl.length > 1) {
					for (int j = 1; j < audiencePerLvl.length; j++) {
						totalAudience += audiencePerLvl[j - 1];
						if (totalAudience < j) {
							audienceNeeded += j - totalAudience;
							totalAudience += j - totalAudience;
						}
					}
				}
				
				bw.write("Case #"+(i+1)+": "+audienceNeeded+"\n");
			}			
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}		
	}
}
