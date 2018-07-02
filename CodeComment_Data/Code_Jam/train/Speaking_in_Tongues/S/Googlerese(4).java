package methodEmbedding.Speaking_in_Tongues.S.LYD54;

import java.util.Scanner;


public class Googlerese {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		int count;
		for (count = 0; count < lines; count++) {
			String inputLine = sc.nextLine();
			String input[] = inputLine.split(" ");
			int counter=0;
			String temp="";
			while(counter<input.length)
			{
			String word=input[counter];
			for(int p=0;p<word.length();p++)
			{
				if(word.charAt(p)=='a')
				{
					temp = temp + "y";
				}
				else if(word.charAt(p)=='b')
				{
					temp = temp + "h";
				}else if(word.charAt(p)=='c')
				{
					temp = temp + "e";
				}else if(word.charAt(p)=='d')
				{
					temp = temp + "s";
				}else if(word.charAt(p)=='e')
				{
					temp = temp + "o";
				}else if(word.charAt(p)=='f')
				{
					temp = temp + "c";
				}else if(word.charAt(p)=='g')
				{
					temp = temp + "v";
				}else if(word.charAt(p)=='h')
				{
					temp = temp + "x";
				}else if(word.charAt(p)=='i')
				{
					temp = temp + "d";
				}else if(word.charAt(p)=='j')
				{
					temp = temp + "u";
				}else if(word.charAt(p)=='k')
				{
					temp = temp + "i";
				}else if(word.charAt(p)=='l')
				{
					temp = temp + "g";
				}else if(word.charAt(p)=='m')
				{
					temp = temp + "l";
				}else if(word.charAt(p)=='n')
				{
					temp = temp + "b";
				}else if(word.charAt(p)=='o')
				{
					temp = temp + "k";
				}else if(word.charAt(p)=='p')
				{
					temp = temp + "r";
				}else if(word.charAt(p)=='q')
				{
					temp = temp + "z";
				}else if(word.charAt(p)=='r')
				{
					temp = temp + "t";
				}else if(word.charAt(p)=='s')
				{
					temp = temp + "n";
				}else if(word.charAt(p)=='t')
				{
					temp = temp + "w";
				}else if(word.charAt(p)=='u')
				{
					temp = temp + "j";
				}else if(word.charAt(p)=='v')
				{
					temp = temp + "p";
				}
				else if(word.charAt(p)=='w')
				{
					temp = temp + "f";
				}else if(word.charAt(p)=='x')
				{
					temp = temp + "m";
				}else if(word.charAt(p)=='y')
				{
					temp = temp + "a";
				}else if(word.charAt(p)=='z')
				{
					temp = temp + "q";
				}
			}
			counter++;

			if(count!=lines){
				temp=temp+" ";
			}
			}
			System.out.println("Case #" + (count + 1) + ": " + (temp));
		}

	}
}
