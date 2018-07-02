package methodEmbedding.Magic_Trick.S.LYD1449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;


public class Solution1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(isr);
		String tline = bReader.readLine();
		Integer t = Integer.parseInt(tline);
		int[][][] map=new int[2][4][4];
		int[] x = new int[2];
		for (int i = 0; i < t; i++) {
			for (int k = 0; k < 2; k++) {
				tline = bReader.readLine();
				x[k] = Integer.parseInt(tline);
				for (int j = 0; j < 4; j++) {
					tline = bReader.readLine();
					String[] numStrs = tline.split(" ");
					for (int l = 0; l < numStrs.length; l++) {
						map[k][j][l] = Integer.parseInt(numStrs[l]);
					}
				}
			}
			int match=0,num=0;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if(map[0][x[0]-1][j]==map[1][x[1]-1][k])
					{
						++match;
						num=map[0][x[0]-1][j];
					}
				}
				
			}
			if(match==1){
				System.out.println("Case #"+(i+1)+": "+num);
			}else if(match>1){
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}else {
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
			
		}

	}

}
