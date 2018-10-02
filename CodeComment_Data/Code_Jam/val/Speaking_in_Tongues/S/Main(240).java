package methodEmbedding.Speaking_in_Tongues.S.LYD1688;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

class Main {
	

	public static void main(String[] args) throws IOException {
		char[] googlerese = new char[1000];
		googlerese['y']='a';
		googlerese['n']='b';
		googlerese['f']='c';
		googlerese['i']='d';
		googlerese['c']='e';
		googlerese['w']='f';
		googlerese['l']='g';
		googlerese['b']='h';
		googlerese['k']='i';
		googlerese['u']='j';
		googlerese['o']='k';
		googlerese['m']='l';
		googlerese['x']='m';
		googlerese['s']='n';
		googlerese['e']='o';
		googlerese['v']='p';
		googlerese['z']='q';
		googlerese['p']='r';
		googlerese['d']='s';
		googlerese['r']='t';
		googlerese['j']='u';
		googlerese['g']='v';
		googlerese['t']='w';
		googlerese['h']='x';
		googlerese['a']='y';
		googlerese['q']='z';
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(
				System.in));
		int n = parseInt(scan.readLine());
		for (int i = 0; i < n; i++) {
			char[] line = scan.readLine().toCharArray();
			for (int j = 0; j < line.length; j++) {
				if(line[j]!=' ')
				line[j] = googlerese[line[j]]; 
			}
			String res="";
			for(char a:line)
				res+=a;
			System.out.println("Case #"+(i+1)+": "+res);
		}
	}
}
