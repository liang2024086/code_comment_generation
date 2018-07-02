package methodEmbedding.Speaking_in_Tongues.S.LYD370;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	static BufferedReader brscan = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		pw = new PrintWriter(new File("output-A.txt"));
		char[] alpha = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q' };
		int tc = Integer.parseInt(brscan.readLine());

		String temp = "";
		for (int n = 0; n < tc; n++) {
			temp = brscan.readLine();
			pw.print("Case #"+(n+1)+": ");
			for (int m = 0; m < temp.length(); m++) {
				if (temp.charAt(m) == ' ') {
					pw.print(" ");
				} else {
					pw.print(alpha[temp.charAt(m) - 'a']);
				}
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

}
