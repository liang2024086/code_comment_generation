package methodEmbedding.Speaking_in_Tongues.S.LYD381;

import java.util.Scanner;


public class Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int cases=Integer.parseInt(in.nextLine());
		
		for (int x=1;x<=cases;x++){
			String line="";
			String newline="";
			line=in.nextLine().toString();
			for (int y=0;y<line.length();y++){
				String s=line.substring(y, y+1);
			if (s.equals("a"))newline=newline+'y';
			else if (s.equals("b"))newline=newline+'h';
			else if (s.equals("c"))newline=newline+'e';
			else if (s.equals("d"))newline=newline+'s';
			else if (s.equals("e"))newline=newline+'o';
			else if (s.equals("f"))newline=newline+'c';
			else if (s.equals("g"))newline=newline+'v';
			else if (s.equals("h"))newline=newline+'x';
			else if (s.equals("i"))newline=newline+'d';
			else if (s.equals("j"))newline=newline+'u';
			else if (s.equals("k"))newline=newline+'i';
			else if (s.equals("l"))newline=newline+'g';
			else if (s.equals("m"))newline=newline+'l';
			else if (s.equals("n"))newline=newline+'b';
			else if (s.equals("o"))newline=newline+'k';
			else if (s.equals("p"))newline=newline+'r';
			else if (s.equals("q"))newline=newline+'z';
			else if (s.equals("r"))newline=newline+'t';
			else if (s.equals("s"))newline=newline+'n';
			else if (s.equals("t"))newline=newline+'w';
			else if (s.equals("u"))newline=newline+'j';
			else if (s.equals("v"))newline=newline+'p';
			else if (s.equals("w"))newline=newline+'f';
			else if (s.equals("x"))newline=newline+'m';
			else if (s.equals("y"))newline=newline+'a';
			else if (s.equals("z"))newline=newline+'q';
			else newline=newline+' ';
			}
			System.out.println("Case #"+x+": "+newline);
		}
		
	}

}
