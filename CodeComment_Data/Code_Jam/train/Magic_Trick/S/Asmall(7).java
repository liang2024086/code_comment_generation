package methodEmbedding.Magic_Trick.S.LYD1627;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Asmall {
	
	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer tokenizer;
	
	public static void main(String[]args) throws IOException{
		File inF = new File("/home/taras/workspace/Google_Code_Jam_2014_ Qualification_Round/src/ASmall.txt");
		
		File outF = new File("/home/taras/workspace/Google_Code_Jam_2014_ Qualification_Round/src/ASmall_out.txt");
		FileReader reader = new FileReader(inF);
		FileWriter writer = new FileWriter(outF);
		br = new BufferedReader(reader);
		out = new PrintWriter(writer);
		
		int a1,a2;
		int[][]b1 = new int[4][4];
		int[][]b2 = new int[4][4];
		tokenizer = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokenizer.nextToken());
		for(int z=0;z<n;z++){
			tokenizer = new StringTokenizer(br.readLine());
			a1 = Integer.parseInt(tokenizer.nextToken()) - 1;
			
			for(int i=0;i<4;i++){
				tokenizer = new StringTokenizer(br.readLine());
				for(int j=0;j<4;j++){
					b1[i][j] = Integer.parseInt(tokenizer.nextToken());
				}
			}
			
			tokenizer = new StringTokenizer(br.readLine());
			a2 = Integer.parseInt(tokenizer.nextToken()) - 1;
			
			for(int i=0;i<4;i++){
				tokenizer = new StringTokenizer(br.readLine());
				for(int j=0;j<4;j++){
					b2[i][j] = Integer.parseInt(tokenizer.nextToken());
				}
			}
			
			int res = -1;
			int resCnt = 0;
			
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(b1[a1][i]==b2[a2][j]){
						resCnt++;
						res = b1[a1][i];
					}
				}
			}
			
			out.append("Case #"+(z+1)+": ");
			if(resCnt==0){
				out.append("Volunteer cheated!\n");
			}
			else if(resCnt==1){
				out.append(res+"\n");
			}else if(resCnt>=1){
				out.append("Bad magician!\n");
			}
		}
		
		out.flush();
		out.close();
	}
}
