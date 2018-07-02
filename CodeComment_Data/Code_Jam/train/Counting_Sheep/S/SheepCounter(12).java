package methodEmbedding.Counting_Sheep.S.LYD1458;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class SheepCounter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("A-small-attempt0.out");
		String line = br.readLine();
		int n =  Integer.parseInt(line);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			int input =  Integer.parseInt(br.readLine());
			arrayList.clear();
			int j = 1;
			int temp;
			if(input == 0)
			{
//				System.out.println("Case #"+i+": INSOMNIA");
				pw.println("Case #"+i+": INSOMNIA");
			}
			else
			while(true)
			{
				int temp2, output;
				output = temp = input * j;
				
				while(temp!=0)
				{
					temp2= temp%10;
					temp=temp/10;
					if(arrayList.contains(temp2))
					{
						
					}
					else
						arrayList.add(temp2);
				}
				if(arrayList.size()>=10)
					{
//						System.out.println("Case #"+i+": "+output);
						pw.println("Case #"+i+": "+output);
						break;
					}
				j++;
			}
		}
		
		pw.close();
		br.close();
	}

}
