package methodEmbedding.Standing_Ovation.S.LYD1339;

import java.util.*;
import java.io.*;

public class a {

	public static void main(String[] args) {
		
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			in = new Scanner(new BufferedReader(new FileReader("D:\\A-small-attempt2.in")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("D:\\A-small.out")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			System.out.println("");
			
			int s_max = in.nextInt();
			String s_sh = in.next();
			int iOutCount = 0;
			int iCurrClaps = 0;
			char[] s_ch = s_sh.toCharArray();
			for (int j = 0; j < s_ch.length; j++) {
				
				System.out.println(" XX  j " + j + " Val " + s_ch[j] + " CurrClaps " +  iCurrClaps + " Current OutCount " + iOutCount);
				
				if (s_ch[j] == '0') {
					if (iCurrClaps <= j) {
						iOutCount++;
						iCurrClaps++;
						System.out.println(" INCR " + j + " CurrClaps " +  iCurrClaps + " OutCount " + iOutCount);
					}
				}
				else
				{
					iCurrClaps += (s_ch[j] - 48);
					// System.out.println( "Curr claps : " + iCurrClaps);
					
					System.out.println(" INFO " + j + " CurrClaps " +  iCurrClaps + " OutCount " + iOutCount);
				}
			}

			out.println("Case #" + (i + 1) + ": " + iOutCount);
		}
		
		out.flush();
		out.close();
	}

}
