package methodEmbedding.Magic_Trick.S.LYD1469;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class magic {

	public magic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File input = new File("src/a.txt");
		FileReader fr = new FileReader(input);
		BufferedReader br = new BufferedReader(fr);
		String a = br.readLine();
		int num_cases = Integer.parseInt(a);
		int[][] cases = new int[num_cases][34];
		int i = 0;
		int k = 0;
		for(String x = br.readLine();x != null; x = br.readLine()){
			if(i == 34){
				i = 0;
				k = k+1;
			}
			String[] nums = x.split(" ");
			for(int j=0; j<nums.length; j++){
				cases[k][i]=Integer.parseInt(nums[j]);
				i++;
			}
		}
		
		PrintWriter pw = new PrintWriter("src/output.txt");
		for(int p = 0; p<cases.length; p++){
			int guess1 = cases[p][0];
			int guess2 = cases[p][17];
			int y = (4*guess1) -3;
			int z = (4*guess2) +14;
			int[] row1 = {cases[p][y],cases[p][y+1],cases[p][y+2],cases[p][y+3]};
			int[] row2 = {cases[p][z],cases[p][z+1],cases[p][z+2],cases[p][z+3]};
			int count = 0;
			int index = 0;
			for(int c:row1){
				for(int d:row2){
					if(c==d){
						count = count + 1;
						index = d;}
				}
			}
			if(count > 1){
				pw.println("Case #"+(p+1)+": Bad magician!");
			}
			else if(count == 0){
				pw.println("Case #"+(p+1)+": Volunteer cheated!");
			}
			else{
				pw.println("Case #"+(p+1)+": "+index);
			}
		}
		br.close();
		pw.close();
		pw.flush();
	}
}
