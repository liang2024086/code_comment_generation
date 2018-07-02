package methodEmbedding.Counting_Sheep.S.LYD1095;

import java.util.*;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noTestCases = Integer.parseInt(input.nextLine());
		for (int caseNo=1;caseNo<noTestCases+1;caseNo++){
			int n = Integer.parseInt(input.nextLine());
			boolean[] checkedDigits = new boolean[10];
			int noDigitsNeeded = 10;
			String toPrint = "Case #" + caseNo + ": ";
			if (n==0){
				toPrint += "INSOMNIA";
			}
			else{
				int i = 1;
				int lastN = n;
				while (noDigitsNeeded>0){
					lastN = i*n;
					int noToSplit = lastN;					
					while ((noToSplit > 0) & (noDigitsNeeded>0)) {	//get single digits of current (i*N)
						int nextDigit = noToSplit % 10;
					    if (!checkedDigits[nextDigit]){
					    	checkedDigits[nextDigit] = true;
					    	noDigitsNeeded--;
					    }
					    noToSplit = noToSplit / 10;
					}
					i++;
				}
				toPrint += lastN;
			}
			System.out.println(toPrint);
		}
	}

}
