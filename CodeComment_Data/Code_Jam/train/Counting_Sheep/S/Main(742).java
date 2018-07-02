package methodEmbedding.Counting_Sheep.S.LYD210;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eol = System.getProperty("line.separator");
		byte[] eolb = eol.getBytes();
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		byte[] caseb = "Case #".getBytes();
		byte[] colonb = ": ".getBytes();
		try {
			String str = br.readLine();
			int t = Integer.parseInt(str);
			for (int i = 0; i < t; i++) {
				str = br.readLine();
				long n = Long.parseLong(str);
				if (n == 0) {
					bos.write(caseb);
					bos.write(new Integer(i + 1).toString().getBytes());
					bos.write(colonb);
					bos.write("INSOMNIA".getBytes());
					bos.write(eolb);
				} else {
					long ans = 0;
					boolean[] hasDigit = new boolean[10];
					Arrays.fill(hasDigit, false);
					boolean done = false;
					long iter = 1;
					do {
						ans = iter * n; 
						str = new Long(ans).toString();
						for (int j = 0; j < str.length(); j++) {
							String temp = str.substring(j, j + 1);
							int x = Integer.parseInt(temp);
							hasDigit[x] = true;
						}
						done = true;
						for (int j = 0; j < 10; j++) {
							if (!hasDigit[j]) {
								done = false;
								break;
							}
						}
						iter++;
					} while (done != true);
					bos.write(caseb);
					bos.write(new Integer(i + 1).toString().getBytes());
					bos.write(colonb);
					bos.write(new Long(ans).toString().getBytes());
					bos.write(eolb);
				}
			}
			bos.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
