package methodEmbedding.Standing_Ovation.S.LYD2038;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class A {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("input.in"));
		PrintWriter out = new PrintWriter("output.txt");
		int t = Integer.parseInt(br.readLine());
		for(int z=1;z<=t;z++){
			String[] in = br.readLine().split(" ");
			int smax = Integer.parseInt(in[0]);
			
			long temp =0,res=0;
			for(int i=0;i<=smax;i++){
				int now = in[1].charAt(i)-'0';
				if(temp>=i)
					temp+=now;
				else{
					res+=i-temp;
					temp+=i-temp;
					temp+=now;
				}
			}
			out.println("Case #"+z+": "+res);
		}
		
		br.close();
		out.close();
	}
}
