package methodEmbedding.Magic_Trick.S.LYD913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Magician {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int t=Integer.parseInt(br.readLine());
			
			for(int i=0;i<t;i++)
			{
				int[][] first=new int[4][4];
				int[][] last=new int[4][4];
				int count=0;
				int ans=-2;
				int a=Integer.parseInt(br.readLine())-1;
				
				for(int j=0;j<4;j++)
				{
					String[] s=br.readLine().split("\\s");
					for(int k=0;k<4;k++)
					{
						first[j][k]=Integer.parseInt(s[k]);
					}
				}
				int b=Integer.parseInt(br.readLine())-1;
				
				for(int j=0;j<4;j++)
				{
					String[] sa=br.readLine().split("\\s");
					
					for(int k=0;k<4;k++)
					{
						last[j][k]=Integer.parseInt(sa[k]);
						//System.out.println(last[j][k]);
					}
				}
			
				for(int j=0;j<4;j++)
				{
					for(int k=0;k<4;k++)
					{
						if(first[a][j]==last[b][k])
						{ 
							
							count=count+1;
							if(count>1)
							{
								ans=-1;
								break;
							}
							else
								ans=j;
						}
					}
				}
				//System.out.println();
				int s=i+1;
				if(ans==-1)
					System.out.println("Case #"+s+": Bad magician!");
				else if(ans==-2)
					System.out.println("Case #"+s+": Volunteer cheated!");
				else
					System.out.println("Case #"+s+": "+first[a][ans]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
