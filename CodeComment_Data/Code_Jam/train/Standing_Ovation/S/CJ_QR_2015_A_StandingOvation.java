package methodEmbedding.Standing_Ovation.S.LYD1794;


import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class CJ_QR_2015_A_StandingOvation {
	public static void main(String[] args) throws IOException {
		BufferedReader in;
		StringBuilder out = new StringBuilder();
		PrintWriter outF = new PrintWriter("out.txt");
		File file = new File("in");
		if (file.exists())
			in = new BufferedReader(new FileReader(file));
		else
			in = new BufferedReader(new InputStreamReader(System.in));
		String line, lines[];
		char arr[];
		int n = Integer.parseInt(in.readLine()), c, aux, count, r;
		for (int i = 0; i < n; i++) {
			lines = in.readLine().split(" ");
			arr = lines[1].toCharArray();
			c = Integer.parseInt(lines[0]);
			r = 0;
			count = Integer.parseInt(arr[0] + "");
			for (int j = 1; j <= c; j++) {
				aux = Integer.parseInt(arr[j] + "");
				if ( aux != 0 && count < j) {
					r += j - count;
					count += j - count;
				}
				count += aux;
			}
			out.append("Case #" + (i + 1) + ": " + r+"\n");
			outF.append("Case #" + (i + 1) + ": " + r+"\n");
		}
		System.out.print(out);
		outF.close();
	}
	
}
