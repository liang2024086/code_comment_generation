package methodEmbedding.Magic_Trick.S.LYD506;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class MagicTrick {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new FileWriter("a.txt"));
		int n =Integer.parseInt(in.readLine());
		for (int i = 0; i <n; i++) {
			int a =Integer.parseInt(in.readLine());
			int first [][]= new int[4][4];
			int sec[][]=new int[4][4];
			int [] fr= new int[4];
			int sc[]=new int[4];
			for (int j = 0; j < 4; j++) {
			String s[]=in.readLine().split(" ");
			for (int k = 0; k < 4; k++) {
				first[j][k]=Integer.parseInt(s[k]);
			}
			if(j==a-1){
				fr=first[j];
			}
			}
			
			int b = Integer.parseInt(in.readLine());
			for (int j = 0; j < 4; j++) {
				String s[]=in.readLine().split(" ");
				for (int k = 0; k < 4; k++) {
					sec[j][k]=Integer.parseInt(s[k]);
				}
				if(j==b-1){
					sc=sec[j];
				}
			}
			int count=0;
			int p=0;
			for (int j = 0; j < sc.length; j++) {
				for (int j2 = 0; j2 < sc.length; j2++) {
					if(sc[j]==fr[j2]){
						p=sc[j];
						count++;
					}
				}
			}
			if(count==0){
				out.println("Case #"+(i+1)+": Volunteer cheated!");
			}else if(count==1){
				out.println("Case #"+(i+1)+": "+p);
			}else{
				out.println("Case #"+(i+1)+": Bad magician!");
			}
			
		}
		out.close();
		
	}

}
