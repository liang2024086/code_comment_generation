package methodEmbedding.Counting_Sheep.S.LYD646;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by rvisweswaran on 4/8/16.
 */
public class CountingSheep {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		FileWriter fw = new FileWriter(new File("output.txt"));
		int T = sc.nextInt();
		for(int t=1; t<=T; t++)
		{
			int N = sc.nextInt();
			boolean[] seen = new boolean[10];
			int count = 0;
			int index = 1;

			if(N==0)
				fw.write("Case #"+t+": INSOMNIA\n");
			else
			{
				while (count<10)
				{
					int temp = index++ * N;
					while (temp>0)
					{
						int digit = temp%10;
						temp = temp/10;
						if( ! seen[digit])
						{
							seen[digit] = true;
							count++;
						}
					}
				}
				fw.write("Case #"+t+": "+(N*(index-1))+"\n");
			}
		}
		fw.flush();
		fw.close();
		sc.close();
	}

}
