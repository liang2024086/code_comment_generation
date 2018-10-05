package methodEmbedding.Speaking_in_Tongues.S.LYD145;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("A-small-attempt1.in"));
		
		int cases = scanner.nextInt();
		String s = scanner.nextLine();
		
		
		for(int i=0; i < cases; i++){
			
			String line = scanner.nextLine();
			char[] lineArray = line.toCharArray();
			
			for(int j=0; j < lineArray.length; j++){
				
				switch(lineArray[j]){
				case 'a':
					lineArray[j] = 'y';
					break;
				case 'b':
					lineArray[j] = 'h';
					break;
				case 'c':
					lineArray[j] = 'e';
					break;
				case 'd':
					lineArray[j] = 's';
					break;
				case 'e':
					lineArray[j] = 'o';
					break;
				case 'f':
					lineArray[j] = 'c';
					break;
				case 'g':
					lineArray[j] = 'v';
					break;
				case 'h':
					lineArray[j] = 'x';
					break;
				case 'i':
					lineArray[j] = 'd';
					break;
				case 'j':
					lineArray[j] = 'u';
					break;
				case 'k':
					lineArray[j] = 'i';
					break;
				case 'l':
					lineArray[j] = 'g';
					break;
				case 'm':
					lineArray[j] = 'l';
					break;
				case 'n':
					lineArray[j] = 'b';
					break;
				case 'o':
					lineArray[j] = 'k';
					break;
				case 'p':
					lineArray[j] = 'r';
					break;
				case 'q':
					lineArray[j] = 'z';
					break;
				case 'r':
					lineArray[j] = 't';
					break;
				case 's':
					lineArray[j] = 'n';
					break;
				case 't':
					lineArray[j] = 'w';
					break;
				case 'u':
					lineArray[j] = 'j';
					break;
				case 'v':
					lineArray[j] = 'p';
					break;
				case 'w':
					lineArray[j] = 'f';
					break;
				case 'x':
					lineArray[j] = 'm';
					break;
				case 'y':
					lineArray[j] = 'a';
					break;
				case 'z':
					lineArray[j] = 'q';
					break;
				}
				
			}
			
			line = String.valueOf(lineArray);
			
			System.out.println("Case #" + (int)(i+1) + ": " + line);
			
		}
	}

}
