package methodEmbedding.Speaking_in_Tongues.S.LYD535;


import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SpeakingInTongues {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"d:\\input.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"d:\\output.txt"));
			int numOfLines = Integer.parseInt(br.readLine());

			for (int i = 1; i <= numOfLines; i++) {
				char[] charList = br.readLine().toCharArray();
				StringBuffer strOut = new StringBuffer();
				for (int j = 0; j < charList.length; j++) {
					switch (charList[j]) {
					case 'a':
						strOut.append('y');
						break;
					case 'b':
						strOut.append('h');
						break;
					case 'c':
						strOut.append('e');
						break;
					case 'd':
						strOut.append('s');
						break;
					case 'e':
						strOut.append('o');
						break;
					case 'f':
						strOut.append('c');
						break;
					case 'g':
						strOut.append('v');
						break;
					case 'h':
						strOut.append('x');
						break;
					case 'i':
						strOut.append('d');
						break;
					case 'j':
						strOut.append('u');
						break;
					case 'k':
						strOut.append('i');
						break;
					case 'l':
						strOut.append('g');
						break;
					case 'm':
						strOut.append('l');
						break;
					case 'n':
						strOut.append('b');
						break;
					case 'o':
						strOut.append('k');
						break;
					case 'p':
						strOut.append('r');
						break;
					case 'q':
						strOut.append('z');
						break;
					case 'r':
						strOut.append('t');
						break;
					case 's':
						strOut.append('n');
						break;
					case 't':
						strOut.append('w');
						break;
					case 'u':
						strOut.append('j');
						break;
					case 'v':
						strOut.append('p');
						break;
					case 'w':
						strOut.append('f');
						break;
					case 'x':
						strOut.append('m');
						break;
					case 'y':
						strOut.append('a');
						break;
					case 'z':
						strOut.append('q');
						break;
					default:
						strOut.append(charList[j]);
					}
				}
				System.out.println("Case " + i + ": " + strOut);
				String output = "Case #" + i + ": " + strOut;
				bw.write(output);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
