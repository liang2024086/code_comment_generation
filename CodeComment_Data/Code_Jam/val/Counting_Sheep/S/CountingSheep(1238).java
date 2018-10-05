package methodEmbedding.Counting_Sheep.S.LYD1154;

import java.util.*;
import java.io.*;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new FileReader( "A-small-attempt0.in" ) );
		String s = br.readLine();
		int N = Integer.parseInt(s);
		for(int i=0;i<N;i++)
		{
			String num = br.readLine();
			int mul = Integer.parseInt(num);
			int initial = mul;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<=9;j++)
				a.add(j);
			if(mul==0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else
			{
			//int k=2;
			//System.out.print(a.size()+" ");
			do
			{
				//System.out.print(a.size()+" ");
				for(int z=0;z<num.length();z++)
				{
					String p = num.charAt(z)+"";
					//System.out.println(p+" "+z);
					int f = Integer.parseInt(p);
					if(a.contains(f))
						a.remove(a.indexOf(f));
				}
				mul+=initial;
				num = mul+"";
				//System.out.println("The number now is : "+num+" " );
			}while(a.size()!=0);
			int answer = mul - initial;
			System.out.println("Case #"+(i+1)+": "+answer);
			}
		}

	}

}
