package methodEmbedding.Magic_Trick.S.LYD2233;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		// make a new buffered reader object
		BufferedReader br = new BufferedReader(new FileReader(new File("C:/Users/ankitsablok89/Desktop/A-small-attempt0.in")));
		// make a new BufferedWriter
		BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:/Users/ankitsablok89/Desktop/A-small-attempt0.out"), true));
		// scan the number of test cases
		int T = Integer.parseInt(br.readLine());
		// this is the test case counter
		int t_case = 0;
		
		// the logic begins here
		while(T-- > 0){
			// increment the test case counter
			++t_case;
			// this is the ArrayList of set data structures that we use to find out the answer
			ArrayList< Set<Integer> > grid1 = new ArrayList<Set<Integer>>();
			ArrayList< Set<Integer> > grid2 = new ArrayList<Set<Integer>>();
			
			// this is the answer to the first question given by the volunteer
			int q1Answer = Integer.parseInt(br.readLine());
			// read the first grid
			for(int i = 0 ; i < 4 ; ++i){
				// scan the numbers
				String[] numbers = br.readLine().split(" ");
				// push the numbers in the set
				Set<Integer> newSet = new HashSet<Integer>();
				for(int j = 0 ; j < numbers.length ; ++j)
					newSet.add(Integer.parseInt(numbers[j]));
				// add the hash set to the list of hash sets
				grid1.add(newSet);
			}
			
			// this is the answer to the second question
			int q2Answer = Integer.parseInt(br.readLine());
			// read the second grid
			for(int i = 0 ; i < 4 ; ++i){
				// scan the numbers
				String[] numbers = br.readLine().split(" ");
				// push the numbers in the set
				Set<Integer> newSet = new HashSet<Integer>();
				for(int j = 0 ; j < numbers.length ; ++j)
					newSet.add(Integer.parseInt(numbers[j]));
				// add the hash set to the list of hash sets
				grid2.add(newSet);
			}
			
			// find the intersection of the two sets
			grid1.get(q1Answer - 1).retainAll(grid2.get(q2Answer - 1));
			
			if(grid1.get(q1Answer - 1).size() == 0)
				bwr.write("Case #" + t_case + ": " + "Volunteer cheated!" + "\n");
			
			if(grid1.get(q1Answer - 1).size() == 1){
				for(Integer val : grid1.get(q1Answer - 1))
					bwr.write("Case #" + t_case + ": " + val + "\n");
			}
			if(grid1.get(q1Answer - 1).size() > 1)
				bwr.write("Case #" + t_case + ": Bad magician!" + "\n");
			
		}
		bwr.close();
	}
}
