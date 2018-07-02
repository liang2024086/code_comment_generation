package methodEmbedding.Speaking_in_Tongues.S.LYD1595;

import java.util.*;

class Main
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		
		char[] filter = new char[26];
		filter[0] = 'y';
		filter[1] = 'h';
		filter[2] = 'e';
		filter[3] = 's';
		filter[4] = 'o';
		filter[5] = 'c';
		filter[6] = 'v';
		filter[7] = 'x';
		filter[8] = 'd';
		filter[9] = 'u';
		filter[10] = 'i';
		filter[11] = 'g';
		filter[12] = 'l';
		filter[13] = 'b';
		filter[14] = 'k';
		filter[15] = 'r';
		filter[16] = 'z';
		filter[17] = 't';
		filter[18] = 'n';
		filter[19] = 'w';
		filter[20] = 'j';
		filter[21] = 'p';
		filter[22] = 'f';
		filter[23] = 'm';
		filter[24] = 'a';
		filter[25] = 'q';
		
		int trials = Integer.parseInt(in.nextLine());
		int tt = 0;
		while(tt < trials)
		{
			String line = in.nextLine();
			StringBuilder ret = new StringBuilder();
			for(int i=0; i<line.length(); ++i)
			{
				if(line.charAt(i) == ' ')
				{
					ret.append(' ');
				} else {
					ret.append(filter[(int)line.charAt(i) - (int)'a']);
				}
			}
			System.out.println("Case #" + ++tt + ": " + ret.toString());
		}
		
	}
}
