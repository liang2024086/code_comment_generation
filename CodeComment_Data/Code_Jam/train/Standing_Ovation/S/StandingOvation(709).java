package methodEmbedding.Standing_Ovation.S.LYD1165;


import java.io.*;
import java.util.*;

public class StandingOvation {
	public static void main (String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		File f = new File("output.txt");
		if(f.isFile()) f.delete();
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		int n = Integer.parseInt(br.readLine());
		
		for(int kase = 1; kase<=n; kase++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int soFar = 0;
			int needed = 0;
			for(int i = 0; i<=max; i++){
				if(s.charAt(i)=='0') continue;
				if(i>soFar){
					needed += (i - soFar);
					soFar+= (i-soFar);
				}
				soFar += (s.charAt(i)-'0');
			}
			//bw.write(soFar + "\n");
			bw.write("Case #" + kase + ": " + needed + "\n");
		}
		bw.flush();
	}
}
