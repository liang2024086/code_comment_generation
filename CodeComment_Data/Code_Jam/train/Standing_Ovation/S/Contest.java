package methodEmbedding.Standing_Ovation.S.LYD2149;

import java.io.*;
import java.util.*;
public class Contest {

	/**
	 * @author Thamizhkavingan;
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner rer = new Scanner(new File("ss.in"));
		Formatter sof = new Formatter("ss.out");
	//	Scanner rer = new Scanner(System.in);
		int tc, maS, totS = 0, ans = 0;
		String shySt;
		int[] shyS;
		tc = rer.nextInt();
		for(int i = 0; i < tc; i++)
		{
			totS = 0;
			ans = 0;
			maS = rer.nextInt();
			if(maS == 0)
			{
				System.out.printf("Case #%d: %d\n", i+1, ans);
				sof.format("Case #%d: %d\n", i+1, ans);
				rer.nextLine();
			}
			else
			{
				shySt = rer.nextLine().replaceAll(" ", "");
				shyS = new int[maS];
				for(int la = 0; la<maS; la++)
				{
					shyS[la] = Integer.parseInt(shySt.substring(la, la+1));
					totS += shyS[la];
					if(totS < la+1)
					{
						ans++;
						totS++;
					}
				}
				System.out.printf("Case #%d: %d\n", i+1, ans);
				sof.format("Case #%d: %d\n", i+1, ans);
			}
		}
		sof.close();
		rer.close();

	}

}
