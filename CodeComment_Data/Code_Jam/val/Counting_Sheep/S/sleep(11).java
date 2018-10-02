package methodEmbedding.Counting_Sheep.S.LYD538;

import java.util.*;

class sleep
{
	public static void main(String... S)
	{
		Scanner sc = new Scanner(System.in);
		int noTest = sc.nextInt();
		for(int p=0;p<noTest;p++)
		{
			int in = sc.nextInt();
			if(in==0)
			{
				System.out.println("Case #"+(p+1)+": INSOMNIA");
				continue;
			}
			int cons = in;
			char temp[] = (in+"").toCharArray();
			Hashtable<Character,Character> hashtable = new Hashtable<Character,Character>(10);
			boolean loop = true;
			int k=1;
			while(loop)
			{

				for(int i=0;i<temp.length;i++)
				{
					if(hashtable.contains(temp[i]))
					{
						
					}
					else
					{
						hashtable.put(temp[i],temp[i]);
						if(hashtable.size()==10)
						{
							System.out.println("Case #"+(p+1)+": "+in);
							loop = false;
						}
					}
				}
				k++;
				in = cons*k;
				temp = (in+"").toCharArray();
			}
		}
	}
	

}
