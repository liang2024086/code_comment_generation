package methodEmbedding.Counting_Sheep.S.LYD418;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem1 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = null;
		try {
			sc = new Scanner(new BufferedReader(new FileReader("A-small-attempt2.in")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int testcase = sc.nextInt();
		int[] testArray = new int[100];
		for(int p=0;p<testcase;p++)
		{
			testArray[p]=sc.nextInt();
		}

		if (testcase >= 1 && testcase <= 100) 
		{
			
		for (int i = 0; i < testcase; i++) 
			{
				int present_number = testArray[i];
				int org = present_number;
				int case_number = present_number;
				int k = 1,w=0;
				ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0,
						1, 2, 3, 4, 5, 6, 7, 8, 9));
				
				if(present_number==0)
				{
					System.out.println("Case #"+(i+1)+": INSOMNIA");
				}
				
				
				while ( present_number > 0 && w==0) 
				{
					
				
					case_number = present_number;
					
					
						 
						while(case_number>0)
						{
							
						int unit_place = case_number % 10;
						boolean contains = numbers.contains(unit_place);
						

						if (contains) 
						{
							int h=numbers.indexOf(unit_place);
						
							numbers.remove(h);
							numbers.trimToSize();
     						if (!numbers.isEmpty()) 
							{
								case_number = case_number / 10;
								continue;
							}
							else
							{
								
								System.out.println("Case #"+(i+1)+": "+present_number);
								w=1;
								
								break;
							}
						} 
						else 
						{
							case_number = case_number / 10;
							continue;
						}
						
					} 

				
					
				
					k++;
					present_number =org* k;
					
				} 
			

		}
			
		}
	}

//	private static int checkEmpty(int present_number) {
//		// TODO Auto-generated method stub
//		if (numbers.isEmpty()) {
//			return 1;
//		}
//		return 0;
//	}

}
