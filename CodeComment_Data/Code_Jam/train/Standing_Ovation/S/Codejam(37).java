package methodEmbedding.Standing_Ovation.S.LYD111;

import java.io.*;
class Codejam {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int j=1;j<=test;j++) {
			String[] inp = br.readLine().split(" ");
			int smax = Integer.parseInt(inp[0]);
			String aud = inp[1];
			int permit = 0;
			int ans = 0;
			
			int till = 0;//010011  //001
			for(int i=0;i<aud.length();i++) {
				int c = aud.charAt(i)-'0';
				if(till>=i) {
					till+=c;
				}
				else {
					ans = ans + (i-till);
					till = till +(i-till);
					till+=c;
				}
			}
			System.out.println("Case #"+j+": "+ans);
		}
	}
}
