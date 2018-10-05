package methodEmbedding.Speaking_in_Tongues.S.LYD24;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			FileWriter fst = new FileWriter("out.txt");
			  BufferedWriter out = new BufferedWriter(fst);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = br.readLine();
			int x = Integer.parseInt(strLine);
			String result;
			for (int j = 0; j < x; j++) {
				System.out.print("Case #" + (j + 1) + ": ");
				strLine = br.readLine();
				result = "";
				for (int i = 0; i < strLine.length(); i++) {
					switch (strLine.charAt(i)) {
					case 'a':
						result = result + "y";
						break;
					case 'b':
						result = result + "h";
						break;
					case 'c':
						result = result + "e";
						break;
					case 'd':
						result = result + "s";
						break;
					case 'e':
						result = result + "o";
						break;
					case 'f':
						result = result + "c";
						break;
					case 'g':
						result = result + "v";
						break;
					case 'h':
						result = result + "x";
						break;
					case 'i':
						result = result + "d";
						break;
					case 'j':
						result = result + "u";
						break;
					case 'k':
						result = result + "i";
						break;
					case 'l':
						result = result + "g";
						break;
					case 'm':
						result = result + "l";
						break;
					case 'n':
						result = result + "b";
						break;
					case 'o':
						result = result + "k";
						break;
					case 'p':
						result = result + "r";
						break;
					case 'q':
						result = result + "z";
						break;
					case 'r':
						result = result + "t";
						break;
					case 's':
						result = result + "n";
						break;
					case 't':
						result = result + "w";
						break;
					case 'u':
						result = result + "j";
						break;
					case 'v':
						result = result + "p";
						break;
					case 'w':
						result = result + "f";
						break;
					case 'x':
						result = result + "m";
						break;
					case 'y':
						result = result + "a";
						break;
					case 'z':
						result = result + "q";
						break;
					case ' ':
						result = result + " ";
						break;
					default:
						break;
					}
				}
				out.append("Case #" + (j + 1) + ": "+result);
				out.newLine();
				System.out.println(result);
			}
			
			in.close();
			out.close();
		} catch (Exception e) {// Catch exception if any
		}
	}
}
