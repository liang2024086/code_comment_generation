package methodEmbedding.Speaking_in_Tongues.S.LYD1527;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		
		in.nextLine();

		for (int i = 1; i <= T; i++) {
			String translatedLine="";
			
			String line = in.nextLine();
			
			line = line.toLowerCase();
			
			for (int j=0; j<line.length();j++){
				char c = line.charAt(j);
				if (c == 'a')
					translatedLine += 'y';
				else if (c == 'b')
					translatedLine += 'h';
				else if (c == 'c')
					translatedLine += 'e';
				else if (c == 'd')
					translatedLine += 's';
				else if (c == 'e')
					translatedLine += 'o';
				else if (c == 'f')
					translatedLine += 'c';
				else if (c == 'g')
					translatedLine += 'v';
				else if (c == 'h')
					translatedLine += 'x';
				else if (c == 'i')
					translatedLine += 'd';
				else if (c == 'j')
					translatedLine += 'u';
				else if (c == 'k')
					translatedLine += 'i';
				else if (c == 'l')
					translatedLine += 'g';
				else if (c == 'm')
					translatedLine += 'l';
				else if (c == 'n')
					translatedLine += 'b';
				else if (c == 'o')
					translatedLine += 'k';
				else if (c == 'p')
					translatedLine += 'r';
				else if (c == 'q')
					translatedLine += 'z';
				else if (c == 'r')
					translatedLine += 't';
				else if (c == 's')
					translatedLine += 'n';
				else if (c == 't')
					translatedLine += 'w';
				else if (c == 'u')
					translatedLine += 'j';
				else if (c == 'v')
					translatedLine += 'p';
				else if (c == 'w')
					translatedLine += 'f';
				else if (c == 'x')
					translatedLine += 'm';
				else if (c == 'y')
					translatedLine += 'a';
				else if (c == 'z')
					translatedLine += 'q';
				else
					translatedLine+= c;
			}
			
			System.out.println("Case #"+i+": "+translatedLine);	
		}
	}
}
