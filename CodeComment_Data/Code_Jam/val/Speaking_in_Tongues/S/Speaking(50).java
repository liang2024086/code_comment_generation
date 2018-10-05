package methodEmbedding.Speaking_in_Tongues.S.LYD446;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import Util.FileIOUtility;

public class Speaking {

	public static void main(String[] args) throws Exception {
		String inFile = JOptionPane.showInputDialog(null,
				"Enter input filename : ", "Input FileName",
				JOptionPane.PLAIN_MESSAGE);
		System.out.println("-----Input File name:" + inFile);
		BufferedReader br = FileIOUtility.openFileinRead(inFile);
		String scases = br.readLine();
		int cases = Integer.parseInt(scases);
		System.out.println("No. of test cases:" + cases);

		StringBuffer sb;
		BufferedWriter bw = FileIOUtility
				.openFileinWrite(FileIOUtility.OUT_FILE_NAME);
		// start iteration for eact test cases
		for (int tcase = 0; tcase < cases; tcase++) {
			// int goldCoins = 0;

			sb = new StringBuffer();
			sb.append("Case #" + (tcase + 1) + ": ");

			String line = br.readLine();
			int size = line.length();
			System.out.println("-----No. of Chars: " + size);
			StringBuffer outLine = new StringBuffer(size);
			outLine.append(line);
			for (int i = 0; i < size; i++) {
				char c = line.charAt(i);
				switch (c) {
				case ' ':
					outLine.setCharAt(i, ' ');
					break;
				case 'y':
					outLine.setCharAt(i, 'a');
					break;
				case 'n':
					outLine.setCharAt(i, 'b');
					break;
				case 'f':
					outLine.setCharAt(i, 'c');
					break;
				case 'i':
					outLine.setCharAt(i, 'd');
					break;
				case 'c':
					outLine.setCharAt(i, 'e');
					break;
				case 'w':
					outLine.setCharAt(i, 'f');
					break;
				case 'l':
					outLine.setCharAt(i, 'g');
					break;
				case 'b':
					outLine.setCharAt(i, 'h');
					break;
				case 'k':
					outLine.setCharAt(i, 'i');
					break;
				case 'u':
					outLine.setCharAt(i, 'j');
					break;
				case 'o':
					outLine.setCharAt(i, 'k');
					break;
				case 'm':
					outLine.setCharAt(i, 'l');
					break;
				case 'x':
					outLine.setCharAt(i, 'm');
					break;
				case 's':
					outLine.setCharAt(i, 'n');
					break;
				case 'e':
					outLine.setCharAt(i, 'o');
					break;
				case 'v':
					outLine.setCharAt(i, 'p');
					break;
				case 'z':
					outLine.setCharAt(i, 'q');
					break;
				case 'p':
					outLine.setCharAt(i, 'r');
					break;
				case 'd':
					outLine.setCharAt(i, 's');
					break;
				case 'r':
					outLine.setCharAt(i, 't');
					break;
				case 'j':
					outLine.setCharAt(i, 'u');
					break;
				case 'g':
					outLine.setCharAt(i, 'v');
					break;
				case 't':
					outLine.setCharAt(i, 'w');
					break;
				case 'h':
					outLine.setCharAt(i, 'x');
					break;
				case 'a':
					outLine.setCharAt(i, 'y');
					break;
				case 'q':
					outLine.setCharAt(i, 'z');
					break;

				}
			}
			System.out.println("-----No. of chars after replac: "
					+ outLine.toString().length());
			System.out.println("Output- " + outLine.toString());
			
			sb.append(outLine.toString());
			bw.write(sb.toString());
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
