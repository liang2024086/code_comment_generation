package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1207;

import java.util.Scanner;
import java.io.*;

public class google_pancakes {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
		//int t = input.nextInt();
		
		//String[] s = new String[t];
		/*for(int i=0;i<t;i++)
		{
			s[i] = input.next();
		}*/
		
		try{
			
			BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			int l=0;
			String line="";
			int t = Integer.parseInt(br.readLine());
			String[] s = new String[t];
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				s[l] = line;
				l++;
			}
			
			for(int i=0;i<t;i++)
			{
				String str ="+"+ s[i]+"+";
				//System.out.println(str);
				int count=0;
				for(int k=1;k<str.length();k++)
				{
					if(str.charAt(k)=='+' && str.charAt(k-1)=='-')
					{
						count+=2;
					}
				}
				
				if(s[i].charAt(0)=='-')
				{
					count--;
				}
				
				System.out.println("Case #"+(i+1)+": "+count);
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
