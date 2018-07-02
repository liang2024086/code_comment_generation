package methodEmbedding.Standing_Ovation.S.LYD1233;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		
		for(int i = 0 ; i < cases;i++)
		{
			int maxS = kb.nextInt();
			String shyness = kb.next();
			int shy[] = new int[maxS+1];
			for(int j = 0 ; j < maxS+1 ; j++)
			{
				shy[j] = Integer.parseInt(""+shyness.charAt(j));
			}
			
			int clapping = 0 ;
			int peopleAdd = 0 ;
			for(int j = 0 ; j <= maxS; j++)
			{
				if(clapping>=j)
				{
					clapping += shy[j];
				}
				else
				{
					peopleAdd += j - clapping;
					clapping += j - clapping; 
					j--;
					continue;
				}
			}
			System.out.println("Case #"+(i+1)+": "+peopleAdd );
		}
	}
}
