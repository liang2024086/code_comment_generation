package methodEmbedding.Revenge_of_the_Pancakes.S.LYD174;



import java.util.Scanner;

public class pancakes 
{

	public static void main(String[] args) 
	{
		
		int t ;
		Scanner sn = new Scanner(System.in);
		t  = sn.nextInt();
		int t1= 1;
		while(t1<=t)
		{
			String input = sn.next();
			int length = input.length();
			int count = 0;
			boolean[] a = new boolean[length];
			for(int i = 0; i<length;i++)
			{
				if(input.charAt(i) == '+')
				{
					a[i] = true;
				}
				else
				{
					a[i] = false;
				}
			}
			
				for(int i = length-1; i>=0; i--)
				{
					if(!a[i])
					{
						for(int j =0; j<=i; j++)
						{
							a[j] = !a[j];	
						}
						count++;
					}
				}
				System.out.println("Case #"+(t1)+": "+ count);
				t1++;
		}
	}
}
