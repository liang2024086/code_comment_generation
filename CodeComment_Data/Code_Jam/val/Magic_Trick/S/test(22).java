package methodEmbedding.Magic_Trick.S.LYD136;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test {
	public static final String OUT1 = "Case #%d: ";
	public static final String OUT2 = "Case #%d: Bad magician!";
	public static final String OUT3 = "Case #%d: Volunteer cheated!";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int caseCount = 0;
		int[][] tempArr = new int[4][2];
		
		File f = new File("data/input");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		caseCount = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=caseCount ; i++){
			int lineSelect = Integer.parseInt(br.readLine());
			String lineString = "";
			if(lineSelect == 1){
				lineString = br.readLine();
				br.readLine();
				br.readLine();
				br.readLine();
			}
			else if(lineSelect == 2){
				br.readLine();
				lineString = br.readLine();
				br.readLine();
				br.readLine();
			}
			else if(lineSelect == 3){
				br.readLine();
				br.readLine();
				lineString = br.readLine();
				br.readLine();
			}
			else if(lineSelect == 4){
				br.readLine();
				br.readLine();
				br.readLine();
				lineString = br.readLine();
			}
			StringTokenizer st = new StringTokenizer(lineString, " ");
			for(int j=0; j<4; j++){
				tempArr[j][0] = Integer.parseInt(st.nextToken());
			}
			
			lineSelect = Integer.parseInt(br.readLine());
			lineString = "";
			
			if(lineSelect == 1){
				lineString = br.readLine();
				br.readLine();
				br.readLine();
				br.readLine();
			}
			else if(lineSelect == 2){
				br.readLine();
				lineString = br.readLine();
				br.readLine();
				br.readLine();
			}
			else if(lineSelect == 3){
				br.readLine();
				br.readLine();
				lineString = br.readLine();
				br.readLine();
			}
			else if(lineSelect == 4){
				br.readLine();
				br.readLine();
				br.readLine();
				lineString = br.readLine();
			}
			st = new StringTokenizer(lineString, " ");
			for(int j=0; j<4; j++){
				tempArr[j][1] = Integer.parseInt(st.nextToken());
			}

			int count=0;
			int tempNum=0;
			for(int row1=0; row1<4; row1++){
				for(int row2=0; row2<4; row2++){
					if(tempArr[row1][0] == tempArr[row2][1]){
						count++;
						tempNum = tempArr[row1][0];
					}
				}
			}
			
			if(count==1){
				System.out.printf(OUT1+tempNum+"\n", i);
			}
			else if(count>1){
				System.out.printf(OUT2+"\n", i);
			}
			else{
				System.out.printf(OUT3+"\n", i);
			}
		}
		
		br.close();
	}
}
