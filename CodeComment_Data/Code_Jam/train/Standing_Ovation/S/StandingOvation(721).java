package methodEmbedding.Standing_Ovation.S.LYD1397;

/**
 * Manuel Vieda - Copyright (c) 2015
 * http://manuelvieda.com
 * Date: 11/04/2015
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import com.manuelvieda.codejam.practice.OldMagician;

/**
 * @author Manuel E. Vieda
 * @version 1.0
 */
public class StandingOvation {
	
	
	//private static final String INPUT_FILE = "standing_ovation/A-large-practice.in";
	private static final String INPUT_FILE = "standing_ovation/A-small-practice.in";
	
	//private static final String OUTPUT_FILE = "standing_ovation/A-large-practice.out";
	private static final String OUTPUT_FILE = "standing_ovation/A-small-practice.out";
	
	/**
	 * Main Method
	 *
	 * @param args Program arguments
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(final String[] args) throws NumberFormatException, IOException {

		final File outputFile = new File(StandingOvation.class.getClassLoader().getResource(OUTPUT_FILE).getPath());

		try (
				final BufferedReader br = new BufferedReader(new InputStreamReader(
						OldMagician.class.getClassLoader().getResourceAsStream(INPUT_FILE),
						StandardCharsets.UTF_8));

				final OutputStreamWriter bw = new OutputStreamWriter(
						new FileOutputStream(outputFile),
						StandardCharsets.UTF_8)) {

			final int numberOfCases = Integer.valueOf(br.readLine());

			for (int i = 1; i <= numberOfCases; i++) {

				final String[] inputData = br.readLine().split(" ");
				
				int count = 0;
				int added = 0;
				int shyLevel=0;
				for (String shyGroup : inputData[1].split("")) {
					
					int shyness =  Integer.valueOf(shyGroup);
					if(shyness>0){
						int toAdd = 0;
						if(shyLevel>count){
							toAdd = shyLevel-count;
						}
						added += toAdd;
						count += shyness+toAdd;
					}
					shyLevel++;
				}
				bw.write("Case #" + i + ": " +added + "\n");				
			}
			
			System.out.println("DONE: "+outputFile.getPath());
		}
	}
}
