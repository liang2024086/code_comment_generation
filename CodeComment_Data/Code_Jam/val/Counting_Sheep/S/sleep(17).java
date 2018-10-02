package methodEmbedding.Counting_Sheep.S.LYD1366;



import java.util.Scanner;

public class sleep 
{
	public static void main(String[] args) 
	{
		int t ;
		Scanner sn = new Scanner(System.in);
		t  = sn.nextInt();
		int t1= 1;
		while(t1<=t)
		{
			int count = 0;
			int[] num = new int[10];
			num[0] = -1;
			int n = sn.nextInt();
			int i = 1;
			int temp;
			while(count < 10 && i <100)
			{
				temp = i*n;
				while(temp != 0 )
				{
					int digit = temp%10;
					if(num[digit] != digit)
					{
						num[digit] = digit;
						count++;
					}
					temp = temp/10;
					
				}
				i++;
				
			}
			if(count ==10)
				System.out.println("Case #"+(t1)+": "+ n*(i-1));
			else
				System.out.println("Case #"+(t1)+": "+"INSOMNIA");
			t1++;
		}
	}
}
