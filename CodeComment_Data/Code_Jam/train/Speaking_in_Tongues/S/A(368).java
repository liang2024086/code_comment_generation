package methodEmbedding.Speaking_in_Tongues.S.LYD691;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class A {
	private static char codes[] = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b',
		'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	
	public static void main(String args[]) {
		try {
			String fileName = "C:\\Users\\Lenovo Z370\\Desktop\\gcj\\comp-2012\\A-small-attempt0.in";
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			int t = Integer.parseInt(br.readLine());
			for(int i=0; i<t; i++) {
				String line = br.readLine();
				char[] lc = line.toCharArray();
				for(int j=0; j<lc.length; j++) {
					if(lc[j] >= 'a' && lc[j] <= 'z') {
						lc[j] = codes[lc[j] - 'a'];
					}
				}
				
				System.out.println("Case #" + (i+1) + ": " + String.valueOf(lc));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
