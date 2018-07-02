package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1533;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Two {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader myReader = new BufferedReader(new FileReader("C:\\Users\\William Li\\Desktop\\B-small-attempt0.in"));
		PrintWriter myWriter = new PrintWriter(new FileWriter("C:\\Users\\William Li\\Desktop\\output.out"));
		
		int T = Integer.parseInt(myReader.readLine());
		
		for (int t = 1; t <= T; t++){
			
			String[] nextLine = myReader.readLine().split(" ");
			double[] cookieData = new double[nextLine.length];
			
			for (int i = 0; i < nextLine.length; i++){
				
				cookieData[i] = Double.parseDouble(nextLine[i]);
				
			}
			
			double currentIncome = 2;
			double currentTime = 0;
			
			while (true){
				
				double farmTime = cookieData[2] / (currentIncome + cookieData[1]) + cookieData[0] / currentIncome;
				double continueTime = cookieData[2] / currentIncome;
				
				if (farmTime < continueTime){
					
					currentTime += cookieData[0] / currentIncome;
					currentIncome += cookieData[1];
					
				}else{

					currentTime += cookieData[2] / currentIncome;
					break;
					
				}
				
			}
			
			myWriter.println("Case #" + t + ": " + currentTime);
			
		}
		
		myReader.close();
		myWriter.close();
		System.exit(0);
		
	}
	
}
