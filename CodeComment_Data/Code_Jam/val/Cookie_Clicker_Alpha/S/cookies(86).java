package methodEmbedding.Cookie_Clicker_Alpha.S.LYD260;

import java.io.*;

class cookies{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, tc=1, i;
		double C, F, X, ans, CCount, rAns;
		String[] line;
		t = Integer.parseInt(br.readLine());
		while(tc <= t){
			line = br.readLine().split(" ");
			C = Double.parseDouble(line[0]);
			F =  Double.parseDouble(line[1]);
			X = Double.parseDouble(line[2]);
			ans = 100000;
			CCount = 0;
			i=0;
			
			do{
				rAns = CCount + X / (i*F + 2.0);
				if( rAns < ans){
					ans = rAns;
				}else
					break;
				CCount += C / (i*F + 2.0);
				i++;
			}while(true);
			System.out.println("Case #" + tc + ": " + ans);
			tc++;
		}
	}
}
