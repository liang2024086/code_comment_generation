package methodEmbedding.Counting_Sheep.S.LYD559;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner in = new Scanner(new File("A-small-attempt2.in"));
		PrintWriter out = new PrintWriter("result.out", "UTF-8");
		
		int T = in.nextInt();
		
		for(int stage=1; stage<=T; ++stage){
			HashSet<Integer> digits = new HashSet<Integer>();
			int N = in.nextInt();
			
			if(N == 0){
				out.printf("Case #%d: INSOMNIA\n", stage);
				continue;
			}
			
			for(int i=1; true; ++i){
				int n = N*i;
				while(n > 0){
					digits.add(n%10);
					n/=10;
				}
				if(digits.size() == 10){
					out.printf("Case #%d: %d\n", stage, N*i);
					break;
				}
			}
		}
		in.close();
		out.close();
	}
}
