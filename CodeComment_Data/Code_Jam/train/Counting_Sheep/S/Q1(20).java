package methodEmbedding.Counting_Sheep.S.LYD1367;

import java.util.*;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		int n=sc.nextInt();
  
		while(n>0)
		{
			int casen=1;  
			while(sc.hasNextInt())
			{
				boolean[] t=new boolean[10];
				Arrays.fill(t,false);
				int m=sc.nextInt();
				if(m==0)
				{
					System.out.println("Case #"+casen+": INSOMNIA");
					casen++;
					continue;
				}
    
				for(int i=1;;i++)
				{
					int truetimes=0;
					int temp=m*i;
					String s=Integer.toString(temp);
					for(int j=0;j<s.length();j++)
					{
						for(int k=0;k<10;k++)
						{
							if(s.charAt(j)==k+48)
							{
								t[k]=true;
								break;
							}
						}
					}
					for(int p=0;p<10;p++)
						if(t[p]==true)
							truetimes++;
					if(truetimes==10)
					{
						System.out.println("Case #"+casen+": "+temp);
						break;
					}
					else
					{
						truetimes=0;
					}   
				}
				casen++;   
				n--;
			} 
		}	
	}
}
