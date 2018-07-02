package methodEmbedding.Revenge_of_the_Pancakes.S.LYD612;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class revengeofpancake {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("input2.txt"));
		PrintWriter pw=new PrintWriter("output2.txt");
		//PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++)
		{
			int ans=0;
			char[] a=br.readLine().toCharArray();
			int l=a.length;
			//System.out.println(new String(a));
			for(int k=l-1;k>0;k--)
			{
				if(a[k]=='-')
				{
					if(a[0]=='+')
					{
						ans+=2;
						for(int f=0;f<k;f++)
						{
							if(a[f]=='-')
							{
								break;
							}
							else
							{
								a[f]='-';
							}
						}
					}
					else
					{
						ans+=1;
					}
					int l1=0;
					int r1=k;
					while(l1<=r1)
					{	
						
						if(l1!=r1)
						{
							if(a[l1]=='+')
							{
								a[l1]='-';
							}
							else
							{
								a[l1]='+';
							}
							if(a[r1]=='+')
							{
								a[r1]='-';
							}
							else
							{
								a[r1]='+';
							}
						}
						else
						{
							if(a[l1]=='-')
							{
								a[l1]='+';
							}
							else
							{
								a[l1]='-';
							}
						}
						char temp=a[l1];
						a[l1]=a[r1];
						a[r1]=temp;
						
						l1++;
						r1--;
					}
				}
			//	System.out.println(new String(a));
			}
			if(a[0]=='-')
			{
				ans++;
			}
			pw.println("Case #"+i+": "+ans);
			
		}
		pw.close();
		
	}

}
