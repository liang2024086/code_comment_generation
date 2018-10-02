package methodEmbedding.Standing_Ovation.S.LYD1412;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// ///////////////////////////////////////////////////////////////////
		// long start = System.nanoTime();
		// ///////////////////////////////////////////////////////////////////
		//Scanner inFile = new Scanner(new File("p1.txt"));
		 Scanner inFile = new Scanner(new File("A-small-attempt0.in"));
		// Scanner inFile = new Scanner(new File("A-Large.in"));
		PrintWriter out = new PrintWriter("p1out.txt");
		int numberOfTimes = inFile.nextInt();
		
		for (int times = 1; times <= numberOfTimes; times++) {
//			System.out.println("Start");
			int maxShy = inFile.nextInt();
			int number = inFile.nextInt();
			int membersToAdd=0;
			int runningTot=0;
			
			int [] list = new int[maxShy+1];
			for (int i = maxShy; i >= 0; i--) {
				list[i] = number % 10;
				number /= 10;
			}
//			for (int i = 0; i <list.length; i++) {
//				System.out.print(list[i]);
//			}
//			System.out.println();
			if(list[0]==0){
				membersToAdd=1;
			}
			for (int i = 0; i <list.length; i++) {
//				System.out.print(runningTot+membersToAdd+" "+i+" ");
				if(runningTot+membersToAdd<i){
					membersToAdd+=i-runningTot-membersToAdd;
				}
				runningTot+=list[i];
//				System.out.println(membersToAdd);
			}
//			System.out.println();
			System.out.println("Case #"+times+": "+membersToAdd);
			out.println("Case #"+times+": "+membersToAdd);
//			System.out.println();

		}

		inFile.close();
		out.close();
		// ///////////////////////////////////////////////////////////////////
		// long stop = System.nanoTime();
		// System.out.printf("Run time: %.1f ms%n", (stop - start) / 1000000.0);
		// System.out.println("End of Program");
		// ///////////////////////////////////////////////////////////////////
	}
}
