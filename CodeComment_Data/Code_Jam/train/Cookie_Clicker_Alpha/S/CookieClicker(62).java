package methodEmbedding.Cookie_Clicker_Alpha.S.LYD635;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class CookieClicker {
	
	public static String inputFileName = "B-small-attempt0.in";
	public static String outputFileName = "B-small-attempt0.out";
	public static String location= "C:\\input\\";		

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(new File(location + inputFileName));
			
			File file = new File(location + outputFileName);
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
			
			double[][] inputs = new double[numberOfTestCases][3];
			
			int index = 0;
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();
				
				String[] inputValueString = row.split(" ");
				assert inputValueString.length == 3 : "Input Value String Should have only 3 values: " + Arrays.toString(inputValueString);
				for(int i = 0; i < 3; i++) {
					inputs[index][i] = Double.parseDouble(inputValueString[i]);
				}
				index++;
			}
			
//			for(int i = 0; i < inputs.length; i++) {
//				System.out.println(Arrays.toString(inputs[i]));
//			}

			//Finding the answer
			int caseNumber = 1;
			for(int i = 0 ; i < inputs.length; i++) {
					double C = inputs[i][0];
					double F = inputs[i][1];
					double X = inputs[i][2];
					double r = 2 ; // rate of production
					double t = 0;
					boolean foundAnswer = false;

					while(!foundAnswer) {
						double timeToReachNext_C = C / r;
						double timeToReach_X_withoutAnotherFactory = X / r;
						double timeToReach_X_withAnotherFactory = timeToReachNext_C + (X  / ( r + F ));
						
						
//						System.out.printf("W: %f, WO: %f \n", timeToReach_X_withAnotherFactory, timeToReach_X_withoutAnotherFactory);

						if(timeToReachNext_C < timeToReach_X_withoutAnotherFactory) {
							if(timeToReach_X_withoutAnotherFactory < timeToReach_X_withAnotherFactory) {
								foundAnswer = true;
								t += timeToReach_X_withoutAnotherFactory;
								break;
							}
							t += timeToReachNext_C;
							r += F;
						} else {
							foundAnswer = true;
							t += timeToReach_X_withoutAnotherFactory;
							break;
						}
					} 
					System.out.printf("Case #%d: %.7f\r\n", caseNumber++, t);
			}
			
			assert caseNumber - 1  == numberOfTestCases : "Number of Test Cases Mismatched Expected : " + numberOfTestCases + " Found: " + (caseNumber - 1) ;
					
		} catch (FileNotFoundException e) {
			System.err.print("File Not Found");
			e.printStackTrace();
		}

	}
	

}
