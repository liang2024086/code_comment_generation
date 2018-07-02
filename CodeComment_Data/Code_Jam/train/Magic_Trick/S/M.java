package methodEmbedding.Magic_Trick.S.LYD534;

import java.util.*;
import java.io.*;


public class M 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("test"));
		PrintWriter out = new PrintWriter("a.txt");
		
		int a = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < a; i++)
		{
			int row1 = Integer.parseInt(sc.nextLine()) - 1;
			
			ArrayList<ArrayList<Integer>> cards1 = new ArrayList<>(); 
			ArrayList<ArrayList<Integer>> cards2 = new ArrayList<>();
			
			for (int j = 0; j < 4; j++)
			{
				String[] s = sc.nextLine().trim().split(" ");
				ArrayList<Integer> temp = new ArrayList<>();
				
				for (int k = 0; k < s.length; k++)
				{
					
					temp.add(Integer.parseInt(s[k]));
				}
				
				cards1.add(temp);
			}
			
			int row2 = Integer.parseInt(sc.nextLine()) - 1;
			
			for (int j = 0; j < 4; j++)
			{
				String[] s = sc.nextLine().trim().split(" ");
				
				ArrayList<Integer> temp = new ArrayList<>();
				for (int k = 0; k < s.length; k++)
				{
					temp.add(Integer.parseInt(s[k]));
				}
				
				cards2.add(temp);
			}

			out.printf("Case #%d: ", i + 1);
			
			cards1.get(row1).retainAll(cards2.get(row2));
			
			if (cards1.get(row1).size() > 1)
			{
				out.println("Bad magician!");
			}
			else if (cards1.get(row1).size() < 1)
			{
				out.println("Volunteer cheated!");
			}
			else
			{
				out.println(cards1.get(row1).get(0));
			}
			
			out.flush();
		}
	}
}
