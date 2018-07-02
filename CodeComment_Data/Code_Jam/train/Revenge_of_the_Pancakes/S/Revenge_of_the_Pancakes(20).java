package methodEmbedding.Revenge_of_the_Pancakes.S.LYD119;


import java.util.Scanner;

public class Revenge_of_the_Pancakes
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data1 = s.nextLine();
			String data = data1.substring(0, 1);
			for (int i = 1; i < data1.length(); i++)
			{
				if (data1.charAt(i) != data1.charAt(i - 1))
				{
					data = data + data1.charAt(i);
				}
			}
			if (data.charAt(data.length() - 1) == '+')
				System.out.println("Case #"+(ii+1)+": "+(data.length() - 1));
			else
				System.out.println("Case #"+(ii+1)+": "+(data.length()));
		}

	}

}
