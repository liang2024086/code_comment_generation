package methodEmbedding.Counting_Sheep.S.LYD634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		double n,n2;
		int[] arr;
		for(int i=0;i<test;i++)
		{
			int k=1;
			arr = new int[10];
			n = Double.parseDouble(br.readLine());
			if(n == 0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			boolean flag = true; 
			for(k=1;flag;k++)
			{
				n2 = k*n;
				while(Math.floor(n2)>0)
				{
					arr[(int)(n2%10)] = 1;
					n2 /= 10;
				}
				flag = false;
				for(int j=0;j<10;j++)
					if(arr[j]==0)
						flag = true;
				if(!flag) break;
			}
			
			System.out.println("Case #"+(i+1)+": "+(int)(k*n));
		}
	}
}
