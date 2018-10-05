package methodEmbedding.Speaking_in_Tongues.S.LYD701;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		int nCase = 1;
		while (T-- > 0) {
			
			String G = scan.nextLine();
			
			StringBuffer sb = new StringBuffer();
			
			for (int i = 0; i < G.length(); i++) {
				
				char f = ' ';
				switch (G.charAt(i)) {
				case 'a':
					f = 'y';
					break;
				case 'b':
					f = 'h';
					break;
				case 'c':
					f = 'e';
					break;
				case 'd':
					f = 's';
					break;
				case 'e':
					f = 'o';
					break;
				case 'f':
					f = 'c';
					break;
				case 'g':
					f = 'v';
					break;
				case 'h':
					f = 'x';
					break;
				case 'i':
					f = 'd';
					break;
				case 'j':
					f = 'u';
					break;
				case 'k':
					f = 'i';
					break;
				case 'l':
					f = 'g';
					break;
				case 'm':
					f = 'l';
					break;
				case 'n':
					f = 'b';
					break;
				case 'o':
					f = 'k';
					break;
				case 'p':
					f = 'r';
					break;
				case 'q':
					f = 'z';
					break;
				case 'r':
					f = 't';
					break;
				case 's':
					f = 'n';
					break;
				case 't':
					f = 'w';
					break;
				case 'u':
					f = 'j';
					break;
				case 'v':
					f = 'p';
					break;
				case 'w':
					f = 'f';
					break;
				case 'x':
					f = 'm';
					break;
				case 'y':
					f = 'a';
					break;
				case 'z':
					f = 'q';
					break;

				default:
					break;
				}
				
				sb.append(f);
				
				
			}
			/*StringTokenizer st = new StringTokenizer(G);
			while (st.hasMoreTokens()) {
				
			}*/
			
			
			System.out.println("Case #" + (nCase++) + ": " + sb.toString());
		}

	}

}
