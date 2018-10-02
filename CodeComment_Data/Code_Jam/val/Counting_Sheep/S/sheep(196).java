package methodEmbedding.Counting_Sheep.S.LYD1242;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class sheep {
	public static void main( String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\manas\\Downloads\\first.in"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\manas\\Documents\\google code jams\\sheep.txt"));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a=1;
		while(t>0)
		{
			int n=Integer.parseInt(br.readLine());
			if(n==0)
			{
				bw.write("Case #"+a+": INSOMNIA");
				System.out.println("Case #"+a+": INSOMNIA");
				a++;
				
				bw.newLine();
				t--;
				continue;
				
			}
			ArrayList<Integer> num=new ArrayList<Integer>();
			int factor=1;
			long last=0;
			while(num.size()!=10)
			{
				long mulnum=factor++*n;
				last=mulnum;
				while(mulnum>0)
				{
					int digit=(int) (mulnum%10);
					if(!num.contains(digit))
						num.add(digit);
					if(num.size()==10)
						break;
					mulnum=mulnum/10;
				}
			}
			
			bw.write("Case #"+a+": "+last);
			System.out.println("Case #"+a+": "+last);
			a++;
			
			bw.newLine();
			t--;
		}
		bw.close();
	}

}
