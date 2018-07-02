package methodEmbedding.Standing_Ovation.S.LYD372;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StandingOvation {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
//		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
//		PrintWriter pw = new PrintWriter("A-small-attempt1.out");
		
		int testcases = Integer.parseInt(br.readLine());
		for(int t=1;t<=testcases;++t) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int maxShyness = Integer.parseInt(st.nextToken());
			String shyness = st.nextToken();
			int requiredCount = 0;
			int cumulative = 0;
			for(int i=0,j=shyness.length();i<j;++i)
			{
				int currentCount = shyness.charAt(i)-'0';
				if(cumulative>=i)
				{
					cumulative += currentCount;
				}
				else
				{
					requiredCount = requiredCount + i-cumulative;
					cumulative = i + currentCount;
				}
			}
			
			pw.println("Case #"+t+": "+requiredCount);
		}
		
//		br.close();
		pw.flush();
		pw.close();
	}
}
