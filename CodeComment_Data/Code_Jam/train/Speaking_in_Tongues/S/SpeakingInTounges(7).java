package methodEmbedding.Speaking_in_Tongues.S.LYD608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpeakingInTounges 
{
public static void main(String[] args) throws IOException {
	FileWriter wr=new FileWriter("Output.txt");
	BufferedWriter buff=new BufferedWriter(wr);
	
	FileReader read=new FileReader("A-small-attempt0.in");
	BufferedReader buffr=new BufferedReader(read);
	
	String str;
	str=buffr.readLine();
	
	int n=Integer.parseInt(str);
	int i,j;
	char ch;
	char out;
	j=1;
	StringBuffer temp;
	while(j<=n)
	{
		str=buffr.readLine();
		i=0;
		StringBuffer output=new StringBuffer();
		while(i<str.length())
		{
			ch=str.charAt(i);
			switch(ch)
			{
			case 'a':
			out='y';
			break;
			
			case 'b':
			out='h';
			break;
			
			case 'c':
				out='e';
				break;
				
			case 'd':
				out='s';
				break;
				
			case 'e':
				out='o';
				break;
				
			case 'f':
				out='c';
				break;
				
			case 'g':
				out='v';
				break;
				
			case 'h':
				out='x';
				break;
				
			case 'i':
				out='d';
				break;
				
			case 'j':
				out='u';
				break;
				
			case 'k':
				out='i';
				break;
				
			case 'l':
				out='g';
				break;
			case 'm':
				out='l';
				break;
			case 'n':
				out='b';
				break;
			case 'o':
				out='k';
				break;
			case 'p':
				out='r';
				break;
				
			case 'q':
				out='z';
				break;
			case 'r':
				out='t';
				break;
			case 's':
				out='n';
				break;
			case 't':
				out='w';
				break;
			case 'u':
				out='j';
				break;
			case 'v':
				out='p';
				break;
			case 'w':
				out='f';
				break;
			case 'x':
				out='m';
				break;
			case 'y':
				out='a';
				break;
			case 'z':
				out='q';
				break;
			default:
				out=ch;
			
			}
			output=output.append(out);
			++i;
		}
		
		temp=new StringBuffer("Case #"+j+": ");
		temp=temp.append(output);
		buff.write(temp.toString());
		buff.newLine();
		j++;
	
	}
	buff.close();
}
}
