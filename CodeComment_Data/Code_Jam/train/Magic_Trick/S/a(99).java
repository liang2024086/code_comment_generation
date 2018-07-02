package methodEmbedding.Magic_Trick.S.LYD1603;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class a {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		  PrintWriter out = new PrintWriter(new FileWriter("resA.txt"));
		BufferedReader bf=new BufferedReader(new FileReader("A.txt"));
		
		int tc=Integer.parseInt(bf.readLine());
		int x,y;
		String []xx = null,yy = null;
		for (int i = 1; i <=tc; i++) {
			x=Integer.parseInt(bf.readLine());
			for (int j = 1; j <=4; j++) {
				if (j==x) {
					xx=bf.readLine().split(" ");
				}
				else {
					bf.readLine();
				}
				
				
			}
			y=Integer.parseInt(bf.readLine());
			for (int j = 1; j <=4; j++) {
				if (j==y) {
					yy=bf.readLine().split(" ");
				}
				else {
					bf.readLine();
				}
				
				
			}
			int cnt=0;
			String ans="";
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (xx[j].equals(yy[j2])) {
						cnt++;
						ans=xx[j];
					}
				}
			}
			out.print("Case #"+i+": ");
			if (cnt==0) {
				out.println("Volunteer cheated!");
			}else if (cnt==1) {
				out.println(ans);
			}
			else {
				out.println("Bad magician!");
			}
			
			
			
		}
		
out.close();
	}

}
