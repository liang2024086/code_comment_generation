package methodEmbedding.Counting_Sheep.S.LYD947;

import java.util.Scanner;

class First
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		
		for(int test=1;test<=t;test++)
		{
			String  str = inp.next();
			int len = str.length();
			boolean arr[] = new boolean[10];
			if(str.equals("0"))
			{
				System.out.println("Case #" + test + ": INSOMNIA");
			}
			else
			{
				int num[] =  new int[len];
				for(int i=len-1,j=0;i>=0;i--,j++)
					num[j] = str.charAt(i) - '0';
				int mul = 1,carry=0,flag=0;
				
				while(true)
				{
					flag=0;
					for(int j=0;j<len;j++)
					{
						int result = num[j] * mul + carry;
						arr[result%10] = true;
						carry = result/10;
					}
					while(carry!=0)
					{
						arr[carry%10] = true;
						carry /= 10;
					}
					for(int i=0;i<10;i++)
					{
						if(!arr[i])
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						long ans = Integer.parseInt(str) * mul;
						System.out.println("Case #" + test + ": " + ans);
						break;
					}
					mul++;
				}
			}
		}
	}
	
}
