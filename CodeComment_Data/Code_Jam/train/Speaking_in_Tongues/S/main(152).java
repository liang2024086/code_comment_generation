package methodEmbedding.Speaking_in_Tongues.S.LYD517;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String mAlpha ="ynficwlbkuomxsevzpdrjgthaq";
		
		int t = sc.nextInt();
		sc.nextLine();
		String[] inputs = new String[t];
		String[] solutions = new String[t];
		
		for(int i = 0; i < t; i++)
		{
			inputs[i] = sc.nextLine();
		}
		
		for(int i = 0; i < t; i++)
		{
			for(int j = 0; j < inputs[i].length(); j++)
			{
				if(inputs[i].substring(j,j+1).equals(" ")) solutions[i] += " ";
				else
					{
						int index = mAlpha.indexOf(inputs[i].substring(j, j+1));
						
						if(index > -1)
							{	String append = alpha.substring(index,index+1);
								solutions[i] += append;
							}
						else System.out.println(inputs[i].substring(j,j+1));
					}
			}
//			for(int j = 0; j < 26; j++)
//			{
//				inputs[i] = inputs[i].replace(mAlpha.charAt(j), alpha.charAt(j));
//			}
		}
		
		for(int i = 0; i < t; i++)
		{
			System.out.println("Case #" + (i+1) + ": " + solutions[i].substring(4));
		}
	}

}
