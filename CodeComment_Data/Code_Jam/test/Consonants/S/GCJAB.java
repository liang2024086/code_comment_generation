package method_all.Consonants.S.LYD112;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class GCJAB {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		
		String v = "aeiou";
		
		for(int c = 1; c <= cases; c++) {
			String[] p = br.readLine().split(" ");
			String name = p[0];
			int n = Integer.parseInt(p[1]);
			int result = 0;
			
			for(int i = 0; i < name.length(); i++) { // Start position
				for(int j = i+1; j <= name.length(); j++) { // Width
					int cs = 0;
					boolean found = false;
					for(int k = i; k < j; k++) {
//						System.out.print(name.charAt(k));
						if(v.indexOf(name.charAt(k)) < 0)
							cs++;
						else
							cs = 0;

						if(cs >= n) {
							found = true;
						}
					}
					
					if(found)
						result++;
//					System.out.println(" "+result);
				}
			}
			
			System.out.println("Case #"+c+": "+result);
		}
	}
}
