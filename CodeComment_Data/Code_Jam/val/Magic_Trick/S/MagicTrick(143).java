package methodEmbedding.Magic_Trick.S.LYD1120;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicTrick {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffReader = new BufferedReader(new FileReader("resource/magicTrick.txt"));
		int T = Integer.parseInt(buffReader.readLine());
		String line = null;
		String[] fisrtRow = null, secondRow = null;
		int lineCounter = 1, answerTo1stQ = 0, answerTo2ndQ = 0, matches = 0, testCaseCounter = 1, answer = 0;
		while ((line = buffReader.readLine()) != null) {			
			if (lineCounter == 1) {
				answerTo1stQ = Integer.valueOf(line);
			}
			if (lineCounter == 6) {
				answerTo2ndQ = Integer.valueOf(line);
			}
			if (lineCounter == (1+answerTo1stQ)) {
				fisrtRow = line.split(" ");
			}
			if (lineCounter == (6+answerTo2ndQ)) {
				secondRow = line.split(" ");
			}
			if (lineCounter == 10) {
				for (String answer1: fisrtRow) {
					for (String answer2: secondRow) {
						if (answer1.equals(answer2)) {
							matches++;
							answer = Integer.valueOf(answer1);
						}
					}
				}
				if (matches == 1) {
					System.out.println("Case #"+testCaseCounter+": "+answer);
				} else if (matches == 0) {
					System.out.println("Case #"+testCaseCounter+": "+"Volunteer cheated!");
				} else {
					System.out.println("Case #"+testCaseCounter+": "+"Bad magician!");
				}
				testCaseCounter++;
				matches = 0;
				lineCounter = 0;
			}
			lineCounter++;
		}		
		
		buffReader.close();
	}
}
