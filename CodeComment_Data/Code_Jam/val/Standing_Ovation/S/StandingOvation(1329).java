package methodEmbedding.Standing_Ovation.S.LYD2165;

/**
 * @file StandingOvation.java
 * @date 2015. 4. 11.
 * @author yyh
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("output.txt");
		
		int T = Integer.parseInt(br.readLine());
		int[] person = new int[1002];
		int testcase = 1;
		while(T-->0)	{
			String[] inputs = br.readLine().split(" ");
			int N = Integer.parseInt(inputs[0]);
			int invited = 0;
			int stand = 0;
			for(int i = 0; i <= N; ++i)	{
				if(i > stand)	{
					invited = invited + (i - stand);
					stand = i;
				}
				stand += (inputs[1].charAt(i) - '0');
			}
			
			fw.write("Case #" + testcase + ": ");
			fw.write(invited+'0');
			fw.write('\r');
			fw.write('\n');
			fw.flush();
			
			testcase++;
			
		}
		
		fw.close();
		br.close();
	}
}
