package methodEmbedding.Speaking_in_Tongues.S.LYD737;

import java.util.Scanner;


public class TonguesDecoder {

	public static void main(String[] args) {
		String line;
		Scanner input = new Scanner(System.in);
		char[] mapping = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		
		int count = input.nextInt();
		input.nextLine();
		for (int k = 1; k <= count; k++)
		{
			line = input.nextLine();
			char[] cipher = line.toCharArray();
			char[] clear = new char[cipher.length];
			for (int h = 0; h < cipher.length; h++)
			{
				if (cipher[h] != ' ')
					clear[h] = mapping[cipher[h] - 'a'];
				else
					clear[h] = ' ';
			}
			
			System.out.print("Case #" + k + ": ");
			System.out.println(clear);
		}
	}

}
