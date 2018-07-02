package methodEmbedding.Speaking_in_Tongues.S.LYD980;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;




public class Googleress {

	public static void main(String[] args) throws IOException
	{
		
		Scanner scanInput = new Scanner(System.in);
		String target = scanInput.next();
		
		File inputFile = new File(target);
		Scanner fileScan = new Scanner(inputFile);
		
		String line = "";
		int strlen = 0;
		
		int count = fileScan.nextInt();
		
		String outpFileName = "output.dat";
		FileWriter googlewriter = null;
		googlewriter = new FileWriter(outpFileName);
		
		PrintWriter diskFile = new PrintWriter(googlewriter);
		
		line = fileScan.nextLine();
		
		
		
		for (int i = 0; i < count; i++)
		{
			line = fileScan.nextLine();
			
			strlen = line.length();
			
			diskFile.print("Case #" + (i + 1) + ": ");
			
			for (int j = 0; j < strlen; j++)
			{
					if (line.charAt(j) <= 'z' && line.charAt(j) >= 'a')
					{
						switch(line.charAt(j))
						{
							case 'y':
								diskFile.print('a');
							break;
							case 'n':
								diskFile.print('b');
							break;
							case 'f':
								diskFile.print('c');
							break;
							case 'i':
								diskFile.print('d');
							break;
							case 'c':
								diskFile.print('e');
							break;
							case 'w':
								diskFile.print('f');
							break;
							case 'l':
								diskFile.print('g');
							break;
							case 'b':
								diskFile.print('h');
							break;
							case 'k':
								diskFile.print('i');
							break;
							case 'u':
								diskFile.print('j');
							break;
							case 'o':
								diskFile.print('k');
							break;
							case 'm':
								diskFile.print('l');
							break;
							case 'x':
								diskFile.print('m');
							break;
							case 's':
								diskFile.print('n');
							break;
							case 'e':
								diskFile.print('o');
							break;
							case 'v':
								diskFile.print('p');
							break;
							case 'z':
								diskFile.print('q');
							break;
							case 'p':
								diskFile.print('r');
							break;
							case 'd':
								diskFile.print('s');
							break;
							case 'r':
								diskFile.print('t');
							break;
							case 'j':
								diskFile.print('u');
							break;
							case 'g':
								diskFile.print('v');
							break;
							case 't':
								diskFile.print('w');
							break;
							case 'h':
								diskFile.print('x');
							break;
							case 'a':
								diskFile.print('y');
							break;
							case 'q':
								diskFile.print('z');
							break;
						}
						
						
						
					}
					
					else
						diskFile.print(line.charAt(j));
					
			}
			diskFile.print("\n");
			
			
		}
		
		
		
	diskFile.close();
	
		
	}
}
