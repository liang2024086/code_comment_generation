package methodEmbedding.Counting_Sheep.S.LYD1486;

//Zach Harris
//Code Jam
//Store Credit

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console_in	= new Scanner(System.in);
		
		boolean showPrompts = false;
		
		
		//Brute force time
		int T = 0; // Iterations
		int N = 0;
		boolean found1 = false;
		boolean found2 = false;
		boolean found3 = false;
		boolean found4 = false;
		boolean found5 = false;
		boolean found6 = false;
		boolean found7 = false;
		boolean found8 = false;
		boolean found9 = false;
		boolean found0 = false;
		
		int sleep = 0; // The number we fell asleep at
		
		boolean panic = false;
		
		
		
		if(showPrompts)
		{
			System.out.println("How many cases are there?");
		}
		
		T = console_in.nextInt();
		
		for (int i = 0; i < T; i++)
		{
			//***********************RESET***********************
			found1 = false;
			found2 = false;
			found3 = false;
			found4 = false;
			found5 = false;
			found6 = false;
			found7 = false;
			found8 = false;
			found9 = false;
			found0 = false;
			//***********************INPUT***********************
			
			if (showPrompts)
			{
				System.out.println("Choose a number: ");
			}
			
			N = console_in.nextInt();
			
			
			//***********************MATH***********************
			
			for (int j = 1; j <= 100; j++)
			{
				//System.out.println(j * N);
				String strI = Integer.toString(j * N);
				
				for (int k = 0; k < strI.length(); k++)
				{
					//System.out.println("THIS IS A TEST " + strI.charAt(k));
					switch (strI.charAt(k)) 
					{
		            	case '1': found1 = true;
		                     	break;
		            	case '2': found2 = true;
		                     	break;
		            	case '3': found3 = true;
		                     	break;
		            	case '4': found4 = true;
		                     	break;
		            	case '5': found5 = true;
		                     	break;
		            	case '6': found6 = true;
		                     	break;
		            	case '7': found7 = true;
		                     	break;
		            	case '8': found8 = true;
		                     	break;
		            	case '9': found9 = true;
		                     	break;
		            	case '0':	found0 = true;
		                     	break;
		            	default: panic = true; //Something went wrong!
		                     	break;
					}
					
					if (panic == true)
					{
						//System.out.println("PANIC!");
					}
				}
				
				if ((found1 == true) && (found2 == true) && (found3 == true) && (found4 == true) && (found5 == true) && (found6 == true) && (found7 == true) && (found8 == true) && (found9 == true) && (found0 == true))
				{
					sleep = j * N; // The number we fell asleep at
					break;
				}
				else
				{
					sleep = 0; // We never fell asleep :(
				}
				
			}
			
			
			//***********************OUTPUT***********************
			
			if (sleep != 0)
			{
				System.out.println("Case #" + (i + 1) + ": " + sleep);
			}
			else
			{
				System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
			}
		}

		
		console_in.close();
		
	}

}
