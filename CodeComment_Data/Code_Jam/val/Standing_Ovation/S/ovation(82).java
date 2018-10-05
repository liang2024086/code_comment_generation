package methodEmbedding.Standing_Ovation.S.LYD610;

import java.io.*;
import java.util.*;
public class ovation{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("ovation.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
		int cases = Integer.parseInt(f.readLine());
		for(int nmnmnm=0; nmnmnm<cases; nmnmnm++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] p = new int[n+1];
			String s = st.nextToken();
			for(int i=0; i<n+1; i++){
				p[i] = s.charAt(i)-'0';
			}
			int count=0;
			int added=0;
			for(int i=0; i<n+1; i++){
				if(p[i]!=0){
					if(i>count){
						added+=i-count;
						count=i;
					}
					count+=p[i];
				}
			}
			out.println("Case #" + (nmnmnm+1) + ": " + added);
		}
		out.close();
		System.exit(0);
	}
}
