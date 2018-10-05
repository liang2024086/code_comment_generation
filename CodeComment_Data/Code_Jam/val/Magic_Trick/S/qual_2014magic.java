package methodEmbedding.Magic_Trick.S.LYD1235;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class qual_2014magic {

	public static void main(String[] args) throws IOException{
		BufferedReader buf=new BufferedReader(new FileReader("file.in"));
		PrintWriter printer=new PrintWriter("file.out");
		int t=Integer.parseInt(buf.readLine());
		int[] grid=new int[4];
		for(int i=0;i<t;i++){
			printer.print("Case #"+(i+1)+": ");
			int x=Integer.parseInt(buf.readLine());
			for(int j=1;j<x;j++)
				buf.readLine();
			String[] s=buf.readLine().split(" ");
			for(int j=0;j<4;j++)
				grid[j]=Integer.parseInt(s[j]);
			for(int j=x;j<4;j++)
				buf.readLine();
			x=Integer.parseInt(buf.readLine());
			for(int j=1;j<x;j++)
				buf.readLine();
			s=buf.readLine().split(" ");
			int poss=0;
			int which=0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++)
					if(grid[k]==Integer.parseInt(s[j])){
						poss++;
						which=grid[k];
					}
			}
			for(int j=x;j<4;j++)
				buf.readLine();
			if(poss>1)
				printer.println("Bad magician!");
			else if(poss==1)
				printer.println(""+which);
			else
				printer.println("Volunteer cheated!");
		}
		printer.close();
	}

}
