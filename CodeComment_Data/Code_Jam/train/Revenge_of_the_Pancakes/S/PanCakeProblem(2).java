package methodEmbedding.Revenge_of_the_Pancakes.S.LYD353;

import java.util.Scanner;


public class PanCakeProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number_of_test_cases=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=number_of_test_cases;t++)
		{
			String pancakes_string=sc.nextLine();
			int first_index=-1;
			int second_index=0;
			char pancakes[]=pancakes_string.toCharArray();
			int number_of_steps=0;
			for(int i=0;i<pancakes.length;i++)
			{
				String pattern="";
				if(first_index>0||pancakes[i]=='+')
				{
					pattern="+";
					for(int j=i;j<pancakes.length;j++)
					{
						if(pancakes[j]=='+')
						{
							first_index++;
						}
						else
						{
							break;
						}
					}
					if(first_index!=pancakes.length-1)
					{
						pattern+="-";
						for(int j=first_index+1;j<pancakes.length;j++)
						{
							if(pancakes[j]=='-')
							{
								second_index++;
							}
							else
							{
								break;
							}
						}
					}
				}
				else
				{
					pattern="-";
					for(int j=i;j<pancakes.length;j++)
					{
						if(pancakes[j]=='-')
						{
							first_index++;
						}
						else
						{
							break;
						}
					}
					if(first_index!=pancakes.length-1)
					{
						pattern+="+";
						for(int j=first_index+1;j<pancakes.length;j++)
						{
							if(pancakes[j]=='+')
							{
								second_index++;
							}
							else
							{
								break;
							}
						}
					}
				}
				if(pattern.equals("+"))
				{
					number_of_steps=number_of_steps+0;
					break;
				}
				else if(pattern.equals("-"))
				{
					number_of_steps=number_of_steps+1;
					break;
				}
				else if(pattern.equals("+-"))
				{
					number_of_steps=number_of_steps+2;
					first_index=first_index+second_index;
					second_index=0;
					i=first_index;
				}
				else if(pattern.equals("-+"))
				{
					number_of_steps=number_of_steps+1;
					first_index=first_index+second_index;
					second_index=0;
					i=first_index;
				}
			}
			System.out.println("Case #"+t+": "+number_of_steps);
		}
	}

}
