package methodEmbedding.Speaking_in_Tongues.S.LYD905;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tounge {

public static void main(String args[]) throws FileNotFoundException{
		
		Scanner in=new Scanner(new FileInputStream("input1.txt"));
		
		char []Array=new char[26];
		
		Array[0]='y';
		Array[1]='h';
		Array[2]='e';
		Array[3]='s';
		Array[4]='o';
		Array[5]='c';
		Array[6]='v';
		Array[7]='x';
		Array[8]='d';
		Array[9]='u';
		Array[10]='i';
		Array[11]='g';
		Array[12]='l';
		Array[13]='b';
		Array[14]='k';
		Array[15]='r';
		Array[16]='z';
		Array[17]='t';
		Array[18]='n';
		Array[19]='w';
		Array[20]='j';
		Array[21]='p';
		Array[22]='f';
		Array[23]='m';
		Array[24]='a';
		Array[25]='q';
		
		int T=in.nextInt();
		
		char c;
		
		String S=in.nextLine();
		
		for(int i=1;i<=T;i++)
		{
			S=in.nextLine();
			
			System.out.print("Case #" + i + ": " );
			
			for(int j=0;j<S.length();j++)
			{
				c=S.charAt(j);
				
				if(c==' ')
					System.out.print(c);
				else
					System.out.print(Array[c-'a']);
					
			}
			
			System.out.println();
		}
		
		
		
		
		
	}
}
