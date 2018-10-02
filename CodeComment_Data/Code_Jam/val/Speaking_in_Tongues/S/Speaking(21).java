package methodEmbedding.Speaking_in_Tongues.S.LYD228;

import java.util.*;

class Speaking
{
	public static void main(String[] args)
	{	
		String s;
		char[] result;
		int i;
		int t;
		int T;
		int dummy;
		char[] decode;
		decode = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		Scanner myInput = new Scanner(System.in);
		T = myInput.nextInt();
		myInput.nextLine();
		for (t=1; t<=T; t++)
		{
			s = myInput.nextLine();
			result=new char[s.length()];
			for (i=0; i<s.length(); i++)
				if (Character.isLetter(s.charAt(i)))
				{
					result[i] = decode[(int)s.charAt(i)-97];
				}
				else
					result[i]=s.charAt(i);
			System.out.printf("Case #%d: ",t);
			System.out.println(result);
		}
	}
}
