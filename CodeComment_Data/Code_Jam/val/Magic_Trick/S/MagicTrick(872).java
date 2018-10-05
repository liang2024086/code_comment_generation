package methodEmbedding.Magic_Trick.S.LYD2085;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("E:\\workspace\\FileInOut\\A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\workspace\\FileInOut\\A-small-output.out"));
		
		
		int testcase = Integer.parseInt(br.readLine().trim());
		
		for(int testnum=1;testnum<=testcase;testnum++){
			int firstans = Integer.parseInt(br.readLine().trim());
			String firstAnswerRow="";
			for(int i=1;i<=4;i++){
				String strRow = br.readLine();
				if( i == firstans){
					firstAnswerRow = strRow;
				}
			}
			int secondans = Integer.parseInt(br.readLine().trim());
			String secondAnswerRow="";
			for(int i=1;i<=4;i++){
				String strRow = br.readLine();
				if( i == secondans){
					secondAnswerRow = strRow;
				}
			}
			
			String[] ans1 = firstAnswerRow.split(" ");
			String[] ans2 = secondAnswerRow.split(" ");
			
			int cnt = 0;
			int match = -1;
			
			for(int i=0;i<ans1.length;i++){
				for(int j=0;j<ans2.length;j++){
					if( ans1[i].trim().equals(ans2[j].trim())){
						cnt = cnt+1;
						match = Integer.parseInt(ans1[i]);
					}
				}
			}
			
			if( cnt == 1)
				bw.write("Case #"+testnum+": "+match);
			if( cnt == 0)
				bw.write("Case #"+testnum+": Volunteer cheated!");
			if( cnt > 1)
				bw.write("Case #"+testnum+": Bad magician!");
			
			bw.write("\n");
			
		}
		
		bw.flush();
	}

}
