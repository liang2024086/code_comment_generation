package methodEmbedding.Speaking_in_Tongues.S.LYD769;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class A {
	
	public static char[] a = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
	//            x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x   x    
	public static char[] g = { 'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q' };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		
		for(int c = 0; c < cases; c++) {
			String line = br.readLine();
			String result = "";
			
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
					for(int j = 0; j < g.length; j++) {
						if(g[j] == line.charAt(i)) {
							result += a[j];
							break;
						}
					}
				}
				else {
					result += ' ';
				}
			}
			
			System.out.println("Case #"+(c+1)+": "+result);
		}
	}
}
