package methodEmbedding.Standing_Ovation.S.LYD2175;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StandingOvation {

	static ArrayList<String> inp = new ArrayList<String>();

	public static void main(String[] args) {
		 	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File("input1.txt")));
			String s;
			
			while((s=br.readLine())!=null)
			{
				inp.add(s);
			}
		}
		catch(Exception e)
		{
			
		}
		
	//	int num = Integer.parseInt(inp.get(0));
		
		
		for (int i = 1; i < inp.size(); i++) {
			String s = inp.get(i);
			
			//int maxS = Character.getNumericValue(s.charAt(0));
			
			String sub = s.substring(2,s.length());
			
			int value = 0;
			int finalAns = 0;
			
			for (int j = 0; j < sub.length(); j++) {
				
				int n = Character.getNumericValue(sub.charAt(j));
				
				if(j!=0 && value<j)
				{
					finalAns++;// = finalAns++;
					value++;
				}
					
				value+=n;
			}
			System.out.println("Case #"+i+": "+finalAns);
			
		}

	}

}
