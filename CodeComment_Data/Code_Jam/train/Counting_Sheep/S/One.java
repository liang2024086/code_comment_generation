package methodEmbedding.Counting_Sheep.S.LYD495;


import java.util.Scanner;

public class One {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int l = 0;l<T;l++)
		{
			
			Integer N =sc.nextInt();
			String s  = new String();
			s = N.toString();
			int[] a = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
			int k =	2;
			Integer t1 =0;
			int ne  =0;
			if(N != 0)
			{
				for(int j =0;j<s.length();j++)
				{
					ne  = Character.getNumericValue(s.charAt(j));
					a[ne] = ne;
				}
						
				for(int i = 0;i<a.length;i++)
				{
					if(a[i] == 32)
					{
						t1 = N*k;
						s = t1.toString();
						k++;
						for(int j =0;j<s.length();j++)
						{
							ne  = Character.getNumericValue(s.charAt(j));
							a[ne] = ne;
						}
						--i;
					}
				}
				System.out.println("Case #"+(l+1)+":"+" " +t1);
			}
			else
			{
				System.out.println("Case #"+(l+1)+":"+" " + "INSOMNIA");	
			}
				
		}
		
		


	}

}
