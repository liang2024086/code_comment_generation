package methodEmbedding.Speaking_in_Tongues.S.LYD1085;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class A {
	static char[] cipher;
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new File("A.out"));
		cipher = new char[26];
		cipher[0]='y';
		cipher[1]='h';
		cipher[2]='e';
		cipher[3]='s';
		cipher[4]='o';
		
		cipher[5]='c';
		cipher[6]='v';
		cipher[7]='x';
		cipher[8]='d';
		cipher[9]='u';
		
		cipher[10]='i';
		cipher[11]='g';
		cipher[12]='l';
		cipher[13]='b';
		cipher[14]='k';
		
		cipher[15]='r';
		cipher[16]='z';
		cipher[17]='t';
		cipher[18]='n';
		cipher[19]='w';
		
		cipher[20]='j';
		cipher[21]='p';
		cipher[22]='f';
		cipher[23]='m';
		cipher[24]='a';
		
		cipher[25]='q';
		
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for(int caseOn = 1; caseOn <= cases; caseOn++) {
			char[] line = in.nextLine().toCharArray();
			for(int i = 0; i < line.length; i++) {
				if(line[i]!=' ') {
					line[i] = cipher[(int)(line[i]-'a')];
				}
			}
			out.printf("Case #%d: %s\n",caseOn,new String(line));
		}
		
		out.close();
	}
}
/*

4
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
zz

*/
