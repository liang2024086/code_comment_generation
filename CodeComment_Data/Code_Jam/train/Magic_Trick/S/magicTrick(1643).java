package methodEmbedding.Magic_Trick.S.LYD2116;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class magicTrick {
	
	public static void main(String args[]) throws IOException {
		FileReader fr=new FileReader("A-small.in");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("A-small-output.in");
		BufferedWriter bw=new BufferedWriter(fw);
		String sCurrentLine;
		sCurrentLine = br.readLine();
		//int T = Integer.parseInt(sCurrentLine);
		int i = 1;
		int row1=1, row2=1;
		int rows1[][] = new int[4][4];
		int rows2[][] = new int[4][4];
		String r[];
		int numOfCounts;
		int num = 0;
		while((sCurrentLine=br.readLine())!=null) {
			numOfCounts = 0;
			row1 = Integer.parseInt(sCurrentLine);
			//System.out.println(row1);
			for(int k=0; k<4; k++) {					
				sCurrentLine = br.readLine();
				//System.out.println(sCurrentLine+" :k"+k);
				r = sCurrentLine.split(" ");
				for(int l=0; l<4; l++)
					rows1[k][l] = Integer.parseInt(r[l]);
			}	
			sCurrentLine = br.readLine();
			row2 = Integer.parseInt(sCurrentLine);
			for(int k=0; k<4; k++) {					
				sCurrentLine = br.readLine();
				r = sCurrentLine.split(" ");
				for(int l=0; l<4; l++)
					rows2[k][l] = Integer.parseInt(r[l]);
			}
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					//System.out.println("Comparing " +rows1[row1][j] +" " + rows2[row2][k]);
					if(rows1[row1-1][j] == rows2[row2-1][k]) {
						numOfCounts++;
						num = rows1[row1-1][j];
					}
				}
			}
			if(numOfCounts > 1) {
				bw.write("Case #"+i+": Bad magician!\n");
			} else if(numOfCounts == 1) {
				bw.write("Case #"+i+": "+num+"\n");
			} else if(numOfCounts == 0) {
				bw.write("Case #"+i+": Volunteer cheated!\n");
			}
			i++;	
		}
		bw.close();
		br.close();
	}

}
