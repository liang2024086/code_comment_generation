package methodEmbedding.Magic_Trick.S.LYD1803;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

	public static void main(String args[]){
		try{
			FileReader fr=new FileReader("input.txt");
			BufferedReader br=new BufferedReader(fr);
			PrintWriter pr=new PrintWriter("out.txt");
			String str=br.readLine();
			int T=Integer.parseInt(str);
			for(int t=1;t<=T;t++){
				str=br.readLine();
				int r1=Integer.parseInt(str)-1;
				int[][] ar1=new int[4][17];
				for(int i=0;i<4;i++){
					str=br.readLine();
					int s=0;
					int j=0;
					int length=str.length();
					while(j<length){
						while(j<length){
							if(str.charAt(j)!=' ') j++;
							else break;
						}
						ar1[i][Integer.parseInt(str.substring(s,j))]++;
						s=++j;
					}
				}
				str=br.readLine();
				int r2=Integer.parseInt(str)-1;
				int[][] ar2=new int[4][17];
				for(int i=0;i<4;i++){
					str=br.readLine();
					int s=0;
					int j=0;
					int length=str.length();
					while(j<length){
						while(j<length){
							if(str.charAt(j)!=' ') j++;
							else break;
						}
						ar2[i][Integer.parseInt(str.substring(s,j))]++;
						s=++j;
					}
				}
				int c=0,ans=-1;
				str="Case #"+t+": ";
				for(int i=1;i<17;i++){
					if(ar1[r1][i]==ar2[r2][i]&&ar1[r1][i]>0){
						ans=i;
						c++;
					}
					if(c>1) break;
				}
				if(c>1) str+="Bad magician!";
				else if(ans==-1) str+="Volunteer cheated!";
				else str+=ans;
				pr.println(str);
				System.out.println(str);
			}
			pr.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
