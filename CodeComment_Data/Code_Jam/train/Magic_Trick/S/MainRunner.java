package methodEmbedding.Magic_Trick.S.LYD2186;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MainRunner {

	private static BufferedReader br;
	private static  PrintWriter output;

	
	public static void main(String[] args) throws IOException {
	    br = new BufferedReader(new FileReader("/Users/odor/Documents/CodeJam/2014QualRound/src/magicTrick/A-small-attempt0.in"));
	    output= new PrintWriter(new FileWriter("/Users/odor/Documents/CodeJam/2014QualRound/src/magicTrick/output.txt"));
	    String line = br.readLine();
		int numberOfTricks = Integer.parseInt(line);
    	System.out.println(numberOfTricks);

		
	    for(int t=0; t<numberOfTricks; t++) {
	    	line = br.readLine();
			int response=Integer.parseInt(line);

			int[][] board = new int[4][4];
			
		    for(int i=0; i<4; i++) {
				line = br.readLine();
		    	List<String> nums = Arrays.asList(line.split(" "));
			    for(int j=0; j<4; j++) {
			    	board[i][j]=Integer.parseInt(nums.get(j));
			    }

			}

		    HalfTrick first = new HalfTrick(board, response);
		
	    	line = br.readLine();
			response=Integer.parseInt(line);

			
		    for(int i=0; i<4; i++) {
				line = br.readLine();
		    	List<String> nums = Arrays.asList(line.split(" "));
			    for(int j=0; j<4; j++) {
			    	board[i][j]=Integer.parseInt(nums.get(j));
			    }

			}

		    HalfTrick second = new HalfTrick(board, response);
		    
//			System.out.println(first);
//			System.out.println(second);

		    Set<Integer> s1= first.getPossible();
//		    System.out.println(first.getPossible());
//		    System.out.println(second.getPossible());
		    
		    s1.retainAll(second.getPossible());
//		    System.out.println(s1);
		    if (s1.size()==0) {
		    	output.println("Case #"+(t+1)+": Volunteer cheated!");
		    }
		    else if (s1.size()==1) {
		    	output.println("Case #"+(t+1)+": "+ (s1.iterator().next()));
		    }
		    else {
		    	output.println("Case #"+(t+1)+": Bad magician!");
		    }

		    
	    }
		
	    output.close();


	}
	
	
}
