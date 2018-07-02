package methodEmbedding.Counting_Sheep.S.LYD1459;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {


				
			
				
	public static void main(String args[]) {
		Scanner s;
		try {
			s = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println(args[0]);
			System.out.println("Your file does not exist");
			return;
		}
		String line = s.nextLine();
		int caseNum = 1;
		//read in a line
		while(s.hasNextLine()) {
			line = s.nextLine().trim();
			int test = Integer.parseInt(line);
			int n = test;
			int arr[] = new int[10];
			int counted = 0;
			int i;
			boolean broken = false;
			//for each line, in a new array, from i=1 to 1000
			for(i = 1; i < 1000; i++) {
				
				//multiply the number by i
				test = n*i;
				
				//check each digit
				//if we are out of digits
				//break
				while(test > 0) {
					int digit = test % 10;
					test = test/10;
					//if a digit is newly added
					if(arr[digit] != 1) {
						//increase the counter
						arr[digit] = 1;
						counted++;
					}
					//if the counter is 10
					if(counted == 10) {
						//that case passes to print your output and continue to next line
						System.out.println("Case #" + caseNum +": " + n*i);
						broken = true;
						break;
					}
					//if the counter is not ten
					   //continue checking the digits
				}
				if(broken) {
					break;
				}

			}
			if(broken) {
				caseNum++;
				continue;
			}
			System.out.println("Case #" + caseNum +": INSOMNIA");
			caseNum++;
		}
	}
}
