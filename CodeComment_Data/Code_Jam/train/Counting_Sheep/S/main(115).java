package methodEmbedding.Counting_Sheep.S.LYD1429;

import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for(int i = 1; i <= count; i++)
		{
			int n = sc.nextInt();

			if(n == 0)
			{
				System.out.println("Case #"+ i +": INSOMNIA");
			}
			else
			{
				ArrayList<Integer> list = new ArrayList<>();
				int num = 1;
				int reg = 0;
				while(list.size() < 10)
				{
					int temp =  n * num;
					reg = temp;
					while(temp != 0)
					{
						int tem = temp%10;
						if(list.indexOf(tem) == -1)
						{
							list.add(tem);
						}
						temp /= 10;
					}
					num++;
				}
				System.out.println("Case #"+ i +": " + reg);
			}
		}

	}
}
