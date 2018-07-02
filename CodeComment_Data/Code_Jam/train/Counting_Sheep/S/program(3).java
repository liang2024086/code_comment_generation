package methodEmbedding.Counting_Sheep.S.LYD313;

import java.util.Scanner;


public class Template {
	static int[] hash;
	static int count=0;
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int t =input.nextInt();
		for(int tc=0;tc<t;++tc)
		{
			hash =new int[10];
			count=0;
			int num =input.nextInt();
			if(num==0)
			{
				System.out.println("Case #"+(tc+1)+": INSOMNIA");
			}
			else
			{
				boolean flag=true;
				for(int i=1;;++i)
				{
					long no =num*i;
					long temp=no;
					while(temp>0)
					{
						int r =(int) (temp%10);
						if(hash[r]==0)
						{
							hash[r]++;
							count++;
							if(count==10)
							{
								System.out.println("Case #"+(tc+1)+": "+no);
								flag=false;
								break;
							}
						}
						temp/=10;
						
					}
					if(flag==false)
						break;
				}
			}
		}
		
	}

}
