package methodEmbedding.Speaking_in_Tongues.S.LYD867;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] Args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-small.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		
		int caseCnt = sc.nextInt();sc.nextLine();
		for (int caseNum=1; caseNum <= caseCnt; caseNum++) {
			System.out.println(caseNum);
			char[] map = new char[26];
			map[0]='y';
			map[1]='h';
			map[2]='e';
			map[3]='s';
			map[4]='o';
			map[5]='c';
			map[6]='v';
			map[7]='x';
			map[8]='d';
			map[9]='u';
			map[10]='i';
			map[11]='g';
			map[12]='l';
			map[13]='b';
			map[14]='k';
			map[15]='r';
			map[16]='z';
			map[17]='t';
			map[18]='n';
			map[19]='w';
			map[20]='j';
			map[21]='p';
			map[22]='f';
			map[23]='m';
			map[24]='a';
			map[25]='q';
			
			String input=sc.nextLine();
			System.out.println(input);
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<input.length();i++) {
				char c = input.charAt(i);
				if((int) c- (int) 'a'<0)
					sb.append(' ');
				else
					sb.append(map[(int) c - (int) 'a']);
			}
			System.out.println(sb.toString());
			
			pw.println("Case #" + caseNum + ": " + sb.toString());
		}
		
		pw.flush();
		pw.close();
		sc.close();
	}
}
