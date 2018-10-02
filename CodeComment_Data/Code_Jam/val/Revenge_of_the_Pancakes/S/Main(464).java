package methodEmbedding.Revenge_of_the_Pancakes.S.LYD99;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eol = System.getProperty("line.separator");
		byte [] eolb = eol.getBytes();
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		byte [] caseb = "Case #".getBytes();
		byte [] colonb = ": ".getBytes();
		try {
			String str = br.readLine();
			int t = Integer.parseInt(str);
			for(int i = 0 ; i < t ; i++) {
				long ans = 0;
				str = br.readLine();
				for(int j = 1 ; j < str.length() ; j++) {
					if(str.charAt(j)!=str.charAt(j-1)) {
						ans++;
					}
				}
				if(str.charAt(str.length()-1)=='-') {
					ans++;
				}
				bos.write(caseb);
				bos.write(new Integer(i+1).toString().getBytes());
				bos.write(colonb);
				bos.write(new Long(ans).toString().getBytes());
				bos.write(eolb);
			}
			bos.flush();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
