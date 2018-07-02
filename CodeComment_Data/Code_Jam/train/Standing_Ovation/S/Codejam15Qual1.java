package methodEmbedding.Standing_Ovation.S.LYD1137;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class Codejam15Qual1 {
	public static void main(String[] args)  throws IOException{
		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
		//StringTokenizer st = new StringTokenizer(sc.nextLine());
		int cases = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=cases; i++)
		{
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int Smax = Integer.parseInt(st.nextToken());
			//int str = Integer.parseInt(st.nextToken());
			String temp = st.nextToken();
			int countclap =0;
			int countadded =0;
			for(int j=0;j<temp.length();j++)
			{
				int Al = Integer.parseInt(temp.substring(j,j+1));
					if(countclap>=j)
					{
						countclap+=Al;
					}
					else
					{
						countadded = countadded + j-countclap;
						countclap = j+Al;
				}
			}
			//PrintWriter out = new PrintWriter("b-small.out")
			System.out.println("Case #"+i+": "+countadded);
		}
	}
}
