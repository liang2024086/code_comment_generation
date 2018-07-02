package methodEmbedding.Magic_Trick.S.LYD693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author swapnil
 * 
 */
public class Magician {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;

		line = reader.readLine();
		int noOfTestCases = Integer.parseInt(line);
		for (int i = 0; i < noOfTestCases; i++) {
			line = reader.readLine();
			int row = Integer.parseInt(line);

			for (int j = 1; j < row; j++) {
				line = reader.readLine();
			}
			//process the row
			line = reader.readLine();
			String nums[] = line.split(" ");
			Set<String> set = new HashSet<String>();
			set.addAll(Arrays.asList(nums));
			
			for (int j = row + 1; j <= 4; j++) {
				line = reader.readLine();
			}
			
			// process 2nd stage
			line = reader.readLine();
			row = Integer.parseInt(line);

			for (int j = 1; j < row; j++) {
				line = reader.readLine();
			}
			//process 2nd input row
			line = reader.readLine();
			String arr[] = line.split(" ");
			set.retainAll(Arrays.asList(arr));
			
			for (int j = row + 1; j <= 4; j++) {
				line = reader.readLine();
			}
			
			if(set.size()==1) {
				System.out.println("Case #"+(i+1)+": "+set.iterator().next());
			}else if(set.size()>1) {
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}else {
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}

		}

		reader.close();
	}

}
