package methodEmbedding.Speaking_in_Tongues.S.LYD334;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

//other imports

/**
 *Problem Name
 */

/**
 * @author Avengee
 */

public class Demo {

	public static void main(String[] args) throws IOException {
		//Reading and Writing Files
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		Scanner samp = new Scanner(new File("sample.txt"));
		FileWriter writer = new FileWriter("output.txt");
		PrintWriter pw = new PrintWriter(writer);

		//variable declaration
		int T;
		String G,E;
		char [] GL=new char[26];
		char [] EL=new char[26];
		
		//code
		T = scan.nextInt();
		scan.nextLine();
		//Filling Array
		for(int i=0;i<=25;i++)
			{
			EL[i]=(char)(97+i);
			}
		GL[0]='y';
		GL[14]='e';
		GL[25]='q';
		//Reading from sample
		for(int m=0;m<3;m++)
		{	
		char [] str1=samp.nextLine().toCharArray();
		char [] str2=samp.nextLine().toCharArray();
		for(int j=0;j<=(str1.length-1);j++)
			{
			int k=(int)(str1[j])-97;
			if(k!=(-65) && GL[k]=='\u0000')
				{GL[k]=str2[j];}
			}
		}
		for(int i=0;i<=25;i++)
		{
		if (GL[i]=='\u0000')GL[i]='z';
		}
		/*for(int i=0;i<=25;i++)
		{
			System.out.print(GL[i]+" ");
		}*/
		
		//Decoding to English
		for (int i = 1; i <= T; i++) 
		{
			char [] str=scan.nextLine().toCharArray();
			char [] deco=new char[str.length];
			int pos;
			for(int j=0;j<=(str.length-1);j++)
			{
				if(str[j]!=' ')
				{	
					for (int k = 0; k <26; k++) 
					{
						if (str[j]==GL[k]) 
						 {
						 pos=k;
						 deco[j]=EL[pos];
						 
						 break;
						  }
					}
				}
				else deco[j]=' ';
			}
			String y=new String(deco);
			System.out.println("Case #" + i + ": " + y);
			pw.println("Case #" + i + ": " + y);
		
		}
		scan.close();
		writer.close();
		
	}}



