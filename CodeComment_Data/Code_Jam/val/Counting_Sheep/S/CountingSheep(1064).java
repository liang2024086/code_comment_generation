package methodEmbedding.Counting_Sheep.S.LYD1449;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CountingSheep {
	public static void main(String[] args) throws FileNotFoundException {
		StringBuilder output = new StringBuilder();
		
//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(new File("E:/code jam/input.txt"));
		
		int testCases = Integer.parseInt(scanner.next());
		
		for(int i = 1; i <= testCases; i++){
			
			int n = Integer.parseInt(scanner.next());
//			System.out.println(n);
			boolean digits[] = new boolean[10];
			int count = 0; //the number of insertions in the array digits
			
			int number = n;
			
			int numTries = 1;
			
			while(numTries <= 100){
//				System.out.println("inside while loop"+numTries);
//				System.out.println("count: "+count);
//				System.out.println("n: "+n);
				int temp = n;
				//checking digits in the number
				while(n > 0){
					int d = n %10;
//					System.out.println("digit: "+d+ digits[d]);
					if(!digits[d]){
						digits[d] = true;
						count++;
					}
					n = n/10;
				}
				if(count == 10){
//					System.out.println("appending");
					output.append("Case #"+ i + ": " +temp + "\n");
					break;
				}
				numTries ++;
				n = temp + number;
			}
			if(count != 10){
//				System.out.println("appending");
				output.append("Case #"+ i + ": INSOMNIA" + "\n");
			}
		}
//		System.out.println("outpu"+output);
//		PrintWriter out = new PrintWriter(new File(system.out));
		PrintWriter out = new PrintWriter(new File("E:/code jam/output.txt"));
		out.println(output);
		out.flush();
	}
}
