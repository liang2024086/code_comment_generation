package methodEmbedding.Counting_Sheep.S.LYD27;

import java.io.*;
import java.util.*;

public class Google_countingsheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int l=0;
			String line="";
			int t = Integer.parseInt(br.readLine());
			int inp[] =new int[t];
			int res[] = new int[t];
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				inp[l] = Integer.parseInt(line);
				l++;
			}
//			
//			for(int i=0;i<t;i++)
//			{
//				System.out.println(inp[i]);
//			}
//			
			for(int i=0;i<t;i++)
			{
				hm.clear();
				int N=inp[i];
				int k=1;
				if(N==0)
				{
					System.out.println("case #"+(i+1)+": INSOMNIA");
					continue;
				}
				outer:
				while(true)
				{
					int temp=N*k;
					
					while(temp!=0)
					{
						int digit = temp%10;
						hm.put(digit,1);
						if(hm.size()==10)
						{
							res[i]=N*k;
							System.out.println("case #"+(i+1)+": "+N*k);
							//System.out.println(hm.toString());
							break outer;
						}
						temp=temp/10;
					}
						k++;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
