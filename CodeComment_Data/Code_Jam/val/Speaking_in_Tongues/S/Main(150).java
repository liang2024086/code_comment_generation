package methodEmbedding.Speaking_in_Tongues.S.LYD1328;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		String currentLine = "";
		char currentLineArr[];
		String newString;
		String finalString = "";
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		for(int i = 0; i<=lines; i++){
			newString = "";
			currentLine = scan.nextLine();
			currentLineArr = currentLine.toCharArray();
			for(int e = 0;e<currentLine.length();e++){
				switch(currentLineArr[e]){
				case ' ':
					newString+=' ';
				break;
				case 'a':
					newString+='y';
				break;
				case 'b':
					newString+='h';
				break;
				case 'c':
					newString+='e';
				break;
				case 'd':
					newString+='s';
				break;
				case 'e':
					newString+='o';
				break;
				case 'f':
					newString+='c';
				break;
				case 'g':
					newString+='v';
				break;
				case 'h':
					newString+='x';
				break;
				case 'i':
					newString+='d';
				break;
				case 'j':
					newString+='u';
				break;
				case 'k':
					newString+='i';
				break;
				case 'l':
					newString+='g';
				break;
				case 'm':
					newString+='l';
				break;
				case 'n':
					newString+='b';
				break;
				case 'o':
					newString+='k';
				break;
				case 'p':
					newString+='r';
				break;
				case 'q':
					newString+='z';
				break;
				case 'r':
					newString+='t';
				break;
				case 's':
					newString+='n';
				break;
				case 't':
					newString+='w';
				break;
				case 'u':
					newString+='j';
				break;
				case 'v':
					newString+='p';
				break;
				case 'w':
					newString+='f';
				break;
				case 'x':
					newString+='m';
				break;
				case 'y':
					newString+='a';
				break;
				case 'z':
					newString+='q';
				break;
				default:
					System.out.println("Invalid Character");
				break;
				}
			}
			if(i!=0){
				finalString+="Case #"+i+": "+newString+"\n";
			}
		}
		System.out.println(finalString);
	}
}
