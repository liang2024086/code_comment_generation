package methodEmbedding.Speaking_in_Tongues.S.LYD1587;

import java.io.*;

public class Tongues {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int test,i,j,temp;
		String msg;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		test=Integer.parseInt(br.readLine());
		char a[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		for(i=0;i<test;i++)
		{
			msg=br.readLine();
			System.out.print("Case #"+(i+1)+": ");
			for(j=0;j<msg.length();j++)
			{
				temp=(int)msg.charAt(j)-'a';
				if(temp>=0 && temp<=25) System.out.print(a[temp]);
				else if(msg.charAt(j)==' ') System.out.print(msg.charAt(j));
			}
			System.out.println();
			
		}
	

	}

}
