package methodEmbedding.Counting_Sheep.S.LYD914;

import java.io.*;
import java.util.*;

class Sleep{
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		int Test =Integer.parseInt(in.readLine());
		for(int i=0;i<Test;i++)
		{
			int v=Integer.parseInt(in.readLine());
			System.out.print("Case #"+(i+1)+": ");
			Set<Integer> S=new HashSet<Integer>();
			HashMap<Integer,String> hmap=new HashMap<Integer,String>();
			hmap.put(v,null);
			char[] a=String.valueOf(v).toCharArray();
			for(int j=0;j<a.length;j++)
			{
				S.add((int)a[j]-'0');
			}
			boolean Not=true;
			if(S.size()==10)
			{
				System.out.println(v);
				Not=false;
			}
			int t=0;
			for(int j=2;Not;j++)
			{
				t=j*v;
				if(hmap.containsKey(t))
				{
					System.out.println("INSOMNIA");
					Not=false;
				}
				else
				{
					hmap.put(t,null);
					a=String.valueOf(t).toCharArray();
					for(int k=0;k<a.length;k++)
					{
						S.add((int)a[k]-'0');
					}
				if(S.size()==10){System.out.println(t);
					Not=false;
					}
				}
			}
		}
	}
}
					
				
				
