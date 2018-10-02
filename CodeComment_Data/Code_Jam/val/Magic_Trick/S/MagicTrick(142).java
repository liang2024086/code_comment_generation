package methodEmbedding.Magic_Trick.S.LYD2165;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) throws FileNotFoundException {
		
        
        // Redirect I/O to files.
        System.setIn(new FileInputStream("src/magicTrick/A-small-attempt1.in"));
        System.setOut(new PrintStream("output.txt"));
		Scanner console = new Scanner(System.in);
		int cases = console.nextInt();
		
		for (int caseNumber = 1; caseNumber <= cases; caseNumber++) {
			Set<Integer> numbers = new HashSet<Integer>();
			int initialRow = console.nextInt();
			
			for (int i = 1; i<= 16; i++) {
				int temp = console.nextInt();
				if (4 * (initialRow - 1) + 1 <= i && i<= 4*initialRow) {
					numbers.add(temp);
				}
			}
			
			int secondRow = console.nextInt();
			Stack<Integer> result = new Stack<Integer>();
			for (int i = 1; i <= 16; i++) {
				int temp = console.nextInt();
				if (4 * (secondRow - 1) + 1 <= i && i <= 4*secondRow) {
					if (numbers.contains(temp))
						result.push(temp);
				}
			}
			
			//System.out.println(numbers);
			
			
			System.out.printf("Case #%d: ", caseNumber);
			if (result.size() == 1)
				System.out.println(result.pop());
			else if (result.size() > 1)
				System.out.println("Bad magician!");
			else
				System.out.println("Volunteer cheated!");
		}
		//console.close();
	}
}
