package methodEmbedding.Standing_Ovation.S.LYD1895;

import java.io.*;

public class StandingOvation {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("A-small-attempt0.in");
		BufferedReader br= new BufferedReader(fr);
		int T=Integer.parseInt(br.readLine());
		for (int i=0;i<T;i++){
			int s=0;
			String LinePS=br.readLine();
			int numFriend=0;
			int count=0;
			String[] LineS=LinePS.split(" ");
			String Line=LineS[1];
			int l=Line.length();
			for (int j=0; j<l; j++){
				if ((count-s)>0){
					numFriend+=(count-s);
					s+=(count-s);
				}
				s=s + Integer.parseInt(Line.charAt(j)+"");
				count++;
			}
			System.out.println("Case #" + (i+1) +": " + numFriend);
		}
	}
}
