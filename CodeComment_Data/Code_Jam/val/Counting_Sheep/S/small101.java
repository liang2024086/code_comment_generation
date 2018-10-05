package methodEmbedding.Counting_Sheep.S.LYD1440;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class small101 {
	public static void main(String[] args){
		Scanner in;
		int j=0;
		in = new Scanner(System.in);
		int T = in.nextInt();
		while(j<T)
		{
			int N = in.nextInt();
			int i=0;
			j++;
			if (N==0)
			{
				System.out.format("Case #%d: INSOMNIA\n", j);	
			}
			else 
			{
				boolean[] numbers = new boolean[10];
				int alldigits=0;
				while (alldigits<10) {
					i++;
					int num=i*N;
					List<Integer> digits = new LinkedList<Integer>();
					while (num>0) {
						if (numbers[num%10]==false)
						{
							alldigits++;
							numbers[num%10]=true;
						};
						num=num/10;
					}
				}
				System.out.format("Case #%d: %d\n", j, i*N);
			}
		}
	}
}
