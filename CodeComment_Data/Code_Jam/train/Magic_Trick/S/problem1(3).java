package methodEmbedding.Magic_Trick.S.LYD1855;

import java.io.BufferedReader;
import java.io.FileReader;
public class problem1 {
	public static void main(String[] args) throws Exception{
		int testCaseN;
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		String line;
		line = reader.readLine();
		testCaseN = Integer.parseInt(line);
		int cardName = 0;
		for (int i = 0; i < testCaseN; i++){
			int row1, row2;
			int [][] cards1 = new int [4][4];
			int [][] cards2 = new int [4][4];
			line = reader.readLine();
			row1 = Integer.parseInt(line)-1;
			for (int k = 0; k < 4; k++){
				line = reader.readLine();
				String [] st = line.split(" ");
				for (int j = 0; j < 4; j++)
					cards1[k][j] = Integer.parseInt(st[j]);
			}
			
			line = reader.readLine();
			row2 = Integer.parseInt(line)-1;
			for (int k = 0; k < 4; k++){
				line = reader.readLine();
				String [] st = line.split(" ");
				for (int j = 0; j < 4; j++)
					cards2[k][j] = Integer.parseInt(st[j]);
			}
			int ch = 0;
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					if (cards1[row1][j] == cards2[row2][k])
					{
						ch++;
						cardName = cards1[row1][j];
					}
			
			if (ch == 0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if (ch == 1)
				System.out.println("Case #"+(i+1)+": "+cardName);
			else 
				System.out.println("Case #"+(i+1)+": Bad magician!");
				
		}
	}

}
