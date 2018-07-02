package methodEmbedding.Revenge_of_the_Pancakes.S.LYD66;

import java.io.*;
import java.util.*;

class cakes{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int Test=Integer.parseInt(in.readLine());
		for(int i=0;i<Test;i++){
			String sta=in.readLine();
			System.out.print("Case #"+(i+1)+": ");
			boolean or=true;
			char[] p=sta.toCharArray();
			int no=0;
			boolean t=true;
			
			
			for(int j=0;j<p.length && or && t;j++)
			{
				if(p[j]=='+')
				{
					int tp=j+1;
					while(tp<p.length && p[tp]=='+'){
						p[tp]='-';
						tp++;
			        }
				if(tp==p.length)
				{
					no+=1;
					if(j==0)
					{
						t=false;
					}
					else
					{
					    or=false;
					}
					break;
				}
				else
				{
				if(j==0)
			    {  
			    	no+=1;

			    }
				else
				{
			     	j=tp-1;
				    no+=2;}
				}
			}
		}
				if(or && t){
				System.out.println((no+1));}
				else{
					if(!(t)){System.out.println(0);}
					
				else{
					System.out.println(no);
					}
	}

}
}
}
