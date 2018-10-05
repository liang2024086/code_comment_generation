package methodEmbedding.Speaking_in_Tongues.S.LYD954;

import java.io.*;
import java.lang.*; 

public class SpeakingInTongues 
{

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub
		public static void main(String args[])throws IOException
	{

		FileInputStream fstream = new FileInputStream("A-small-attempt1.in");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLineR,space=" ";
		FileOutputStream fout;		
		int cases=0;
		StringBuffer strw=new StringBuffer();;
		if(((strLineR = br.readLine()) != null))
		{
		 cases=Integer.parseInt(strLineR);
		  }  

for(int i=0;i<cases;i++)
		{
			if((strLineR = br.readLine()) != null)
			{
				strw.delete(0,strw.length());
			for(int j=0;j<strLineR.length();j++)
			{
				
				switch(strLineR.charAt(j))
				{
				case 'A':
				case 'a': strw.append('y');
							break;
				case 'B':
				case 'b': strw.append('h');
				break;
				case 'C':
				case 'c': strw.append('e');
				break;
				case 'D':
				case 'd': strw.append('s');
				break;
				case 'E':
				case 'e': strw.append('o');
				break;
				case 'F':
				case 'f': strw.append('c');
				break;
				case 'G':
				case 'g': strw.append('v');
				break;
				case 'H':
				case 'h': strw.append('x');
				break;
				case 'I':
				case 'i': strw.append('d');
				break;
				case 'J':
				case 'j': strw.append('u');
				break;
				case 'K':
				case 'k': strw.append('i');
				break;
				case 'L':
				case 'l': strw.append('g');
				break;
				case 'M':
				case 'm': strw.append('l');
				break;
				case 'N':
				case 'n': strw.append('b');
				break;
				case 'O':
				case 'o': strw.append('k');
				break;
				case 'P':
				case 'p': strw.append('r');
				break;
				case 'Q':
				case 'q': strw.append('z');
				break;
				case 'R':
				case 'r': strw.append('t');
				break;
				case 'S':
				case 's': strw.append('n');
				break;
				case 'T':
				case 't': strw.append('w');
				break;
				case 'U':
				case 'u': strw.append('j');
				break;
				case 'V':
				case 'v': strw.append('p');
				break;
				case 'W':
				case 'w': strw.append('f');
				break;
				case 'X':
				case 'x': strw.append('m');
				break;
				case 'Y':
				case 'y': strw.append('a');
				break;
				case 'Z':
				case 'z': strw.append('q');
				break;
				case ' ':strw.append(space);
				
				default: 
				}
				
			}
				

				try
{		

				    int k=i+1;
				    
				    
	fout = new FileOutputStream ("speakingintounguesOUTPUT.txt",true);
	new PrintStream(fout).println ("Case #"+k+": "+strw);
			   
				    fout.close();
}	catch (IOException e)
				{
					System.err.println ("Unable to write to file");
					System.exit(-1);
				}

				
				
				
			}
		}
				}

}


