package methodEmbedding.Speaking_in_Tongues.S.LYD161;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases= Integer.parseInt(s.nextLine());
		for(int i=0; i<testCases; i++)
		{
			String code = s.nextLine();
			code = code.toLowerCase();
			String answer = "";
			for(int j=0; j<code.length(); j++)
			{
				String compare = code.substring(j,j+1);
				
				if(compare.equals("a"))
				{
					answer += "y";
				}
				else if(compare.equals("b"))
				{
					answer += "h";
				}
				else if(compare.equals("c"))
				{
					answer += "e";
				}
				else if(compare.equals("d"))
				{
					answer += "s";
				}
				else if(compare.equals("e"))
				{
					answer += "o";
				}
				else if(compare.equals("f"))
				{
					answer += "c";
				}
				else if(compare.equals("g"))
				{
					answer += "v";
				}
				else if(compare.equals("h"))
				{
					answer += "x";
				}
				else if(compare.equals("i"))
				{
					answer += "d";
				}
				else if(compare.equals("j"))
				{
					answer += "u";
				}
				else if(compare.equals("k"))
				{
					answer += "i";
				}
				else if(compare.equals("l"))
				{
					answer += "g";
				}
				else if(compare.equals("m"))
				{
					answer += "l";
				}else if(compare.equals("n"))
				{
					answer += "b";
				}
				else if(compare.equals("o"))
				{
					answer += "k";
				}
				else if(compare.equals("p"))
				{
					answer += "r";
				}
				else if(compare.equals("q"))
				{
					answer += "z";
				}
				else if(compare.equals("r"))
				{
					answer += "t";
				}
				else if(compare.equals("s"))
				{
					answer += "n";
				}
				else if(compare.equals("t"))
				{
					answer += "w";
				}
				else if(compare.equals("u"))
				{
					answer += "j";
				}
				else if(compare.equals("v"))
				{
					answer += "p";
				}
				else if(compare.equals("w"))
				{
					answer += "f";
				}
				else if(compare.equals("x"))
				{
					answer += "m";
				}
				else if(compare.equals("y"))
				{
					answer += "a";
				}
				else if(compare.equals("z"))
				{
					answer += "q";
				}
				else
				{
					answer += compare;
				}	
				
			}
			System.out.println("Case #" + (i+1) + ": " + answer);
		}
	}
}
