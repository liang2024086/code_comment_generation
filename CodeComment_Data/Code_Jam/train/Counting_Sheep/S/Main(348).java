package methodEmbedding.Counting_Sheep.S.LYD1573;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int T,temp,cnt,count10;
		int[] arr;
		int[] check = {0,0,0,0,0,0,0,0,0,0};
		
		
		
		T = input.nextInt();
		arr = new int[T];
		
		for(int i = 0; i < T; i++)
		{
			arr[i] = input.nextInt();
		}

		
		for(int i = 0 ; i < T ; i++)
		{
			
			if(arr[i]!= 0)
			{
				for(int j = 0 ; j < 10 ; j++)
				{
					check[j] = 0;
				}
				
				count10 = 0;
				for( cnt = 1;; cnt++ )
				{
					temp = cnt*arr[i];
					
					while(temp!=0)
					{
						if(check[temp%10]==0)
						{
							check[temp%10]++;
							count10++;
						}
						temp = temp/10;
					}	
					if(count10 == 10)
						break;
				}
				
				System.out.println("Case #"+(i+1)+": "+arr[i]*cnt);
			}
			else
				System.out.println("Case #"+(i+1)+": INSOMNIA");
		}
		
		input.close();
	}
}
