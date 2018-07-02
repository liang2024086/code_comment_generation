package methodEmbedding.Speaking_in_Tongues.S.LYD1162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String args[]) {
		try {
			new A();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public final String table = "yhesocvxduiglbkrztnwjpfmaq";


	public A() throws IOException {
		String tmp;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		tmp = in.readLine();
		int T = Integer.parseInt(tmp);
		for(int t=0; t<T; t++) {
			tmp = in.readLine();

			System.out.printf("Case #%d: ", t+1);
			int len = tmp.length();
			for(int i=0; i<len; i++) {
				char c = tmp.charAt(i);
				if(c != ' ') c = table.charAt(c - 'a');
				System.out.printf("%c", c);
			}
			System.out.println();
		}
	}
}
