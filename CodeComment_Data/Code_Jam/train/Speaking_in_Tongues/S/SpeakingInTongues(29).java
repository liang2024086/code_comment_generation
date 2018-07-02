package methodEmbedding.Speaking_in_Tongues.S.LYD1135;

import java.util.Scanner;


public class SpeakingInTongues {
	public static void main(String[] args) {
		String character, text[], text2[], input;
		char characterL, characterU;
		int caseNum = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Input\n");
		input = in.next();

		int error = 1;
		while (error != 0)
		{
			error = 0;
			for (int i = 0; i < input.length(); i++)
			{
				if(!Character.isDigit(input.charAt(i)))
				{
					error++;
				}

			}

			if (error > 0)
			{
				System.out.print("Invalid Input!\nPlease try again!\n");
				in = new Scanner(System.in);
				input = in.next();
			}
		}

		caseNum = Integer.parseInt(input);

		while (caseNum > 30 || caseNum < 1)
		{
			System.out.print("Please enter an integer between 1 and 30.");
			caseNum = in.nextInt();
		}

		text = new String[caseNum];
		text2 = new String[caseNum];
		in.nextLine();
		
		for (int i = 0; i <= caseNum-1; i++)
		{
			text[i] = in.nextLine();
		}

		System.out.print("---------------------------------------------------\n");
		System.out.print("Output\n");

		for (int i = 0; i < text.length; i++)
		{
			text2[i] = "";
			for (int j = 0; j < text[i].length(); j++)
			{
				character = "";
				characterL = text[i].toLowerCase().charAt(j);
				characterU = text[i].toUpperCase().charAt(j);

				switch (characterL)
				{
				case 'a' : character = "y";break;
				case 'b' : character = "h";break;
				case 'c' : character = "e";break;
				case 'd' : character = "s";break;
				case 'e' : character = "o";break;
				case 'f' : character = "c";break;
				case 'g' : character = "v";break;
				case 'h' : character = "x";break;
				case 'i' : character = "d";break;
				case 'j' : character = "u";break;
				case 'k' : character = "i";break;
				case 'l' : character = "g";break;
				case 'm' : character = "l";break;
				case 'n' : character = "b";break;
				case 'o' : character = "k";break;
				case 'p' : character = "r";break;
				case 'q' : character = "z";break;
				case 'r' : character = "t";break;
				case 's' : character = "n";break;
				case 't' : character = "w";break;
				case 'u' : character = "j";break;
				case 'v' : character = "p";break;
				case 'w' : character = "f";break;
				case 'x' : character = "m";break;
				case 'y' : character = "a";break;
				case 'z' : character = "q";break;			
				default : character += text[i].charAt(j);
				}

				if (text[i].charAt(j) == characterL)
				{
					text2[i] += character.toLowerCase();

				}
				else if(text[i].charAt(j) == characterU)
				{
					text2[i] += character.toUpperCase();
				}
				else text2[i] += character;
			}
			System.out.print("Case #");
			System.out.print(i+1);
			System.out.print(": " + text2[i] + "\n");
		}
	}
}
