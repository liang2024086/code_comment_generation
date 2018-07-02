package methodEmbedding.Speaking_in_Tongues.S.LYD50;


import java.io.*;
import java.util.*;
class SIT
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader input=new BufferedReader(new FileReader("input.in"));
		File f=new File("output.txt");
		f.createNewFile();
		PrintWriter out=new PrintWriter(new FileWriter(f));
		String output="";
		int t=Integer.parseInt(input.readLine());
		for(int i=1;i<=t;i++)
		{
			StringBuffer msg=new StringBuffer(input.readLine());
			for(int j=0;j<msg.length();j++)
			{
				switch(msg.charAt(j))
				{
					case 'a':
						msg.setCharAt(j,'y');
						break;
					case 'b':
						msg.setCharAt(j,'h');
						break;
					case 'c':
						msg.setCharAt(j,'e');
						break;
					case 'd':
						msg.setCharAt(j,'s');
						break;
					case 'e':
						msg.setCharAt(j,'o');
						break;
					case 'f':
						msg.setCharAt(j,'c');
						break;
					case 'g':
						msg.setCharAt(j,'v');
						break;
					case 'h':
						msg.setCharAt(j,'x');
						break;
					case 'i':
						msg.setCharAt(j,'d');
						break;
					case 'j':
						msg.setCharAt(j,'u');
						break;
					case 'k':
						msg.setCharAt(j,'i');
						break;
					case 'l':
						msg.setCharAt(j,'g');
						break;
					case 'm':
						msg.setCharAt(j,'l');
						break;
					case 'n':
						msg.setCharAt(j,'b');
						break;
					case 'o':
						msg.setCharAt(j,'k');
						break;
					case 'p':
						msg.setCharAt(j,'r');
						break;
					case 'q':
						msg.setCharAt(j,'z');
						break;
					case 'r':
						msg.setCharAt(j,'t');
						break;
					case 's':
						msg.setCharAt(j,'n');
						break;
					case 't':
						msg.setCharAt(j,'w');
						break;
					case 'u':
						msg.setCharAt(j,'j');
						break;
					case 'v':
						msg.setCharAt(j,'p');
						break;
					case 'w':
						msg.setCharAt(j,'f');
						break;
					case 'x':
						msg.setCharAt(j,'m');
						break;
					case 'y':
						msg.setCharAt(j,'a');
						break;
					case 'z':
						msg.setCharAt(j,'q');
				}

				
			}
					

			
			
			output=output + "Case #" + i + ": " + msg +"\n" ;
		}
		out.println(output);
		out.close();
		input.close();
	}
}

			

			
