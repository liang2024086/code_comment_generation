package methodEmbedding.Standing_Ovation.S.LYD1744;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\narasimha\\Downloads\\A-small-attempt01.in");
		File out=new File("C:\\Users\\narasimha\\Desktop\\result.txt");
		Scanner scanner=new Scanner(new FileInputStream(file));
	//	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out)));
		
		PrintWriter writer=new PrintWriter(out);
		int T=scanner.nextInt();
		
		for(int j=1;j<T+1;j++)
		{
			int n=scanner.nextInt();
			String input =scanner.next();
			int i=0;
			int count=0;
			int friendsRequired=0;
			for(int v:input.toCharArray())
			{
				v=v-48;				
				if(count<i && v!=0)
				{
					friendsRequired+=i-count;
					count+=friendsRequired;
					
				}
				count+=v;
				i++;
//				System.out.print(" "+friendsRequired);
			}
//			System.out.println();
			writer.format("Case #%d: %d\n",j,friendsRequired);
			String result="Case #"+j+": "+friendsRequired+"\n\n\n\n";
			System.out.print(result);
		
		}
		writer.flush();
		writer.close();
		scanner.close();
	}

}

/*

4
4 11111
1 09
5 110011
0 1

1
10 0000000009







*/
