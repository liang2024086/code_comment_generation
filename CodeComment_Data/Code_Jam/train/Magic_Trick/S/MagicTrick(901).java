package methodEmbedding.Magic_Trick.S.LYD929;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {

	public static void main(String[] args) {

		BufferedReader br = null;
		//BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			//bw = new BufferedWriter(new FileWriter(""));

			int numOfCases = Integer.parseInt(br.readLine());

			for (int i = 0; i < numOfCases; i++) {
				int firstRow = Integer.parseInt(br.readLine()) - 1;

				int[][] firstStruct = new int[4][4];

				for (int j = 0; j < 4; j++) {
					String[] line = br.readLine().split(" ");
					for (int k = 0; k < 4; k++) {
						firstStruct[j][k] = Integer.parseInt(line[k]);
					}
				}

				int secRow = Integer.parseInt(br.readLine()) - 1;

				int[][] secStruct = new int[4][4];

				for (int j = 0; j < 4; j++) {
					String[] line = br.readLine().split(" ");
					for (int k = 0; k < 4; k++) {
						secStruct[j][k] = Integer.parseInt(line[k]);
					}
				}
				
				boolean foundOnce = false;
				boolean foundSec = false;
				boolean nothingFound = false;
				int answer = 0;
				
				for(int j = 0 ;j < 4 ;j++)
				{
					for(int k = 0 ;k < 4 ;k++)
					{
						if(!foundOnce && firstStruct[firstRow][j] == secStruct[secRow][k])
						{
							foundOnce = true;
							answer = firstStruct[firstRow][j];
						}
						else if(foundOnce && firstStruct[firstRow][j] == secStruct[secRow][k])
						{
							foundSec = true;
						}
						else
						{
							nothingFound = false;
						}
					}
				}
				
				if(foundOnce && !foundSec)
				{
					System.out.print("Case #"+(i+1)+": "+answer);
				}
				else if(foundSec)
				{
					System.out.print("Case #"+(i+1)+": Bad magician!");
				}
				else
				{
					System.out.print("Case #"+(i+1)+": Volunteer cheated!");
				}
				
				System.out.println();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				//bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
