package methodEmbedding.Magic_Trick.S.LYD39;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Magic {
	
	public static void main	(String[] args) {
		Magic m = new Magic("A-small-attempt0.in");
	}
	
	public Magic(String filename) {
		ArrayList<String> input = Reader.read(filename);
		int cases = Integer.parseInt(input.get(0));
		
		for (int i = 0; i < cases; i++) {
			int row1 = Integer.parseInt(input.get(i*10+1));
			int row2 = Integer.parseInt(input.get(i*10+6));
			String[] numbers1 = input.get(i*10+1+row1).split(" ");
			String[] numbers2 = input.get(i*10+6+row2).split(" ");
			
			HashSet<String> set = new HashSet<>(Arrays.asList(numbers1));
			set.retainAll(Arrays.asList(numbers2));
			
			System.out.print("Case #" + (i+1) + ": ");
			if (set.size() == 1) {
				System.out.print(set.toArray()[0]);
			} else if (set.isEmpty()) {
				System.out.print("Volunteer cheated!");
			} else {
				System.out.print("Bad magician!");
			}
			
			System.out.println("");
		}
	}
}
