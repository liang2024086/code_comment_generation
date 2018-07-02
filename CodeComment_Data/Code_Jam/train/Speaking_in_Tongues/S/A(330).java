package methodEmbedding.Speaking_in_Tongues.S.LYD436;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws IOException 
	{
		long startTime = System.currentTimeMillis();
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
		
		int T = Integer.parseInt(f.readLine());
		
		char[] map = new char[26];
		map[0] = 'y'; map[1] = 'h'; map[2] = 'e'; map[3] = 's'; map[4] = 'o';
		map[5] = 'c'; map[6] = 'v'; map[7] = 'x'; map[8] = 'd';	map[9] = 'u';
		map[10] = 'i'; map[11] = 'g'; map[12] = 'l'; map[13] = 'b'; map[14] = 'k';
		map[15] = 'r'; map[16] = 'z'; map[17] = 't'; map[18] = 'n'; map[19] = 'w';
		map[20] = 'j'; map[21] = 'p'; map[22] = 'f'; map[23] = 'm'; map[24] = 'a';
		map[25] = 'q';
		
		for(int t = 1; t <= T; t++)
		{
			String googlerese = f.readLine();
			String eng = "";
			for(int i = 0; i < googlerese.length(); i++)
			{
				if (googlerese.charAt(i) == ' ') eng += ' ';
				else eng += map[googlerese.charAt(i) - 'a'];
			}
			
			out.println("Case #" + t + ": " + eng);
			System.out.println("Case #" + t + ": " + eng);
		}
		out.close();
	}
	
}
