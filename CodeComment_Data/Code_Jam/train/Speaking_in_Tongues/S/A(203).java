package methodEmbedding.Speaking_in_Tongues.S.LYD1647;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A{
	
	public static void main(String[] args) throws IOException  {
		Scanner in = new Scanner(new FileReader("A-small-attempt3.in"));
		FileWriter output = new FileWriter("A-small-output.txt");
		String line = in.nextLine();
		int n = Integer.parseInt(line);
		char[] letters;
		char c;

		for (int i = 0; i < n; i++) {
			line = in.nextLine();			
			letters = line.toCharArray();	
			for (int j=0; j<line.length(); j++){
				c = letters[j];

				if (c != ' '){
					switch(c){
					case 'a':
						letters[j] = 'y';
						break;
					case 'b':
						letters[j] = 'h';
						break;
					case 'c':
						letters[j] = 'e';
						break;
					case 'd':
						letters[j] = 's';
						break;
					case 'e':
						letters[j] = 'o';
						break;
					case 'f':
						letters[j] = 'c';
						break;
					case 'g':
						letters[j] = 'v';
						break;
					case 'h':
						letters[j] = 'x';
						break;
					case 'i':
						letters[j] = 'd';
						break;
					case 'j':
						letters[j] = 'u';
						break;
					case 'k':
						letters[j] = 'i';
						break;
					case 'l':
						letters[j] = 'g';
						break;
					case 'm':
						letters[j] = 'l';
						break;
					case 'n':
						letters[j] = 'b';
						break;
					case 'o':
						letters[j] = 'k';
						break;
					case 'p':
						letters[j] = 'r';
						break;
					case 'q':
						letters[j] = 'z';
						break;
					case 'r':
						letters[j] = 't';
						break;
					case 's':
						letters[j] = 'n';
						break;
					case 't':
						letters[j] = 'w';
						break;
					case 'u':
						letters[j] = 'j';
						break;
					case 'v':
						letters[j] = 'p';
						break;
					case 'w':
						letters[j] = 'f';
						break;
					case 'x':
						letters[j] = 'm';
						break;
					case 'y':
						letters[j] = 'a';
						break;
					case 'z':
						letters[j] = 'q';
						break;
					}
				}
				
			}
			
			output.write("Case #" + (int) (i+1) +": " +new String(letters) + "\n");
		}
		
		output.close();
		
	}

}



