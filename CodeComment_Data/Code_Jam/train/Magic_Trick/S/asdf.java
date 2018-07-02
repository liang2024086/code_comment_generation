package methodEmbedding.Magic_Trick.S.LYD1140;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class asdf {
	
	static int reply1;
	static int[][] grid1 = new int[4][4];
	static int[] possibilities1;
	static int reply2;
	static int[][] grid2 = new int[4][4];
	static int[] possibilities2;
	static int caseno=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output"));
		
		br.readLine();
		String line;
		while((line = br.readLine())!=null){
			reply1 = Integer.parseInt(line);
			for (int i = 0;i<4;i++){
				String[] arr = br.readLine().split(" ");
				for (int j=0;j<4;j++) grid1[i][j] = Integer.parseInt(arr[j]);
			}
			possibilities1 = grid1[reply1-1];

			reply2 = Integer.parseInt(br.readLine());
			for (int i = 0;i<4;i++){
				String[] arr = br.readLine().split(" ");
				for (int j=0;j<4;j++) grid2[i][j] = Integer.parseInt(arr[j]);
			}
			possibilities2 = grid2[reply2-1];

			int matches=0;
			String answer="";
			for (int i=0;i<4;i++){
				for (int j=0;j<4;j++){
					if(possibilities2[j]==possibilities1[i]){
						matches++; //System.out.println("Poss1["+i+"]:" + possibilities1[i] + "\r\nPoss2["+j+"]:"+ possibilities2[j]);
						answer=""+possibilities2[j];
					}
				}
			}
			String y="";
			if (matches==1) y = answer;
			if (matches>1) y = "Bad magician!";
			if (matches<1) y = "Volunteer cheated!";
			caseno++;
			System.out.println("Case #" + caseno + ": " + y);
			bw.write("Case #" + caseno + ": " + y + "\r\n");
			bw.flush();
		}
		br.close();
		bw.close();

		
	}
}
