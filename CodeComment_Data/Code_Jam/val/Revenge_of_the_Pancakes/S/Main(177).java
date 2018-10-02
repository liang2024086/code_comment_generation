package methodEmbedding.Revenge_of_the_Pancakes.S.LYD919;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for(int c = 1; c <= count; c++)
		{
			String str = scanner.next();
			char[] charArray = str.toCharArray();
			
			char lastSide;
			lastSide = charArray[0];
			int result = 0;
			for(int i = 1; i < charArray.length; i++)
			{
				if(lastSide != charArray[i])
				{
					result ++;
				}
				lastSide = charArray[i];
			}
			
			if(lastSide == '-')
			{
				result ++;
			}
			System.out.println("Case #"+c+": "+ result);
		}

	}

}
