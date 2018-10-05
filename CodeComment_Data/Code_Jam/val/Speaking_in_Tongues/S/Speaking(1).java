package methodEmbedding.Speaking_in_Tongues.S.LYD163;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Speaking {
	public static void main(String...args) throws IOException  {
		//the result file
		PrintWriter writer = new PrintWriter(new FileWriter("c:\\jam\\A-small-attempt0.out"));
		//reading input file the file
		BufferedReader reader = new BufferedReader(new FileReader("c:\\jam\\A-small-attempt0.in"));
		//Reading cases number
		int count = Integer.parseInt(reader.readLine());
		//Iterating over the cases
		for(int k=1;k<count+1;k++){
			String g = reader.readLine();
			char[] tab = g.toCharArray();
			for(int i=0;i<g.length();i++){
				if(tab[i]=='y'){	tab[i] = 'a'; }
				else if (tab[i]=='n'){tab[i]='b';}
				else if (tab[i]=='f'){tab[i]='c';}
				else if (tab[i]=='i'){tab[i]='d';}
				else if (tab[i]=='c'){tab[i]='e';}
				else if (tab[i]=='w'){tab[i]='f';}
				else if (tab[i]=='l'){tab[i]='g';}
				else if (tab[i]=='b'){tab[i]='h';}
				else if (tab[i]=='k'){tab[i]='i';}
				else if (tab[i]=='u'){tab[i]='j';}
				else if (tab[i]=='o'){tab[i]='k';}
				else if (tab[i]=='m'){tab[i]='l';}
				else if (tab[i]=='x'){tab[i]='m';}
				else if (tab[i]=='s'){tab[i]='n';}
				else if (tab[i]=='e'){tab[i]='o';}
				else if (tab[i]=='v'){tab[i]='p';}
				else if (tab[i]=='z'){tab[i]='q';}
				else if (tab[i]=='p'){tab[i]='r';}
				else if (tab[i]=='d'){tab[i]='s';}
				else if (tab[i]=='r'){tab[i]='t';}
				else if (tab[i]=='j'){tab[i]='u';}
				else if (tab[i]=='g'){tab[i]='v';}
				else if (tab[i]=='t'){tab[i]='w';}
				else if (tab[i]=='h'){tab[i]='x';}
				else if (tab[i]=='a'){tab[i]='y';}
				else if (tab[i]=='q'){tab[i]='z';}
			}
			String str = new String(tab);
			
			writer.println("Case #" + k + ": " + str);
		}
		
			reader.close();
			writer.close();
	}
}
