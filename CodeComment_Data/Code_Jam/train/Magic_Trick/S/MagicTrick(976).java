package methodEmbedding.Magic_Trick.S.LYD1433;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MagicTrick {
	public static void main(String... args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		int deck1[] = new int[4];
		int deck2[][] = new int[4][4];
		int ans[] = new int[2];
		String temp[] = null;
		try {

			br = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\A-small-attempt1.in"));

			bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "\\A-small-attempt1.out"));
			PrintWriter fileOut = new PrintWriter(bw);
			
			long numberInp = Integer.parseInt(br.readLine());

			for (int index = 1; index <= numberInp; index++) {
				for (int i = 0; i <= 4 ; i++) {
					if (i==0) {
						ans[0] = Integer.parseInt(br.readLine());
						continue;
					} 
					if(i == ans[0]) {
						temp = br.readLine().split(" ");
						deck1 = new int[] {Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3].trim())};
					} else {
						br.readLine();
					}
				}
				
				for (int i = 0; i <= 4 ; i++) {
					if (i==0) {
						ans[1] = Integer.parseInt(br.readLine());
						continue;
					} 
					
					temp = br.readLine().split(" ");
					deck2[i-1] = new int[] {Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3].trim())};
				}
			
				int count = 0;
				int match = 0;
				for (int i = 0; i < 4; i ++) {
					for (int j = 0; j < 4 ; j++) {
						if (deck1[i] == deck2[ans[1]-1][j]) {
							count++;
							match =  deck2[ans[1]-1][j];
						}
					}					
				}
				
				if (count == 1) {
					fileOut.println("Case #"+index+": " +match);
				} else if (count > 1) {
					fileOut.println("Case #"+index+": " + "Bad magician!");
				} else {
					fileOut.println("Case #"+index+": " + "Volunteer cheated!");					
				}
					
					/*if (deck1[0] == deck2[0][ans[1]-1] && deck1[1] == deck2[1][ans[1]-1]
							&& deck1[2] == deck2[2][ans[1]-1] && deck1[3] == deck2[3][ans[1]-1]) {
						fileOut.println("Case #"+index+": " +deck1[ans[1]-1]);
						//fileOut.println("Case #"+index+": ")
					} else if (deck1[0] == deck2[0][ans[1]-1] || deck1[1] == deck2[1][ans[1]-1]
							|| deck1[2] == deck2[2][ans[1]-1] || deck1[3] == deck2[3][ans[1]-1]) {
						fileOut.println("Case #"+index+": " + "Bad magician!");
					} else {
						fileOut.println("Case #"+index+": " + "Volunteer cheated!");
					}
*/
				//System.out.println("Case #"+index+": ");
				//fileOut.println("Case #"+index+": ");
			}
			fileOut.flush();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
