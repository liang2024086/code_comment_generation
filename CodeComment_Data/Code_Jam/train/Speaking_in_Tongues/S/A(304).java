package methodEmbedding.Speaking_in_Tongues.S.LYD840;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A {


	public static void main (String[] args)
	{


		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File("src/A-small-attempt0.in"))));
			PrintWriter pw = new PrintWriter(System.out);
			int cases = Integer.parseInt(in.readLine());	
			for (int i = 0; i < cases; i++) {
				String words = in.readLine();
				StringBuilder b = new StringBuilder("");
				for (int k = 0; k < words.length(); k++) {
					char j = words.charAt(k);
					if(j=='a')
						b.append('y');
					if(j=='b')
						b.append('h');
					if(j=='c')
						b.append('e');
					if(j=='d')
						b.append('s');
					if(j=='e')
						b.append('o');
					if(j=='f')
						b.append('c');
					if(j=='g')
						b.append('v');
					if(j=='h')
						b.append('x');
					if(j=='i')
						b.append('d');
					if(j=='j')
						b.append('u');
					if(j=='k')
						b.append('i');
					if(j=='l')
						b.append('g');
					if(j=='m')
						b.append('l');
					if(j=='n')
						b.append('b');
					if(j=='o')
						b.append('k');
					if(j=='p')
						b.append('r');
					if(j=='q')
						b.append('z');
					if(j=='r')
						b.append('t');
					if(j=='s')
						b.append('n');
					if(j=='t')
						b.append('w');
					if(j=='u')
						b.append('j');
					if(j=='v')
						b.append('p');
					if(j=='w')
						b.append('f');
					if(j=='x')
						b.append('m');
					if(j=='y')
						b.append('a');
					if(j=='z')
						b.append('q');
					if(j==' ')
						b.append(' ');
				}
				System.out.println("Case #"+(i+1)+": "+b.toString());
			}
			pw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
