package methodEmbedding.Counting_Sheep.S.LYD882;

import java.util.*;

public class Testing2 
{	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int T = keyboard.nextInt();
		int startNumber;
		int ind;
		int newNumber = 0;
		boolean[] sleepTable = new boolean[10];
		
	
		String mS ="";
		String mSI ="";
		boolean sleep = false;
		char x;
		for(int i=0; i<T; i++)
		{
			sleepTable[0] = false;
			sleepTable[1] = false;
			sleepTable[2] = false;
			sleepTable[3] = false;
			sleepTable[4] = false;
			sleepTable[5] = false;
			sleepTable[6] = false;
			sleepTable[7] = false;
			sleepTable[8] = false;
			sleepTable[9] = false;
			
			startNumber = keyboard.nextInt();
			sleep = false;
			int multiplier = 1;
			while(sleep==false)
			{
				//System.out.println(sleep);
				//System.out.println("Run number 1");
				//if(newNumber >2)
				//{
				//	sleep = true;
				//	break;
				//}
				if(startNumber == 0) // will never end
				{
					sleep = true;
					System.out.println("Case #" + (i+1) +": INSOMNIA");
				}
						// switch case, cast to string, cast back into int
				else
				{
					
					//System.out.println(1);
					
					newNumber = multiplier * startNumber;
					//System.out.println(newNumber);
					multiplier++;
					mS = Integer.toString(newNumber);
					//System.out.println(2);
					for(int j=0; j<mS.length();j++)
					{
					//	System.out.println(3);
						mSI = mS.substring(j, j+1);
						ind = Integer.parseInt(mSI);
					//	System.out.println(4);
					//	System.out.println(ind);
						switch(ind)
						{
							
							case 0:	sleepTable[0] = true;
									break;
							case 1:	sleepTable[1] = true;
									break;
							case 2:	sleepTable[2] = true;
									break;
							case 3:	sleepTable[3] = true;
									break;
							case 4:	sleepTable[4] = true;
									break;
							case 5:	sleepTable[5] = true;
									break;
							case 6:	sleepTable[6] = true;
									break;
							case 7:	sleepTable[7] = true;
									break;
							case 8:	sleepTable[8] = true;
									break;
							case 9:	sleepTable[9] = true;
							
						}
					}
					// check if all are true.
					//System.out.println(5);
				//	for(int k=0; k<10; k++)
				//	{
				//		System.out.println(sleepTable[k]);
				//	}
					
					if (sleepTable[0] == true & sleepTable[1] == true & 
						sleepTable[2] == true & sleepTable[3] == true &
					    sleepTable[4] == true  & sleepTable[5] == true & 
						sleepTable[6] == true & sleepTable[7] == true & 
						sleepTable[8] == true & sleepTable[9] == true)
					{
						// success
						//System.out.println(6);
						System.out.println("Case #" + (i+1) + ": " + newNumber);
						sleep = true;
					}
				}
				//System.out.println(sleep);
			}
			
		}
	}
}
