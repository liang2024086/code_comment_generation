package methodEmbedding.Standing_Ovation.S.LYD1730;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class StandingOvation {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter p = new PrintWriter("A-small-attempt0.out");
		int t = Integer.parseInt(buf.readLine());
		for (int r=0; r<t; r++){
			int audience = 0;
			int added = 0;
			String[] temp = buf.readLine().split("[ ]");
			int max = Integer.parseInt(temp[0]);
			int[] people = new int[max+1];
			for (int i=0; i<=max; i++){
				people[i]=Integer.parseInt(temp[1].charAt(i)+"");
			}
			for (int i=0; i<=max; i++){
				while (audience<i){
					added++;
					audience++;
				}
				audience+=people[i];
			}
			p.println("Case #"+(r+1)+": "+added);
			p.flush();
		}
		buf.close();
		p.close();
	}
}
