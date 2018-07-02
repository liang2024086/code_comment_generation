package methodEmbedding.Standing_Ovation.S.LYD736;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class CodeJamOne {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		for (int t=1; t<=test; t++) {
			
			String[] x = br.readLine().split(" ");
			int smax = Integer.parseInt(x[0]);
			int[] s = new int[x[1].length()];
			
			for (int i = 0; i < x[1].length(); i++) {
				s[i]=Integer.parseInt(x[1].charAt(i)+"");
			}
			
			int aud=0,fr=0;
			
			for (int i = 0; i < s.length; i++) {
				
				if(aud>=i){
					aud+=s[i];
				}
				else{
					fr+=i-aud;
					aud+=i-aud+s[i];
				}
				
			}
			
			pw.println("Case #"+t+": "+fr);
			
			
		}// test
pw.close();
	}
}
