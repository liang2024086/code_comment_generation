package methodEmbedding.Standing_Ovation.S.LYD771;

import java.io.BufferedReader;
import java.io.FileReader;


public class Test1 {
	public static void main(String[] args) throws Exception{
		BufferedReader fin = new BufferedReader(new FileReader("/Users/atluu/Downloads/A-small-attempt0.in"));
		int noc = Integer.parseInt(fin.readLine());
		for (int i = 0; i < noc; i++){
			String[] parts = fin.readLine().split("\\s+");
			int highest = Integer.parseInt(parts[0]);
			int count = 0;
			int result = 0;
			int[] set = new int[highest+1];
			for (int j = 0; j < highest+1; j++){
				set[j] = Integer.parseInt(parts[1].substring(j, j+1));
				if (count < j){
					result += j - count;
					count = j + set[j];
				}
				else
					count += set[j];
			}
			System.out.println("Case #" + (i+1) + ": " + result);
		}
	}
}
