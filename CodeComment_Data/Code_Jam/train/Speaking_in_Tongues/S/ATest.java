package methodEmbedding.Speaking_in_Tongues.S.LYD440;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class ATest {
	
	public static void main(String[] args) throws FileNotFoundException,Exception {
		Scanner s = new Scanner(new File("A-small-attempt0.in"));
		PrintStream out = new PrintStream("A-small-attempt0.out");
		int N = s.nextInt();
		s.nextLine();
		/*System.out.println(s.nextLine());*/

		
		
		for (int i = 0; i < N; i++) {
			String input =new String(s.nextLine());
			 //""+s.nextLine();
			StringBuffer finalstr = new StringBuffer();
			
			int len = input.length();
			int i2=0;
			while( i2<len)
			{
				char ch =input.charAt(i2) ;
				switch(ch)
				{
				case 'a': ch ='y';
				          finalstr = finalstr.append(ch);
				          i2++;
				          break;
				case 'b': ch ='h';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'c': ch ='e';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'd': ch ='s';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'e': ch ='o';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'f': ch ='c';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'g': ch ='v';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
				case 'h': ch ='x';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'i': ch ='d';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
		          
				case 'j': ch ='u';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'k': ch ='i';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'l': ch ='g';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'm': ch ='l';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'n': ch ='b';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'o': ch ='k';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'p': ch ='r';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'q': ch ='z';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'r': ch ='t';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 's': ch ='n';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
		          
				case 't': ch ='w';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'u': ch ='j';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'v': ch ='p';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
		          
				case 'w': ch ='f';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'x': ch ='m';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'y': ch ='a';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;
		          
				case 'z': ch ='q';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;  
		        
				case ' ': ch =' ';
		          finalstr = finalstr.append(ch);
		          i2++;
		          break;    
				  
				  
				}
			}
		    
			 
			
			out.printf("Case #%d: %s\n", i+1,finalstr );
		}
	}

}
