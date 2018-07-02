package methodEmbedding.Speaking_in_Tongues.S.LYD41;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Tongues {
public static void main(String[] args) throws Exception {
	String file="A-small-attempt0.in";
	String oFile="A-small-attempt0.out";
	BufferedReader br = new BufferedReader(new FileReader(file));
	BufferedWriter bw = new BufferedWriter(new FileWriter(oFile));
	int cases = Integer.parseInt(br.readLine());
	for(int i=1; i<=cases; i++)
	{
		bw.write("Case #"+i+": ");
		String line = br.readLine();
		for(int j=0; j<line.length(); j++)
		{
			char c = line.charAt(j);
			char w;
			if(c=='y')
				w='a';
			else if(c=='n')
				w='b' ;
			else if(c=='f')
				w='c' ;
			else if(c=='i')
				w='d' ;
			else if(c=='c')
				w='e' ;
			else if(c=='w')
				w='f' ;
			else if(c=='l')
				w='g' ;
			else if(c=='b')
				w='h' ;
			else if(c=='k')
				w='i' ;
			else if(c=='u')
				w='j' ;
			else if(c=='o')
				w='k' ;
			else if(c=='m')
				w='l' ;
			else if(c=='x')
				w='m' ;
			else if(c=='s')
				w='n' ;
			else if(c=='e')
				w='o' ;
			else if(c=='v')
				w='p' ;
			else if(c=='z')
				w='q' ;
			else if(c=='p')
				w='r' ;
			else if(c=='d')
				w='s' ;
			else if(c=='r')
				w='t' ;
			else if(c=='j')
				w='u' ;
			else if(c=='g')
				w='v' ;
			else if(c=='t')
				w='w' ;
			else if(c=='h')
				w='x' ;
			else if(c=='a')
				w='y' ;
			else if(c=='q')
				w='z' ;
			else
				w=c;
			bw.write(w);
		}
		bw.newLine();
	}
	br.close();
	bw.close();
}
}
