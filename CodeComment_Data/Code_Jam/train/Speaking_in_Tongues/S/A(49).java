package methodEmbedding.Speaking_in_Tongues.S.LYD1252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {
	static char[] mapping = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u',
					'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w',
					'j', 'p', 'f', 'm', 'a', 'q' };
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = -1;
		String[] output = null;
		try {
			n = Integer.parseInt(reader.readLine());
			output = new String[n];
			for(int j = 0; j < n; j++) {
				StringBuilder sb = new StringBuilder();
				char[] line = reader.readLine().toCharArray();
				for(int i = 0; i < line.length; i++) {
					if(line[i] == ' ') sb.append(" ");
					else sb.append(mapping[line[i] - 'a']);
				}
				output[j] = sb.toString();
			}
		}
		catch(IOException e) {}
		for(int j=0; j < n; j++) {
			System.out.println("Case #" + (j+1) + ": " + output[j]);
		}

	}
}
