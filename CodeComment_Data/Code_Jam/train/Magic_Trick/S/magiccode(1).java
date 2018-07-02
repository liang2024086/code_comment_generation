package methodEmbedding.Magic_Trick.S.LYD2219;

import java.io.*;
public class MagicTrick {

	
	public static void main(String[] args)throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(in.readLine());
		for(int i=1; i<=T;i++)
		{
			int ar[]=new int[17];
			int arsel[]=new int[4];
			int r1=Integer.parseInt(in.readLine());
			
			for(int j=1;j<=4;j++)//j indicates row
			{
				String [] in_ar=in.readLine().split(" ");
				if (j==r1)
				{
					for(int k=0;k<4;k++)//k is for the 4 nos in one row
					{
						
						{
							int temp=Integer.parseInt(in_ar[k]);
							arsel[k]=temp;
						}
							
						
					}
				}
				
				
			}
			int r2=Integer.parseInt(in.readLine());
			
			for(int j=1;j<=4;j++)
			{
				String [] in_ar=in.readLine().split(" ");
				for(int k=0;k<4;k++)
				{
					int temp=Integer.parseInt(in_ar[k]);
					ar[temp]=j;
				}
				
			}
			
			//to check;
			int cnt=0;
			int ans=0;
			for(int k=0;k<4;k++)
			{
		
				int no=arsel[k];
				if(ar[no]==r2)
				{
					cnt++;
					ans=no;
				}
					
			}
			
			if(cnt==0)
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			else if(cnt==1)
			{
				System.out.println("Case #"+i+": "+ans);
			}
			else
			{
				System.out.println("Case #"+i+": Bad magician!");
			}
			
			
			
			
			
		}
		
		
		in.close();
		out.close();
	}

}
