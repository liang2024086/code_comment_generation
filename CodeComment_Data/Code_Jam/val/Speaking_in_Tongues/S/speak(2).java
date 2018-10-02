package methodEmbedding.Speaking_in_Tongues.S.LYD1464;

import java.util.Scanner;
import java.io.*;

class speak
{
  public static void main (String[] args) throws IOException
  { 
    File    inputData = new File("A-small-attempt0.in");
	File 	outputData= new File("output.txt");
    Scanner scan = new Scanner( inputData );
	PrintStream print= new PrintStream(outputData);
    
	int num,stringLength,j= 1;
	char c;
	String inputString;
	
	num= scan.nextInt();
	scan.nextLine();
		
	while(scan.hasNextLine())
	{
	print.print("Case #"+ j+ ": ");
	j++;
	inputString = scan.nextLine();
	stringLength= inputString.length();
	
	for(int i=0;i<stringLength;i++)
	{
	c= inputString.charAt(i);
	switch (c)
	{
	case 'a': 	print.print('y');	break;
	case 'b': 	print.print("h");	break;
	case 'c':	print.print("e");	break;
	case 'd':	print.print("s");	break;
	case 'e':	print.print("o");	break;
	case 'f':	print.print("c");	break;
	case 'g':	print.print("v");	break;
	case 'h':	print.print("x");	break;
	case 'i':	print.print("d");	break;
	case 'j':	print.print("u");	break;
	case 'k':	print.print("i");	break;
	case 'l':	print.print("g");	break;
	case 'm':	print.print("l");	break;
	case 'n':	print.print("b");	break;
	case 'o':	print.print("k");	break;
	case 'p':	print.print("r");	break;
	case 'q':	print.print("z");	break;
	case 'r':	print.print("t");	break;
	case 's':	print.print("n");	break;
	case 't':	print.print("w");	break;
	case 'u':	print.print("j");	break;
	case 'v':	print.print("p");	break;
	case 'w':	print.print("f");	break;
	case 'x':	print.print("m");	break;
	case 'y':	print.print("a");	break;
	case 'z':	print.print("q");	break;
	case ' ':	print.print(" ");	break;
	}
	}
	print.println();
	}
  }
}
