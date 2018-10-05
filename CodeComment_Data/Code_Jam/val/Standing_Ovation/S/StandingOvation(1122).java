package methodEmbedding.Standing_Ovation.S.LYD8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.MalformedInputException;

public class StandingOvation {

	public static void main(String[] args) {
		String fileName = "input.txt";
		int lineNo = 0;
		try {

			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();

			while (line != null) {

				if (lineNo > 0) {
					int add = 0;
					int sum = 0;
					String[] TC = line.split(" ");
					int sMax = Integer.parseInt(TC[0]);
					String audience = TC[1];
					
					for(int i = 0; i <= sMax; i++){			
						int row = Integer.parseInt(Character.toString(audience.charAt(i)));
						if((row > 0) && (i > sum)){
							add += (i - sum);
							sum += (i - sum);
						}
						sum += row;
					}
					System.out.println("Case #" + lineNo + ": " + add);
				}

				line = br.readLine();
				lineNo++;
			}
			br.close();
		} catch (java.io.FileNotFoundException fnfe) {
			System.out.println("File not found: " + fileName);
		} catch (MalformedInputException e) {
			System.out.println(e.getMessage() + ": in " + fileName
					+ ", Line Number - " + lineNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
