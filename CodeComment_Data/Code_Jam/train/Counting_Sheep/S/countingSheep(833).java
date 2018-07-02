package methodEmbedding.Counting_Sheep.S.LYD1583;


import java.io.*;
import java.util.*;

public class countingSheep {

	public static void main(String[] args) throws FileNotFoundException {
	    
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		System.setIn(new FileInputStream("A-small-attempt0.in"));
		
		Set<Integer> uncountedDigits = new HashSet<Integer>();
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int numOfCases = sc.nextInt();
		
		for (int i = 0; i < numOfCases; i++){
			
			for (int j = 0; j < 10; j++){
				uncountedDigits.add(j);
			}
			
			long startingNum = sc.nextLong();
			int counter = 1;
			
			while(startingNum != 0 && !uncountedDigits.isEmpty()){
				long countedNum = startingNum * counter;
				while(countedNum > 0 && !uncountedDigits.isEmpty()){
					int lastDigit = (int) countedNum % 10;
					countedNum = countedNum / 10;
					if (uncountedDigits.contains(lastDigit)) uncountedDigits.remove(lastDigit);
				}
				if(!uncountedDigits.isEmpty()) counter ++;
			}
			
			if (startingNum == 0){
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			} else {
				System.out.println("Case #" + (i + 1) + ": " + (startingNum * counter));
			}
			
		}
		
		sc.close();
	}

}

