package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1200;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner in = new Scanner(new File("B-small-attempt2.in"));
		PrintWriter out = new PrintWriter("result.out", "UTF-8");
		
		int T = in.nextInt();
		in.nextLine();
		
		for(int stage=1; stage<=T; ++stage){
			String S = in.nextLine();
			
			int result = 0;
			boolean isHead = true;
			boolean isMinusContinue = false;
			
			//System.out.println("now : "+S);
			for(int idx=0; idx<S.length(); idx++){
				//System.out.println("now : "+S.charAt(idx));
				if(isHead){
					if(S.charAt(idx)=='-')
						result = 1;
					else
						isHead = false;
				}else{
					if(S.charAt(idx)=='-'){
						if(!isMinusContinue){
							isMinusContinue = true;
							result += 2;
						}
					}else
						isMinusContinue = false;
				}
			}
			out.printf("Case #%d: %d\n", stage, result);
		}
		in.close();
		out.close();
	}
}
