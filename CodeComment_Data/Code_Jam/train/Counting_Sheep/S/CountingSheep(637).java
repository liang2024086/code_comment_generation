package methodEmbedding.Counting_Sheep.S.LYD131;

import java.util.*;
import java.io.*;

public class CountingSheep {

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		File file = new File(in.next());
		
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		int size = fileIn.nextInt();
		
		for (int i = 1; i <= size; i++) {
			int N = fileIn.nextInt();
			int j = 1;
			
			boolean allNumsFound = false;
			ArrayList<Integer> nums = new ArrayList<>();
			int split = 0;
			
			if(N == 0){
				System.out.println("Case #" + i + ": INSOMNIA");
				allNumsFound = true;
			}
			
			while(!allNumsFound){
				split = N * j;
				int divide = split;
				
				while(divide > 0){
					int nextNum = divide % 10;
					divide = divide/10;
					if(!(nums.contains(nextNum))){
						nums.add(nextNum);
					}
				}
				
				if(nums.size() == 10){
					allNumsFound = true;
					System.out.println("Case #" + i + ": " + split);
				}
				j++;
			}
		}
	}
}
