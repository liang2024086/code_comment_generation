package methodEmbedding.Magic_Trick.S.LYD1173;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 */

/**
 * @author behroozkamali
 *
 */
public class GCJ141 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader inp = null;
		BufferedWriter out = null;
		try {
			inp = new BufferedReader(new FileReader("inp.txt"));
			out = new BufferedWriter(new FileWriter("out.txt"));
			int T = Integer.parseInt(inp.readLine());
			for(int i = 1; i <= T; i++) {
				int ans1 = Integer.parseInt(inp.readLine());
				int[] row1 = new int[4];
				int[] row2 = new int[4];
				int match = 0;
				int answer = 0;
				for(int j = 1; j <= 4; j++) {
					String[] values = inp.readLine().split(" ");
					if(j == ans1) {
						for(int k = 0; k < 4; k++) {
							row1[k] = Integer.parseInt(values[k]);
						}
					}
				}
				int ans2 = Integer.parseInt(inp.readLine());
				for(int j = 1; j <= 4; j++) {
					String[] values = inp.readLine().split(" ");
					if(j == ans2) {
						for(int k = 0; k < 4; k++) {
							row2[k] = Integer.parseInt(values[k]);
						}
					}
				}
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						if (row1[j] == row2[k]) {
							match++;
							answer = row1[j];
						}
					}
				}
				switch(match) {
				case 0:
//					System.out.println("Case #" + i + ": " + "Volunteer cheated!");
					out.write("Case #" + i + ": " + "Volunteer cheated!\n");
					break;
				case 1:
//					System.out.println("Case #" + i + ": " + answer);
					out.write("Case #" + i + ": " + answer + "\n");
					break;
				default:
//					System.out.println("Case #" + i + ": " + "Bad magician!");
					out.write("Case #" + i + ": " + "Bad magician!\n");
					break;
				}
			}
			inp.close();
			out.close();
		} catch (Exception e) {
			System.out.println("Catch error: "+e.getMessage());
		}

	}

}
