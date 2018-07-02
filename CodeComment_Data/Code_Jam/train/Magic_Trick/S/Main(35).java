package methodEmbedding.Magic_Trick.S.LYD621;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(new File("C:\\input\\A-small-attempt1.in"));
			
			File file = new File("C:\\input\\A-small-attempt1.out");
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.print("Out Put File Creation Failed");
					e.printStackTrace();
				}
			}
			System.setOut(new PrintStream(file));
			
			//Read Test Cases
			boolean hasFirstLine = scanner.hasNextLine();
			int numberOfTestCases = 0;
			if(hasFirstLine) {
				numberOfTestCases = Integer.parseInt(scanner.nextLine());
			}
			
			if(numberOfTestCases == 0) return;
			

			//Read Data Grids
			int[][] answerRowData = new int[numberOfTestCases * 2][4];
			String[] rowData = new String[4];
			int index = 0;
			while(scanner.hasNextLine()) {
				int answerRow = Integer.parseInt(scanner.nextLine());
				String row = "";
				
				//When the Answer for Gird is Not in Range
				assert answerRow <= 4 && answerRow >= 1 : "Grid " + index + ", " + answerRow  + " is not either 1,2,3, or 4";
				
				rowData[0] = scanner.nextLine();
				rowData[1] = scanner.nextLine();
				rowData[2] = scanner.nextLine();
				rowData[3] = scanner.nextLine();
				
				row = rowData[answerRow-1];
				
				String[] numS = row.split(" ");
				
				//When Number of Elements in the gird is not four
				assert numS.length == 4 : "Grid " + index +" Row " + row + " has more than 4 entries : " + numS.length;
				
				for(int j = 0; j < numS.length; j++) {
					
					answerRowData[index][j] = Integer.parseInt(numS[j]);
					assert answerRowData[index][j] >= 1 && answerRowData[index][j] <= 16 : "Grid " + index +" Row " + row + " has invalid number" + answerRowData[index][j] ;
				}
				index++;
			}
			
//			for(int i=0; i < answerRowData.length; i++) {
//				System.out.println(Arrays.toString(answerRowData[i]));
//			}
			
			//Find Answer

			int caseNumber = 1;
			for(int i = 0 ; i < answerRowData.length; i+=2) {

				int answer = -1;
				int numberOfAnswers = 0;
				int[] row1 = answerRowData[i];
				int[] row2 = answerRowData[i + 1];
				
				for(int x = 0; x < 4; x++) {
					for(int y = 0; y < 4; y++ ) {
						if(row1[x] == row2[y]) {
							answer = row1[x];
							numberOfAnswers++;
						}
					}
				}
				
				String print = "Case #" + caseNumber++ + ": ";
				if(answer == -1) {
					print += "Volunteer cheated!";
				} else if (numberOfAnswers != 1 ) {
					print += "Bad magician!";
				} else {
					print += answer;
				}
				
				System.out.println(print);
			}
			assert caseNumber - 1  == numberOfTestCases : "Number of Test Cases Mismatched Expected : " + numberOfTestCases + " Found: " + (caseNumber - 1) ;
		
		} catch (FileNotFoundException e) {
			System.err.print("File Not Found");
			e.printStackTrace();
		}

	}

}
