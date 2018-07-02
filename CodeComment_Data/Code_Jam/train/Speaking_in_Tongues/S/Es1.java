package methodEmbedding.Speaking_in_Tongues.S.LYD1035;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Es1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("small.txt");
		
		  DataInputStream in = new DataInputStream(fstream); 
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		 String strLine;
		int t = 31;
		int i = 1;
		int exit = 1;
		String out = "";
		while (t > 0) {
			strLine = br.readLine();

			if (t == 31)
			
				t = Integer.parseInt(strLine);
			else {
				int k = 0;
				while (exit != 0 && k < strLine.length()) {
					char tmp = strLine.charAt(k);

					if (tmp == 'a')
						out = out + 'y';
					else if (tmp == 'b') {
						out = out + 'h';
					} else if (tmp == 'c') {
						out = out + 'e';
					} else if (tmp == 'd') {
						out = out + 's';
					} else if (tmp == 'e') {
						out = out + 'o';
					} else if (tmp == 'f') {
						out = out + 'c';
					} else if (tmp == 'g') {
						out = out + 'v';
					} else if (tmp == 'h') {
						out = out + 'x';
					} else if (tmp == 'i') {
						out = out + 'd';
					} else if (tmp == 'l') {
						out = out + 'g';
					} else if (tmp == 'm') {
						out = out + 'l';
					} else if (tmp == 'n') {
						out = out + 'b';
					} else if (tmp == 'o') {
						out = out + 'k';
					} else if (tmp == 'p') {
						out = out + 'r';
					} else if (tmp == 'q') {
						out = out + 'z';
					} else if (tmp == 'r') {
						out = out + 't';
					} else if (tmp == 's') {
						out = out + 'n';
					} else if (tmp == 't') {
						out = out + 'w';
					} else if (tmp == 'u') {
						out = out + 'j';
					} else if (tmp == 'v') {
						out = out + 'p';
					} else if (tmp == 'z') {
						out = out + 'q';
					} else if (tmp == 'j') {
						out = out + 'u';
					} else if (tmp == 'k') {
						out = out + 'i';
					} else if (tmp == 'x') {
						out = out + 'm';
					} else if (tmp == 'y') {
						out = out + 'a';
					} else if (tmp == 'w') {
						out = out + 'f';
					} else if (tmp == ' ') {
						out = out + ' ';
					} else if (tmp == '\n') {
						out = out + '\n';
						exit = 0;
					}
					k++;
				}
			
				System.out.println("Case #" + i + ": " + out);
				out = "";
				t--;
				i++;
			}

		}
		in.close();
	}

}
