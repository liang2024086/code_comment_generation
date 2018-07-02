package methodEmbedding.Speaking_in_Tongues.S.LYD1061;

import java.util.Scanner;


public class problemA {
	public static void main(String[]args){
		String f = "yhesocvxduiglbkrztnwjpfmaq";
		Scanner cin = new Scanner(System.in);
		String s;
		int t = cin.nextInt();
		cin.nextLine();
		int k = 0,i;
		char ch;
		while(t>0)
		{
			t--;
			k++;
			s = cin.nextLine();
			System.out.print("Case #"+k+": ");
			for(i = 0 ; i < s.length();i++)
			{
				ch = s.charAt(i);
				if(Character.isLetter(ch))
				{
					ch = f.charAt(ch-'a');
				}
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
