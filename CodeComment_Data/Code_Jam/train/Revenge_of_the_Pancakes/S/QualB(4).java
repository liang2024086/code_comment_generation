package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1204;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QualB {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter("B.txt");
		int T = Integer.parseInt(in.readLine());
		for(int c=1;c<=T;c++){
			String s = in.readLine();
			char cur = '+';
			int num = 0;
			for(int i=s.length()-1;i>=0;i--){
				if(s.charAt(i) != cur){
					cur = s.charAt(i);
					num++;
				}
			}
			pw.println("Case #"+c+": "+num);
		}
		pw.close();
	}
}
