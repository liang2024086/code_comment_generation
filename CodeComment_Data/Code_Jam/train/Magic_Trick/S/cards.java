package methodEmbedding.Magic_Trick.S.LYD2156;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class cards {

	
	public static void main(String args[])throws IOException
	{
		BufferedReader ds = new BufferedReader(new InputStreamReader(System.in)) ;
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int t = Integer.parseInt(ds.readLine()) ;
		StringTokenizer st ;
		int c = 1 ;
		while(t-->0)
		{	
			out.print("Case #"+c+": ");
			c++;
			
			int a1 = Integer.parseInt(ds.readLine()) ;
			
			int ar1 [] = new int[4];
			int ar2 [] = new int[4];
			
			for(int i = 1 ; i <= 4 ; i++ )
			{
				st = new StringTokenizer(ds.readLine()) ;
				
				if(i == a1)
				{
					for(int j = 0 ; j < 4 ; j++ )
					{
						ar1[j] = Integer.parseInt(st.nextToken()) ;
					}
					
				}
				
			}
			
			int a2 = Integer.parseInt(ds.readLine()) ;
			
			for(int i = 1 ; i <= 4 ; i++ )
			{
				st = new StringTokenizer(ds.readLine()) ;
				
				if(i == a2)
				{
					for(int j = 0 ; j < 4 ; j++ )
					{
						ar2[j] = Integer.parseInt(st.nextToken()) ;
					}
					
				}
				
			}
			int flag = 0 ; int ans = -1 ;
			a:for(int i = 0 ; i < 4 ; i++ )
			{
				for(int j = 0 ; j < 4 ; j++ )
				{
					if( ar1[i] == ar2[j])
						{
							flag++;
							ans = ar1[i];
							if(flag > 1)
								break a ;
							break;
						}
				}
			}
			
			if(flag == 0)
			{
				out.println("Volunteer cheated!");
			}
			else if( flag == 1 )
			{
				out.println(ans);
			}
			else
			{
				out.println("Bad magician!");
			}
			
		}
		out.close();
	}
	
}
