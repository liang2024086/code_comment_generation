package methodEmbedding.Standing_Ovation.S.LYD446;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		String input;
		int maxShy, count, sum;
		for(int i = 0; i< noOfTestCases; i++){
			count = 0;
			sum = 0;
			input = br.readLine();
			String inputArr[] = input.split(" ");
			maxShy = Integer.parseInt(inputArr[0]);
			
			for(int j=0;j<=maxShy;j++){
				if(sum<j){
					count = count + (j-sum);
					sum = sum+(j-sum);
				}
				sum = sum+Character.getNumericValue(inputArr[1].charAt(j));
				
			}
			System.out.println("Case #"+(i+1)+": "+ count);
		}

	}

}
