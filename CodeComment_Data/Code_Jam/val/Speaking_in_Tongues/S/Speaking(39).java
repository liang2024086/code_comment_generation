package methodEmbedding.Speaking_in_Tongues.S.LYD1543;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Speaking {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("A-small-attempt0.in"));
		s.nextLine();
		
		int count = 1;
		while(s.hasNext()){
			String input = s.nextLine();
			String result = "";
			
			for(int i=0; i<input.length(); i++){
				char c = input.charAt(i);
				switch (c){
					case 'a':
						result += 'y';
						break;
					case 'b':
						result += 'h';
						break;
					case 'c':
						result += 'e';
						break;
					case 'd':
						result += 's';
						break;
					case 'e':
						result += 'o';
						break;
					case 'f':
						result += 'c';
						break;
					case 'g':
						result += 'v';
						break;
					case 'h':
						result += 'x';
						break;
					case 'i':
						result += 'd';
						break;
					case 'j':
						result += 'u';
						break;
					case 'k':
						result += 'i';
						break;
					case 'l':
						result += 'g';
						break;
					case 'm':
						result += 'l';
						break;
					case 'n':
						result += 'b';
						break;
					case 'o':
						result += 'k';
						break;
					case 'p':
						result += 'r';
						break;
					case 'q':
						result += 'z';
						break;
					case 'r':
						result += 't';
						break;
					case 's':
						result += 'n';
						break;
					case 't':
						result += 'w';
						break;
					case 'u':
						result += 'j';
						break;
					case 'v':
						result += 'p';
						break;
					case 'w':
						result += 'f';
						break;
					case 'x':
						result += 'm';
						break;
					case 'y':
						result += 'a';
						break;
					case 'z':
						result += 'q';
						break;
					case ' ':
						result += ' ';
						break;
				}
						
			}
			System.out.print("Case #" + count + ": " + result);
			
			if(s.hasNext()){
				count++;
				System.out.println();
			}
		}
	}
}
