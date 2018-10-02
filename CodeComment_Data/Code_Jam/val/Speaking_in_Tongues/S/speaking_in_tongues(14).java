package methodEmbedding.Speaking_in_Tongues.S.LYD639;

import java.util.Scanner;

public class speaking_in_tongues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		String[] answers = new String[T];
		String s = scanner.nextLine();
		
		for (int n = 0; n < T; n++) {
			
			s = scanner.nextLine();
			String answer = "";
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				switch (c) {
				case 'a':
					answer+='y';
					break;
				case 'b':
					answer+='h';
					break;
				case 'c':
					answer+='e';
					break;
				case 'd':
					answer+='s';
					break;
				case 'e':
					answer+='o';
					break;
				case 'f':
					answer+='c';
					break;
				case 'g':
					answer+='v';
					break;
				case 'h':
					answer+='x';
					break;
				case 'i':
					answer+='d';
					break;
				case 'j':
					answer+='u';
					break;
				case 'k':
					answer+='i';
					break;
				case 'l':
					answer+='g';
					break;
				case 'm':
					answer+='l';
					break;
				case 'n':
					answer+='b';
					break;
				case 'o':
					answer+='k';
					break;
				case 'p':
					answer+='r';
					break;
				case 'q':
					answer+='z';
					break;
				case 'r':
					answer+='t';
					break;
				case 's':
					answer+='n';
					break;
				case 't':
					answer+='w';
					break;
				case 'u':
					answer+='j';
					break;
				case 'v':
					answer+='p';
					break;
				case 'w':
					answer+='f';
					break;
				case 'x':
					answer+='m';
					break;
				case 'y':
					answer+='a';
					break;
				case 'z':
					answer+='q';
					break;
				case ' ':
					answer+=' ';
					break;
				}
			}
			
			answers[n] = answer;
			
		}
		
		for (int n = 0; n < T; n++) {
			int m = n+1;
			System.out.println("Case #"+m+": "+answers[n]);
		}
		
	}
}
