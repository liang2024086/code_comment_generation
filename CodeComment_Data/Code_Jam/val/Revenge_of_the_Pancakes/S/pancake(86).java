package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1129;


import java.util.Scanner;

public class pancake {
	public static void main(String[] args) {
		int T;
		String s;
        Scanner sc = new Scanner(System.in);
		
		T=sc.nextInt();
		//System.out.println("T = "+T);
		String[] tab= new String [T];
		for(int i=0; i< T; i++)
		{
			//System.out.println("enter value");
			tab[i]= sc.next();
			//System.out.println("tab["+i+"]="+tab[i]);
			
		}
		//System.out.println("t egal "+T);
		
		for(int i=0; i< T; i++)
		{
			
			//System.out.println(tab[i]);
			int index=0;
			s=tab[i];
			int max =s.length()-1;
			//System.out.println(s.length()-1);
			if(s.length()>1){
			for (int j=0;j<max;j++)
			{
				if(s.charAt(j)!= s.charAt(j+1))
				{
					index++;
				}
			}
			}
			if(s.charAt(max)=='+')
			{
				System.out.println("Case #"+(i+1)+": "+index);
			}
			else if(s.charAt(max)=='-')
			{
				index +=1;
				System.out.println("Case #"+(i+1)+": "+index);
			}
		}
}}
