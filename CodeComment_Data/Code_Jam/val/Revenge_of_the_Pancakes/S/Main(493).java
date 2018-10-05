package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1163;

//Zach Harris
//Code Jam
//Revenge of the Pancakes

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console_in	= new Scanner(System.in);
		
		boolean showPrompts = false;
		
		
		int T = 0; // Iterations
		int count = 0; // Number of flips required
		String stack = "";
		int marker = 0;
		boolean needFullFlip = false;
		
		if (showPrompts)
		{
			System.out.println("How many cases are there?");
		}
		
		T = console_in.nextInt();
		console_in.nextLine();
		
		
		for (int i = 0; i < T; i++)
		{
			count = 0;
			marker = 0;
			needFullFlip = false;
			//***********************INPUT***********************
			if (showPrompts)
			{
				System.out.println("Enter the string.");
			}
			
			stack = console_in.nextLine();
			
			
			//***********************MATH***********************
			while (true)
			{ // This will be really hard to read. "No more flips needed" is the exit
			
				StringBuilder sb = new StringBuilder(stack);
			
			
				//***Searcher*** (Looks for pancakes that must be flipped)
				//System.out.println("The current string is: " + sb);
				if (sb.indexOf("-") != -1)
				{ // Before we start ignoring the bottom we should make sure that at least 1 pancake is unhappy
					while (true)
					{ //This just removes all pancakes at the end that are already happy side up
						if ((sb.charAt(sb.length() - 1) == '+'))
						{
							sb.setLength(sb.length() - 1);
						}
						else
						{
							break;
						}
					}
				}
				else
				{ //No more flips needed
					break;
				}
				
				//If we haven't escaped the while loop, we need to flip!
				
				count++; // Add 1 to flip count and start flipping!
				
				//System.out.println("We're finally out and the new string is: " + sb);
			
				String temp = "";
			
				marker = sb.indexOf("-");
				if (marker != 0)
				{
					for (int k = 0; k < marker; k++)
					{
						temp += sb.charAt(k);
					}
				}
				else
				{
					marker = sb.indexOf("+");
					if (marker != -1)
					{
						for (int k = 0; k < marker; k++)
						{
							temp += sb.charAt(k);
						}
					}
					else
					{
						//This means there are only -'s in the string
						needFullFlip = true;
					}
				}
				StringBuilder target = new StringBuilder(temp); // Sets the target.
			
			
			
			
				//***Flipper***
				if(!needFullFlip)
				{
					target.reverse(); // Flips stack
					//System.out.println("Did we flip the string? " + target);
					for (int k = 0; k < target.length(); k++)
					{ //Flip the pancakes in stack
						if (target.charAt(k) == '+')
						{
							target.setCharAt(k, '-');
						}
						else if (target.charAt(k) == '-')
						{
							target.setCharAt(k, '+');
						}
					}
					//System.out.println("Flip complete: " + target);
			
					for (int l = 0; l < target.length(); l++)
					{
						sb.setCharAt(l, target.charAt(l));
					}
				
				}
				else
				{
					for(int m = 0; m < sb.length(); m++)
					{
						sb.setCharAt(m, '+');
					}
				}
			

				stack = sb.toString();
			
				//System.out.println("Even more final: " + stack);
			
			}
			//***********************OUTPUT***********************
			
			System.out.println("Case #" + (i + 1) + ": " + count);
		}
		
		console_in.close();
		
	}

	
}
