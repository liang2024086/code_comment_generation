package methodEmbedding.Speaking_in_Tongues.S.LYD643;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class problemA {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Scanner in = new Scanner(new File("input.in"));
		
		int linesCount=in.nextInt();
		PrintWriter out=new PrintWriter("output.out");
		String inputString="";
		for (int i = 0; i <= linesCount; i++) {
			String outputString="";
			if(i>0)
				outputString+="Case #"+i+": ";
			inputString=in.nextLine();
			for (int index = 0; index < inputString.length(); index++) {
				switch (inputString.charAt(index)) {
				case 'y':
					outputString+='a';break;
				case 'n':
					outputString+='b';break;
				case 'f':
					outputString+='c';break;
				case 'i':
					outputString+='d';break;
				case 'c':
					outputString+='e';break;
				case 'w':
					outputString+='f';break;
				case 'l':
					outputString+='g';break;
				case 'b':
					outputString+='h';break;
				case 'k':
					outputString+='i';break;
				case 'u':
					outputString+='j';break;
				case 'o':
					outputString+='k';break;
				case 'm':
					outputString+='l';break;
				case 'x':
					outputString+='m';break;
				case 's':
					outputString+='n';break;
				case 'e':
					outputString+='o';break;
				case 'v':
					outputString+='p';break;
				case 'z':
					outputString+='q';break;
				case 'p':
					outputString+='r';break;
				case 'd':
					outputString+='s';break;
				case 'r':
					outputString+='t';break;
				case 'j':
					outputString+='u';break;
				case 'g':
					outputString+='v';break;
				case 't':
					outputString+='w';break;
				case 'h':
					outputString+='x';break;
				case 'a':
					outputString+='y';break;
				case 'q':
					outputString+='z';break;

				default:
					outputString+=inputString.charAt(index);
					break;
				}
			}
			if(i>0)
			out.println(outputString);
		}
		
		out.close();
	}

}
