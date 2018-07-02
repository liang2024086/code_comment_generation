package methodEmbedding.Counting_Sheep.S.LYD1304;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJP1 {

	public static void main(String[] args) throws IOException {
		Scanner sc;
		try{
		sc = new Scanner(new FileReader("A-small-attempt0.in"));
		}
		catch(Exception e)
		{
			sc = new Scanner(System.in);
		}
		int T = sc.nextInt();
		PrintWriter out = new PrintWriter(new FileWriter("gcj.out"));
		for(int t=1; t<=T; t++)
		{
			int n = sc.nextInt();
			if(n == 0){
				out.printf("Case #%d: INSOMNIA\n",t);
				continue;
			}
			int cD = 0;
			boolean dig[] = new boolean[10];
			int i = 1;
			while(cD < 10)
			{
				long tmp = (long)n*i;
				while(tmp > 0)
				{
					int digit = (int)(tmp%10);
					if(!dig[digit]){
						dig[digit] = true;
						cD++;
					}
					tmp/=10;
				}
				i++;
			}
			out.printf("Case #%d: %d\n",t,(long)n*(i-1));
				
		}
		out.flush();
		out.close();

	}
	
}
