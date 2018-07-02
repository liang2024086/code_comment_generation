package methodEmbedding.Revenge_of_the_Pancakes.S.LYD988;

import java.util.Scanner;

/*
 * Solution to Problem B. Revenge of the Pancakes
 */

public class JamB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T, countFlips;
		boolean done = false;
		T = Integer.valueOf(in.nextLine());
		for(int i=0;i<T;i++)
		{
			done = false;
			countFlips=0;
			String stack = in.nextLine();
			while(!done)
			{
				
				if(stack.indexOf('-')==-1)
				{
					System.out.println("Case #"+(i+1)+": "+countFlips);
					done = true;
					break;
				}
				if(stack.indexOf('+')==-1)
				{
					System.out.println("Case #"+(i+1)+": "+(countFlips+1));
					done = true;
					break;
				}
				int plusInd = stack.indexOf('+');
				int j = plusInd+1;
				if(j<stack.length())
				while(stack.charAt(j)=='+'){
					j++;
					if(j>=stack.length()) break;
				}
				if(j<stack.length())
					plusInd = j;
				int minuInd = (stack.substring(0,plusInd)).lastIndexOf('-');
				
				if(minuInd==-1)
				{
					String temp = stack.substring(0,plusInd+1);
					temp = temp.replaceAll("\\+",  "\\-");
					String rev = new StringBuilder(temp).reverse().toString();
					stack = rev + stack.substring(plusInd+1, stack.length());
					countFlips++;
				}
				else
				{
					//flip all till minuInd
					String temp = stack.substring(0,minuInd+1);
					temp = temp.replaceAll("\\+", "\\=");
					temp = temp.replaceAll("\\-", "\\+");
					temp = temp.replaceAll("\\=", "\\-");
					String rev = new StringBuilder(temp).reverse().toString();
					stack = rev + stack.substring(minuInd+1, stack.length());
					countFlips++;
				}
			}
		}
		in.close();
	}
}
