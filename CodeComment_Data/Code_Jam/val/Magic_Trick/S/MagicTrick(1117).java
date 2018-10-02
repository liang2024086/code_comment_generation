package methodEmbedding.Magic_Trick.S.LYD1533;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {
	/**
	 * 
	 * @author Neill Giraldo
	 */
	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		int cases = Integer.parseInt(lectura.nextLine());
		int a1;
		String[] set1;
		String s;
		String[] set2;
		Set<String> s3;
		for(int h=1;h<=cases;h++)
		{
			a1 = Integer.parseInt(lectura.nextLine());
			set1 = new String[0];
			set2 = new String[0];
			for(int i=1;i<5;i++)
			{
				if(a1==i)
				{
					set1 = lectura.nextLine().split(" ");
				}else
				{
					lectura.nextLine();
				}
				
			}
			a1 = Integer.parseInt(lectura.nextLine());
			for(int i=1;i<5;i++)
			{
				if(a1==i)
				{
					set2 = lectura.nextLine().split(" ");
				}else
				{
					lectura.nextLine();
				}
						
			}
			s3 = new HashSet<>();
			s3.addAll(new HashSet<String>(Arrays.asList(set1)));
			s3.retainAll(new HashSet<String>(Arrays.asList(set2)));
			if( s3.isEmpty()) 
			{
				System.out.println("Case #"+h+": Volunteer cheated!");
			}else
			{
				if(s3.size()!=1)
				{
					System.out.println("Case #"+h+": Bad magician!");
				}else
				{
					s = s3.toString().replace("[", "");
					s = s.replace("]", "");
					System.out.println("Case #"+h+": "+s);
				}
			}
		}
	}
}
