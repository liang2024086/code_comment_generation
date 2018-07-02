package methodEmbedding.Speaking_in_Tongues.S.LYD866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Speak {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Number of test cases:");
		int num=1;
		
		try {
			num=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		int t=0;
		String s[] = new String[num];
		String newS[]=new String[num];
		while(t<num)
		{
			newS[t]=" ";
		//System.out.println("Enter String");
		
		try {
			s[t]=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<s[t].length();i++)
		{
			
			
			if(s[t].charAt(i)!=' ')
			{
				if(s[t].charAt(i)=='a')
				{
					//s[t].replace(s[t].charAt(i), 'y');
					newS[t]+='y';
				}
				else if(s[t].charAt(i)=='b')
				{
					//s[t].replace(s[t].charAt(i), 'h');
					newS[t]+='h';
				}
				else if(s[t].charAt(i)=='c')
				{
					//s[t].replace(s[t].charAt(i), 'e');
					newS[t]+='e';
				}
				else if(s[t].charAt(i)=='d')
				{
					//s[t].replace(s[t].charAt(i), 's');
					newS[t]+='s';
				}
				else if(s[t].charAt(i)=='e')
				{
					//s[t].replace(s[t].charAt(i), 'o');
					newS[t]+='o';
				}
				
				else if(s[t].charAt(i)=='f')
				{
					//s[t].replace(s[t].charAt(i), 'c');
					newS[t]+='c';
				}
				else if(s[t].charAt(i)=='g')
				{
					//s[t].replace(s[t].charAt(i), 'v');
					newS[t]+='v';
				}
				else if(s[t].charAt(i)=='h')
				{
					//s[t].replace(s[t].charAt(i), 'x');
					newS[t]+='x';
				}
				else if(s[t].charAt(i)=='i')
				{
					//s[t].replace(s[t].charAt(i), 'd');
					newS[t]+='d';
				}
				else if(s[t].charAt(i)=='j')
				{
					//s[t].replace(s[t].charAt(i), 'u');
					newS[t]+='u';
				}
				
				else if(s[t].charAt(i)=='k')
				{
					//s[t].replace(s[t].charAt(i), 'i');
					newS[t]+='i';
				}
				else if(s[t].charAt(i)=='l')
				{
					//s[t].replace(s[t].charAt(i), 'g');
					newS[t]+='g';
				}
				else if(s[t].charAt(i)=='m')
				{
					//s[t].replace(s[t].charAt(i), 'l');
					newS[t]+='l';
				}
				else if(s[t].charAt(i)=='n')
				{
					//s[t].replace(s[t].charAt(i), 'b');
					newS[t]+='b';
				}
				else if(s[t].charAt(i)=='o')
				{
					//s[t].replace(s[t].charAt(i), 'k');
					newS[t]+='k';
				}
				
				else if(s[t].charAt(i)=='p')
				{
					//s[t].replace(s[t].charAt(i), 'r');
					newS[t]+='r';
				}
				else if(s[t].charAt(i)=='q')
				{
					//s[t].replace(s[t].charAt(i), 'z');
					newS[t]+='z';
				}
				else if(s[t].charAt(i)=='r')
				{
					//s[t].replace(s[t].charAt(i), 't');
					newS[t]+='t';
				}
				else if(s[t].charAt(i)=='s')
				{
					//s[t].replace(s[t].charAt(i), 'n');
					newS[t]+='n';
				}
				else if(s[t].charAt(i)=='t')
				{
					//s[t].replace(s[t].charAt(i), 'w');
					newS[t]+='w';
				}
				
				else if(s[t].charAt(i)=='u')
				{
					//s[t].replace(s[t].charAt(i), 'j');
					newS[t]+='j';
				}
				else if(s[t].charAt(i)=='v')
				{
					//s[t].replace(s[t].charAt(i), 'p');
					newS[t]+='p';
				}
				else if(s[t].charAt(i)=='w')
				{
					//s[t].replace(s[t].charAt(i), 'f');
					newS[t]+='f';
				}
				else if(s[t].charAt(i)=='x')
				{
					//s[t].replace(s[t].charAt(i), 'm');
					newS[t]+='m';
				}
				else if(s[t].charAt(i)=='y')
				{
					//s[t].replace(s[t].charAt(i), 'a');
					newS[t]+='a';
				}
				
				else if(s[t].charAt(i)=='z')
				{
					//s[t].replace(s[t].charAt(i), 'q');
					newS[t]+='q';
				}
			}
			else
			{
				newS[t]+=' ';
			}
		}
		t++;
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("Case #"+(i+1)+":"+newS[i]);
		}
		}

}
