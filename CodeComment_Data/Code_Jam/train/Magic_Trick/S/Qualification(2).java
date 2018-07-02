package methodEmbedding.Magic_Trick.S.LYD2087;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Qualification {
	
	private static int testCases;
	
	private static Set<Integer> possible = new HashSet<Integer>();
	private static Set<Integer> correct = new HashSet<Integer>();
	
	public static void main(String[] args) {
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/bmcfeeley/Downloads/A-small-attempt0.in"));
			String s = br.readLine();
			testCases = Integer.parseInt(s);
			//System.out.println(String.format("Got %d test cases!", testCases));
			for (int i = 1; i <= testCases; i++) {
				possible.clear();
				correct.clear();
				//System.out.println(String.format("Entering test case %d", i));
				int ix = Integer.parseInt(br.readLine());
				//System.out.println(String.format("Selection is in row %d", ix));
				for (int ctr = 0; ctr < ix; ctr++) {
					s = br.readLine();
				}
				//System.out.println(String.format("Row %d == %s", ix, s));
				String[] tokens = s.split(" ");
				for (String t : tokens) {
					possible.add(Integer.parseInt(t));
				}
				// finish parsing first set
				for (int c = 4 - ix; c > 0; c--) {
					br.readLine();
				}
				
				// second board
				ix = Integer.parseInt(br.readLine());
				//System.out.println(String.format("Second Selection is in row %d", ix));
				for (int ctr = 0; ctr < ix; ctr++) {
					s = br.readLine();
				}
				//System.out.println(String.format("Row %d == %s", ix, s));
				tokens = s.split(" ");
				for (String t : tokens) {
					if (possible.contains(Integer.parseInt(t))) {
						correct.add(Integer.parseInt(t));
					}
				}
				if (correct.size() == 0) {
					System.out.println(String.format("Case #%d: Volunteer Cheated!", i));
				} else if (correct.size() == 1) {
					System.out.println(String.format("Case #%d: %d", i, correct.iterator().next()));
				} else {
					System.out.println(String.format("Case #%d: Bad Magician!", i));
				}
				
				// finish parsing the second board
				for (int c = 4 - ix; c > 0; c--) {
					br.readLine();
				}
			}
			br.close();
		} catch (Exception e) {
			// do nothing
		}
		
	}
}
