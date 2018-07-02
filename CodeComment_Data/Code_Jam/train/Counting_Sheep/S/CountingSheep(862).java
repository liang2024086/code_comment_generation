package methodEmbedding.Counting_Sheep.S.LYD1595;


import java.io.FileReader;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(new FileReader("C:/Users/michaelbrown17/Desktop/A-small-attempt1.in"));
			int cases = scan.nextInt();
			
			
			for(int k = 0; k < cases; k++) {
				boolean repeat = false;
				boolean done = false;
				int[] arr = new int[10];
				for(int i = 0; i < 10; i++) {
					arr[i] = i;
				}
				int n = scan.nextInt();
				int length = 0;
				int curNum = n;
				do {
					if(curNum != 0) {
						//get the amount of digits in each integer
						length = (int)(Math.log10(curNum)+1);
					}
					//hold number after digit is taken off
					int nxNum = curNum;
					
					//go through each digit
					for(int i = 0; i < length; i++) {
						
						//get leftmost digit
						int dig = (int)(nxNum / (Math.pow(10, length - i -1)));
						//make the next number equal to the previous number with the leftmost digit gone
						nxNum = nxNum % (int)(Math.pow(10, length - i - 1));
						
						//set that digit equal to -1 (signifying that it has been called)
						arr[dig] = -1;
						
						
					}
					done = true;
					for(int j = 0; j < arr.length; j++) {
						
						if(arr[j] == j) {
							
							//not done
							done = false;
							
							//break
							break;
						}
					}
					
					//make next number another n value
					curNum += n;
					if(curNum == n) {
						repeat = true;
						curNum = -1;
					}
						
				}	while(!done && !repeat);
				
				String out = "";
				out += (curNum - n);
				
				if(curNum == -1) {
					out = "INSOMNIA";
				}
				
				System.out.println("Case #" + (k + 1) + ": " + out);
			}
			
		}
		catch (Exception e) {
			System.out.println(1);
		}
		
		
	}

}
