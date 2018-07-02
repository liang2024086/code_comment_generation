package methodEmbedding.Standing_Ovation.S.LYD77;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CJQA {
	public static void main(String[]args) throws NumberFormatException, IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter("output.out");
		int tests = Integer.parseInt(r.readLine());
		for(int t = 0 ; t< tests ; t++){
			StringTokenizer tkn = new StringTokenizer(r.readLine());
			int max = Integer.parseInt(tkn.nextToken());
			int[]a = new int[max+1];
			String s = tkn.nextToken();
			for(int i = 0 ; i < s.length() ; i++){
				a[i]= Integer.parseInt(s.charAt(i)+"");
			}
			int counter = 0;
			int ac = 0;
			for(int i = 0 ; i < a.length ; i++){
		//		System.out.println(ac+" "+i);
				if(ac>=i){
					ac= ac+a[i];
				}
				else{
					if(a[i]==0)continue;
					counter = counter+(i-ac);
					ac = i;
					ac = ac+a[i];
					
					
				}
			}
			out.println("Case #"+(t+1)+": "+counter);
			out.flush();
			
			
		}
	}
}
