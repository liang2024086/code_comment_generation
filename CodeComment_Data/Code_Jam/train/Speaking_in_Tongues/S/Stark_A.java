package methodEmbedding.Speaking_in_Tongues.S.LYD1094;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Stark_A{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("A.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("A.out"));
		
		int total = sc.nextInt();
		
		sc.nextLine();
		for(int i=0; i<total; i++){
			
			pw.print("Case #" + (i + 1) + ": ");

			String s = sc.nextLine();
			int len = s.length();
			char[] sd = new char[len];
			
			for(int j=1; j<=len; j++){
				char c = s.charAt(j-1);
				char d;
				
				switch(c) {
				case 'a': d='y';
				break;
				case 'b': d='h';
				break;
				case 'c': d='e';
				break;
				case 'd': d='s';
				break;		
				case 'e': d='o';
				break;
				case 'f': d='c';
				break;
				case 'g': d='v';
				break;
				case 'h': d='x';
				break;		
				case 'i': d='d';
				break;
				case 'j': d='u';
				break;
				case 'k': d='i';
				break;
				case 'l': d='g';
				break;		
				case 'm': d='l';
				break;
				case 'n': d='b';
				break;
				case 'o': d='k';
				break;
				case 'p': d='r';
				break;		
				case 'q': d='z';
				break;
				case 'r': d='t';
				break;
				case 's': d='n';
				break;
				case 't': d='w';
				break;		
				case 'u': d='j';
				break;
				case 'v': d='p';
				break;
				case 'w': d='f';
				break;
				case 'x': d='m';
				break;		
				case 'y': d='a';
				break;
				case 'z': d='q';
				break;
				default: d=' ';
				break;
				}
				
				sd[j-1]=d;
				
			}
			
			String fin = new String(sd);
			pw.println(fin);
			
					
		}
		pw.flush();
		pw.close();
		sc.close();
	}
	
	

}
