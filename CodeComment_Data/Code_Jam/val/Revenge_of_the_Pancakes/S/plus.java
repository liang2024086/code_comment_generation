package methodEmbedding.Revenge_of_the_Pancakes.S.LYD572;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class plus {
	public static void main( String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\manas\\Downloads\\plus.in"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\manas\\Documents\\google code jams\\plus.txt"));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a=1;
		while(t>0)
		{
			String s=br.readLine();
			int count=0;
			char prev=s.charAt(0);
			
			for(int i=1;i<s.length();i++)
			{
				char curr=s.charAt(i);
				if(curr!=prev)
				{
					count++;
					prev=curr;
					
				}
			}
			if(s.charAt(s.length()-1)=='-')
				count++;
			
			
			
			
			bw.write("Case #"+a+": "+count);
			System.out.println("Case #"+a+": "+count);
			a++;
			
			bw.newLine();
			t--;
		}
		bw.close();
	}

}
