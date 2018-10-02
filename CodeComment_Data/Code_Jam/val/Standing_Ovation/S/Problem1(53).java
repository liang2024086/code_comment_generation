package methodEmbedding.Standing_Ovation.S.LYD54;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner =  new Scanner(new File("C:\\Users\\Swapnil\\Downloads\\A-small-attempt2.in"));
		int t = scanner.nextInt();
		int[] output = new int[t];
		for(int j=0; j<t; j++){
			int sMax = scanner.nextInt();
			String inputString = scanner.nextLine().trim();
			int sum = 0;
			int friend = 0;
			for(int i=0; i<inputString.length(); i++){
				int charInt = Character.getNumericValue(inputString.charAt(i));
				if(sum < i || (sum == i && charInt == 0)){
					friend++;
					sum += 1;
					continue;
				}
				sum += charInt;
			}
			output[j]=friend;
		}
		for(int j=0; j<t; j++){
			System.out.println("Case #"+(j+1)+": "+output[j]); 
		}
	}
}
