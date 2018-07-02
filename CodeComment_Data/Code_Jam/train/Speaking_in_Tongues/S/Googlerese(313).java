package methodEmbedding.Speaking_in_Tongues.S.LYD1442;


import java.util.Scanner;

public class Googlerese {
	
	public static void main(String[] args)
	{
		String english = "abcdefghijklmnopqrstuvwxyz";
		String translate = "ynficwlbkuomxsevzpdrjgthaq";
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<num; i++)
		{
			System.out.print("Case #" + (i+1) + ": ");
			String input = scan.nextLine();
			for(int j=0; j<input.length(); j++)
			{
				if(input.charAt(j) == ' ')
					System.out.print(" ");
				else
					System.out.print(english.charAt(translate.indexOf(input.charAt(j))));
			}
			System.out.println();
		}
		
	}

}
