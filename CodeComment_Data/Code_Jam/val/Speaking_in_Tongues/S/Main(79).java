package methodEmbedding.Speaking_in_Tongues.S.LYD176;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Main {
public static void main(String args[]) throws Exception
{

	BufferedReader br= new BufferedReader(new FileReader(args[0]));
	int T=Integer.parseInt( br.readLine());
	BufferedWriter bw= new BufferedWriter(new FileWriter(args[1]));
	for( int i=1 ;i<=T;i++ )
	{
		String S = br.readLine();
		StringBuffer sb = new StringBuffer("Case #"+i+": ");
		int l= S.length();
		for(int k=0;k<l;k++)
		{
			switch(S.charAt(k))
			{
			case ' ':
				sb.append(' ');
				break;
			case 'y':
				sb.append('a');
				break;
			case 'n':
				sb.append('b');
				break;
			case 'f':
				sb.append('c');
				break;
			case 'i':
				sb.append('d');
				break;
			case 'c':
				sb.append('e');
				break;
			case 'w':
				sb.append('f');
				break;
			case 'l':
				sb.append('g');
				break;
			case 'b':
				sb.append('h');
				break;
			case 'k':
				sb.append('i');
				break;
			case 'u':
				sb.append('j');
				break;
			case 'o':
				sb.append('k');
				break;
			case 'm':
				sb.append('l');
				break;
			case 'x':
				sb.append('m');
				break;
			case 's':
				sb.append('n');
				break;
			case 'e':
				sb.append('o');
				break;
			case 'v':
				sb.append('p');
				break;
			case 'z':
				sb.append('q');
				break;
			case 'p':
				sb.append('r');
				break;
			case 'd':
				sb.append('s');
				break;
			case 'r':
				sb.append('t');
				break;
			case 'j':
				sb.append('u');
				break;
			case 'g':
				sb.append('v');
				break;
			case 't':
				sb.append('w');
				break;
			case 'h':
				sb.append('x');
				break;
			case 'a':
				sb.append('y');
				break;
			case 'q':
				sb.append('z');
				break;
				
			}
		
		}
		String r= sb.toString();
		bw.write(r);
bw.newLine();
	}
	
	bw.close();
	br.close();
}
}
