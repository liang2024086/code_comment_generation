package methodEmbedding.Magic_Trick.S.LYD382;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MagicTrick {
	private static final String NAME = "A-small-attempt0";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(NAME + ".in")));
		PrintWriter out = new PrintWriter(new File(NAME + ".out"));
		int numCases = Integer.parseInt(br.readLine());
		for(int CASE = 1; CASE <= numCases; CASE++){
			int row1 = Integer.parseInt(br.readLine()) - 1;
			int[][] grid = new int[4][4];
			for(int i = 0; i < 4; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 4; j++){
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			Set<Integer> nums1 = new HashSet<Integer>();
			for(int num: grid[row1])
				nums1.add(num);
			
			int row2 = Integer.parseInt(br.readLine()) - 1;
			grid = new int[4][4];
			for(int i = 0; i < 4; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 4; j++){
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			Set<Integer> nums2 = new HashSet<Integer>();
			for(int num: grid[row2])
				nums2.add(num);
			
			nums1.retainAll(nums2);
			if(nums1.size() == 0) {
				out.println("Case #" + CASE + ": Volunteer cheated!");
			} else if (nums1.size() == 1){
				out.println("Case #" + CASE + ": " + nums1.iterator().next());
			} else {
				out.println("Case #" + CASE + ": Bad magician!");
			}
		}
		out.close();
		System.exit(0);
	}
}
