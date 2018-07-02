package methodEmbedding.Standing_Ovation.S.LYD595;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class StandingOviation {
	public static void main(String[] args){
		try{
			String test = null;
			FileReader dataFile = new FileReader("A-small-attempt0.in");
			BufferedReader bufferedDataFile = new BufferedReader(dataFile);
			int numberOfTestCase = Integer.parseInt(bufferedDataFile.readLine());
			PrintWriter writer = new PrintWriter("answer.txt", "UTF-8");
			
			for(int i = 1; i <= numberOfTestCase; i ++){
				String input = bufferedDataFile.readLine();
				String[] input2 = input.split(" ");
				int maximumShyness = Integer.parseInt(input2[0]);
				String numberOfPeople = input2[1];
				int sum = 0;
				
				int accumulatedPeople = 0;
				for(int k = 0; k < numberOfPeople.length(); k ++){
					//System.out.println("currentLevel: " + k);
					//System.out.println(numberOfPeople.substring(k, k + 1));
					//System.out.println("Before loop :" + accumulatedPeople);
					//System.out.println("Before loop sum:" + sum);
					if(accumulatedPeople >= k){
						accumulatedPeople += Integer.parseInt(numberOfPeople.substring(k, k + 1));
					} else {
						int peopleNeeded = k - accumulatedPeople;
						sum += peopleNeeded;
						accumulatedPeople += peopleNeeded;
						accumulatedPeople += Integer.parseInt(numberOfPeople.substring(k, k + 1));
					}
					//System.out.println("After loop: " + accumulatedPeople);
					//System.out.println("After loop sum:" + sum);
				}
				
				writer.println("Case #" + i + ": " + sum);				
			}
			
			writer.close();
	        dataFile.close();
	        bufferedDataFile.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
