package methodEmbedding.Revenge_of_the_Pancakes.S.LYD126;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlipDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String length=scan.nextLine().trim();
		int len=Integer.parseInt(length);
		List<List<Boolean>> list=new ArrayList<>();
		for(int i=0;i<len;i++)
		{
			//List<char> inputs=new ArrayList<char>(scan.nextLine().trim().toCharArray());
			List<Boolean> inputs=new ArrayList<>();
			//int j=scan.nextLine().trim().toCharArray().length;
			char[] ci=scan.nextLine().trim().toCharArray();
			for(int j=ci.length-1;j>=0;j--)
			{
				inputs.add((ci[j]=='+'));
				
			}
			
			list.add(inputs);
			
		}
		//List<Integer> minvals=new ArrayList<>();
		int i=1;
		for(List<Boolean> l:list)
		{
			int min;
			Boolean current=l.get(0);
			boolean prev;
			if(l.get(0))
			{
				min=0;
				
			}
			else
			{
				
				min=1;
			}
			for (int i1=1;i1<l.size();i1++)
			{
				if(current)
				{
					if(l.get(i1))
						min+=0;
					else
						min+=1;
				}
				else
				{
					if(l.get(i1))
						min+=1;
					else
						min+=0;
				}
				current=l.get(i1);
			}
			System.out.println("Case #"+i+": "+min);
			i++;
			
		}
		

	}

	
}
