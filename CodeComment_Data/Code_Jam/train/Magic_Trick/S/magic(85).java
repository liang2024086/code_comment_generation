package methodEmbedding.Magic_Trick.S.LYD244;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class magic {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),i,j,a,b,A[],count,k=0;
		String s1="",s="",str[];
		for(i=0;i<T;i++)
		{
			A=new int[16];count=0;
			a=Integer.parseInt(br.readLine());
			for(j=0;j<4;j++)
			{	s1=br.readLine();
				if(j==(a-1))
					s=s1;
			}

			str=s.split(" ");
			for(j=0;j<4;j++)
				A[Integer.parseInt(str[j])-1]++;
			
						
			a=Integer.parseInt(br.readLine());
			for(j=0;j<4;j++)
			{	s1=br.readLine();
				if(j==(a-1))
					s=s1;
			}

			str=s.split(" ");
			for(j=0;j<4;j++)
				A[Integer.parseInt(str[j])-1]++;
			
					
			for(j=0;j<16 && count<2;j++)
				if(A[j]==2)
				{	count++;
					k=j;
				}
			if(count==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(count==2)
				System.out.println("Case #"+(1+i)+": Bad magician!");
			else
				System.out.println("Case #"+(1+i)+": "+(k+1));
		}
	}

}
