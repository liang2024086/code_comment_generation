package methodEmbedding.Standing_Ovation.S.LYD1502;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandOvation {
	public StandOvation(String FileName) {

		int m_length;
		try {
			BufferedReader inFile = new BufferedReader(new FileReader(FileName));

			// Read Number of lines in file
			String line = inFile.readLine();
			line = line.trim();
			// variable for number of lines in file
			m_length = Integer.decode(line);
			if (m_length <= 0) {
				System.out.println("Invalid length.  Bad file.");
				inFile.close();

			}
			
			for (int i = 0; i < m_length; i++) {
				String current_line = inFile.readLine();
				int num_people = 0;
				int extra_needed = 0;
				int currentlinelength = current_line.length();
				int spacecodepoint = 0;
				
				
				while(current_line.codePointAt(spacecodepoint) != 32){
					spacecodepoint += 1;
					
				}
				for (int j = spacecodepoint + 1; j <= currentlinelength - 1; j++) {
					
					Character pplatshynessindex_c = current_line.charAt(j);
					int pplatshynexxindex = Integer
							.parseInt(pplatshynessindex_c.toString());
					num_people += pplatshynexxindex;
					if (num_people >= j - spacecodepoint) {
						continue;
					} else {		
						extra_needed += j - spacecodepoint - num_people;
						
						num_people = j - spacecodepoint;
						
					}
				}
				int casenumber = i + 1;
				System.out.println("Case #" + casenumber + ": "  + extra_needed);

			}

			inFile.close();

		} catch (IOException e) {
			System.out.println("Opening file failed.");
			System.out.println(e);
		}
	}

	public static void main(String arg[]) {
		StandOvation a = new StandOvation("A-small-attempt0.in");
	}

}
