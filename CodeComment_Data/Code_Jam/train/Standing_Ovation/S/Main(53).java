package methodEmbedding.Standing_Ovation.S.LYD1712;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

	public static void main(String[]args) throws NumberFormatException, IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedReader br = new BufferedReader(new FileReader("input.in"));
		 PrintWriter out = new PrintWriter("output.txt");
		int t = Integer.parseInt(br.readLine());
		for(int i = 0;i<t;i++){
			int ans = 0;
			String[]in = br.readLine().split(" ");
			int n = Integer.parseInt(in[0]);
			int standing = 0;
			for(int j = 0;j<(n+1);j++){

				if(j>standing && (in[1].charAt(j)-'0')>0){
					ans+=(j-standing);
					standing+=(j-standing);
				}
				standing+=in[1].charAt(j)-'0';

			}
			out.println("Case #"+(i+1)+": "+ans);
		}
		
		br.close();
		out.close();
		
	}
}
