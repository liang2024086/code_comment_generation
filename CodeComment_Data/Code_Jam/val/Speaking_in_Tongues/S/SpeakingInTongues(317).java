package methodEmbedding.Speaking_in_Tongues.S.LYD117;

import java.io.*;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int n = Integer.parseInt(bfr.readLine());
		for (int i = 1; i <= n; i++) {
			String G = bfr.readLine();
			String S="";
			for (int j = 0; j < G.length(); j++) {
				switch (G.charAt(j)) {
				case 'a':
					S +='y';
					break;
				case 'b':
					S +='h';
					break;
				case 'c':
					S +='e';
					break;
				case 'd':
					S +='s';
					break;
				case 'e':
					S +='o';					
					break;
				case 'f':
					S +='c';
					break;
				case 'g':
					S +='v';
					break;
				case 'h':
					S +='x';
					break;
				case 'i':
					S +='d';
					break;
				case 'j':
					S +='u';
					break;
				case 'k':
					S +='i';
					break;
				case 'l':
					S +='g';
					break;
				case 'm':
					S +='l';
					break;
				case 'n':
					S +='b';
					break;
				case 'o':
					S +='k';
					break;
				case 'p':
					S +='r';
					break;
				case 'q':
					S +='z';
					break;
				case 'r':
					S +='t';
					break;
				case 's':
					S +='n';
					break;
				case 't':
					S +='w';
					break;
				case 'u':
					S +='j';
					break;
				case 'v':
					S +='p';
					break;
				case 'w':
					S +='f';
					break;
				case 'x':
					S +='m';
					break;
				case 'y':
					S +='a';
					break;
				case 'z':
					S +='q';
					break;
				
				default:
					S+=G.charAt(j);
					break;
				}
				
				
				
			}
			pr.printf("Case #%d: %s\n", i, S);
			pr.flush();
		}

	}

}
