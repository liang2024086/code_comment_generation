package methodEmbedding.Counting_Sheep.S.LYD1217;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class GoogleJamCountingSheep {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("A-small-attempt5.in"));
		//Scanner sc = new Scanner(System.in);
		sc.nextLong();
		int cases =1;
		//System.out.print("Input       Output");
		//System.out.println();
		while(sc.hasNext())
		{
			
			long num = sc.nextLong();
			long input=num;
			long arr[] = new long[10];
			boolean flag=false;
			long answer=0;
			long count=1;
			while(num!=0 && flag==false)
			{
				num=input*count++;
				long temp=num;
				//System.out.println(num);
							//System.out.println(temp%10);

				while(temp!=0)
				{
					//System.out.println("temp: "+temp);
					//System.out.println(arr[temp%10]);
					long ind= temp%10;
					//System.out.println("Ind: "+ind);
					arr[(int)ind]=arr[(int)ind]+1;
					temp/=10;
				}
				answer=0;
				for(int i=0;i<arr.length;i++)
				{
					//System.out.print(arr[i]+" ");
					if(arr[i]>=1)
					{
						answer++;
					}
				}
				//System.out.println();
				if(answer==10)
				{
					flag=true;
				}
			}
			if(num==0)
			{
				System.out.println("Case #"+cases+": INSOMNIA");
				//System.out.println();
			}
			else
			{System.out.println("Case #"+cases+": "+num);
			//System.out.println();
			}
			cases++;
		}
		

	}
}
