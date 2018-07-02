package methodEmbedding.Magic_Trick.S.LYD114;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class magicianSmall {

	public static void main(String[] args) {
		new magicianSmall();
	}
	
	public magicianSmall() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File("testinput.txt")));
			
			int caseNum = 1;
			int numCases = Integer.parseInt(br.readLine());
			for(int i=0; i < numCases; i++) {
				int firstAnswer = Integer.parseInt(br.readLine());
				
				//First Grid
				String possibleAnswers1 = "";
				for(int r = 0; r < 4; r++) {
					String line = br.readLine();
					if(r+1 == firstAnswer)
						possibleAnswers1 = line;
				}
				String[] possibleAnswersArray1 = possibleAnswers1.split(" ");
				
				int secondAnswer = Integer.parseInt(br.readLine());
				
				//Second Grid
				String possibleAnswers2 = "";
				for(int r = 0; r < 4; r++) {
					String line = br.readLine();
					if(r+1 == secondAnswer) {
						possibleAnswers2 = line;
					}
				}
				String[] possibleAnswersArray2 = possibleAnswers2.split(" ");
				
				int numSame = 0;
				String lastSame = "";
				for(int k = 0; k < 4; k++) {
					for(int j = 0; j < 4; j++) {
						if(possibleAnswersArray1[k].equals(possibleAnswersArray2[j])) {
							numSame++;
							lastSame = possibleAnswersArray1[k];
						}
					}
				}
				
				
				System.out.print("Case #"+caseNum+": ");
				if(numSame == 0)
					System.out.println("Volunteer cheated!");
				if(numSame == 1)
					System.out.println(lastSame);
				if(numSame > 1)
					System.out.println("Bad magician!");
				caseNum++;
			}
			
//			String line;
//			while ((line = br.readLine()) != null) {
//			   // process the line.
//			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
