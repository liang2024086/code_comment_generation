package methodEmbedding.Speaking_in_Tongues.S.LYD93;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Speaking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = null;
		int numCases = 0;

		try {
			inStr = br.readLine();
			numCases = Integer.parseInt(inStr);
			for (int i = 0; i < numCases; i++) {
				inStr = br.readLine();
				System.out.print("Case #" + (i+1) + ": ");
				for (int j = 0; j < inStr.length(); j++) {
					switch (inStr.charAt(j)) {
					case ' ':
						System.out.print(" ");
						break;
					case 'a':
						System.out.print("y");
						break;
					case 'b':
						System.out.print("h");
						break;
					case 'c':
						System.out.print("e");
						break;
					case 'd':
						System.out.print("s");
						break;
					case 'e':
						System.out.print("o");
						break;
					case 'f':
						System.out.print("c");
						break;
					case 'g':
						System.out.print("v");
						break;
					case 'h':
						System.out.print("x");
						break;
					case 'i':
						System.out.print("d");
						break;
					case 'j':
						System.out.print("u");
						break;
					case 'k':
						System.out.print("i");
						break;
					case 'l':
						System.out.print("g");
						break;
					case 'm':
						System.out.print("l");
						break;
					case 'n':
						System.out.print("b");
						break;
					case 'o':
						System.out.print("k");
						break;
					case 'p':
						System.out.print("r");
						break;
					case 'q':
						System.out.print("z");
						break;
					case 'r':
						System.out.print("t");
						break;
					case 's':
						System.out.print("n");
						break;
					case 't':
						System.out.print("w");
						break;
					case 'u':
						System.out.print("j");
						break;
					case 'v':
						System.out.print("p");
						break;
					case 'w':
						System.out.print("f");
						break;
					case 'x':
						System.out.print("m");
						break;
					case 'y':
						System.out.print("a");
						break;
					case 'z':
						System.out.print("q");
						break;
						

					default:
						break;
					}
				}
				
				System.out.println();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
