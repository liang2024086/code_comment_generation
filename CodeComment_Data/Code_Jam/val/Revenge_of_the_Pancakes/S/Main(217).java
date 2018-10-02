package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1095;


import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int T,cnt=0,s,e;
		String S;
		
		T =  input.nextInt();
		S = input.nextLine();
		
		for(int i = 0; i < T ; i++)
		{
			cnt = 0;			
			S = input.nextLine();
			while(S.contains("-"))
			{
				s= 0;
				e= 1;
				for(int j = 0 ; j < S.length()-1; j++)
				{
					if(!S.substring(s,e).equals(S.substring(s+1,e+1)))
						break;
					else
					{
						e++;
						s++;
					}
				}
				if(S.substring(0,1).equals("+"))
				{
					S = (((S.substring(0,e)).replace("+", "-")) + S.substring(e)); 
				}
				else if(S.substring(0,1).equals("-"))
				{
					S = (((S.substring(0,e)).replace("-", "+")) + S.substring(e)); 

				}
				cnt++;
			}
			System.out.println("Case #"+(i+1)+": "+cnt);
		}
	}
}
