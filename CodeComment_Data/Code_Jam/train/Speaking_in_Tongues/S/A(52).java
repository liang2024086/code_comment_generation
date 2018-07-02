package methodEmbedding.Speaking_in_Tongues.S.LYD1320;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); in.nextLine();
		
		String mapping = "yhesocvxduiglbkrztnwjpfmaq";
		
		for (int i = 1; i <= T; i++)
		{
			String line = in.nextLine();
			
			String translation = "";
			
			for (int j = 0; j < line.length(); j++)
			{
				char character = line.charAt(j);
				
				if (character == ' ')
					translation += ' ';
				else
					translation += mapping.charAt(character - 'a');
			}
			
			System.out.format("Case #%d: %s\n", i, translation);
		}
	}
}
