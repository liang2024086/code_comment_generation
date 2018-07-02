package methodEmbedding.Magic_Trick.S.LYD889;

import java.io.*;

class Magician {
	public static void main (String[] args) throws java.lang.Exception{
		FileReader input = new FileReader("/Volumes/Disk/MacBook/Dropbox/UBC/co-op/Code Jam/src/testFile.txt");
		BufferedReader bufRead = new BufferedReader(input);
		int numCases = Integer.parseInt(bufRead.readLine());
		int caseNum = numCases;
		while (numCases > 0) {
			int firstGuess = Integer.parseInt(bufRead.readLine());			
			int firstRest = 4 - firstGuess;
			String firstLine = null;
			while (firstGuess > 0) {
				firstLine = bufRead.readLine();
				firstGuess --;
			}
			String[] firstFourNumsString = firstLine.split(" ");
			int [] firstFourNum = new int[4];
			for (int i = 0; i < firstFourNumsString.length; i++)
				firstFourNum[i] = Integer.parseInt(firstFourNumsString[i]);
			while(firstRest > 0){
				bufRead.readLine();
				firstRest --;
			}
			int secondGuess = Integer.parseInt(bufRead.readLine());	
			int secondRest = 4 - secondGuess;
			String secondLine = null;
			while (secondGuess > 0) {
				secondLine = bufRead.readLine();
				secondGuess --;
			}
			String[] secondFourNumsString = secondLine.split(" ");
			int [] secondFourNum = new int[4];
			for (int i = 0; i < secondFourNumsString.length; i++)
				secondFourNum[i] = Integer.parseInt(secondFourNumsString[i]);
			while(secondRest > 0){
				bufRead.readLine();
				secondRest --;
			}
			int sameNum = 0;
			int theNumber = 0;
			for (int i = 0; i < firstFourNum.length; i++) {
				for(int j = 0; j < secondFourNum.length; j++) {
					if (secondFourNum[j] == firstFourNum[i]) {
						sameNum++;
						theNumber = i;
					}
				}
			}
			if(sameNum == 0)
				System.out.println("Case #" + (caseNum - numCases + 1) + ": Volunteer cheated!");
			else if(sameNum > 1) 
				System.out.println("Case #" + (caseNum - numCases + 1) + ": Bad magician!");
			else if(sameNum == 1) {
				System.out.println("Case #" + (caseNum - numCases + 1) + ": " + firstFourNum[theNumber]);
			}
			numCases --;
		}
		bufRead.close();
	}
}




