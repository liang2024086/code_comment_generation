package methodEmbedding.Magic_Trick.S.LYD1373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class GCJ2014_Q_1 {
	public static void main (String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		String line="";
		int num=Integer.parseInt(in.readLine());
		int guess1;
		int guess2;
		String cardset1[][];
		String cardset2[][];
		StringTokenizer s;
		int count=0;
		int count2=0;
		String card;
		
		
		for (int i=0;i<num;i++){
			card="";
			count=0;
			cardset1=new String[4][4];
			cardset2=new String[4][4];
			guess1=Integer.parseInt(in.readLine());
			
			for (int j=0;j<4;j++){
				line=in.readLine();
				s=new StringTokenizer(line," ");
				for (int k=0;k<4;k++){
					cardset1[j][k]=s.nextToken();
				}
				
			}
			guess2=Integer.parseInt(in.readLine());
			for (int j=0;j<4;j++){
				line=in.readLine();
				s=new StringTokenizer(line," ");
				for (int k=0;k<4;k++){
					cardset2[j][k]=s.nextToken();
				}
				
			}
			for (int j=0;j<4;j++){
				for (int k=0;k<4;k++){
					if (cardset1[guess1-1][j].equals(cardset2[guess2-1][k])){
						card=card+cardset2[guess2-1][k];
						count++;
					}
				}
			}
			if (count==0){
				out.write("Case #"+(i+1)+": Volunteer cheated!");
			}
			else if (count==1){
				out.write("Case #"+(i+1)+": "+card);
			}
			else{
				out.write("Case #"+(i+1)+": Bad magician!");
			}
			out.newLine();
			
		}
		in.close();
		out.close();
		
	}
}
