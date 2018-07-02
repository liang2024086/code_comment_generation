package methodEmbedding.Counting_Sheep.S.LYD1302;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ProblemA {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
//		Scanner sc = new Scanner(new File("A.in"));
//		Scanner sc = new Scanner(new File("A-large.in"));
		int t = sc.nextInt();
		int count = 1;
		
		while(t --> 0) {
			int n = sc.nextInt();
			boolean[] nums = new boolean[10];
			Arrays.fill(nums, false);
			
			if(n == 0) {
				System.out.println("Case #" + count + ": INSOMNIA");
			} else {
				boolean foundAll = false;
				int iteration = 1;
				int lastSheep = n;
				
				while(!foundAll) {
					String sheeps = "" + (n*iteration);
					for(int i = 0; i < sheeps.length(); i++) {
						nums[Character.getNumericValue(sheeps.charAt(i))] = true;
					}
					
					boolean temp = true;
					for(int i = 0; i < 10 && temp; i++) {
						temp = nums[i];
					}
					
					foundAll = temp;
					iteration++;
//					System.out.println(sheeps);
					lastSheep = Integer.parseInt(sheeps);
				}
				

				System.out.println("Case #" + count + ": " + lastSheep);
			}
			
			count++;
		}
	}
}
