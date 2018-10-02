package methodEmbedding.Counting_Sheep.S.LYD518;

import java.util.Arrays;
import java.util.Scanner;



public class CountingSheep {
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int T = Integer.parseInt(sc.nextLine());
			int testcase = 1;
			while(T-- > 0)
			{
				long N = Integer.parseInt(sc.nextLine());
				boolean numbers[] = new boolean[10];
				Arrays.fill(numbers,false);
				boolean flag;
				boolean zeroflag = false;
				int factor = 1;
				long num,temp;
				do
				{
					num = N * factor;
					temp = num;
					if(num == 0)
					{
						zeroflag = true;
						break;
					}
					while(num != 0)
					{
						int r = (int)num % 10;
						numbers[r] = true;
						num = num / 10;					
					}
					flag = true;
					for(int i=0; i<10 ; i++)
					{
						if(!numbers[i])
						{
							flag = false;
						}
					}
					factor++;
				}while(!flag);
				if(zeroflag)
				{
					System.out.println("Case #" + testcase + ": INSOMNIA");
				}
				else
					System.out.println("Case #" + testcase + ": "+temp);
				testcase++;
			}
			
		}
}
