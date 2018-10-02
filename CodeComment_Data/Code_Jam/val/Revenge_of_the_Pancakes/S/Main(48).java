package methodEmbedding.Revenge_of_the_Pancakes.S.LYD250;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Throwable {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i <= cases; i++){
			long total = 0;
			sb.append("Case #"+i+": ");
			String line = in.readLine();
			if( line.endsWith("-"))	total++;
			for (int j = 0; j < line.length(); j++) {
				if( j+1 < line.length() ){
					if(line.charAt(j)=='-' && line.charAt(j+1)=='+') total++;
					else if( line.charAt(j) == '+' && line.charAt(j+1)=='-') total++;
				}
			}
			sb.append(total+"\n");
		}
		System.out.print(new String(sb));
	}
}
