package methodEmbedding.Standing_Ovation.S.LYD2001;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Challenge1 {

	public static void main(String[] args) {
		
		ArrayList<String> inp = new ArrayList<String>();	

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

	int testcaseNo = Integer.parseInt(inp.get(0));	
	//System.out.println(testcaseNo);
for (int i = 1; i < inp.size(); i++) {
			String s = inp.get(i);
			
			int n = Character.getNumericValue(s.charAt(0));
			int count = 0;
			int finalAns = 0;
			for(int j = 0; j <= n; j++)
			{
				if(count < j)
				{
					finalAns++;
					count++;
				}
				count = count + Character.getNumericValue(s.charAt(j+2));
			}
			System.out.println("Case #"+i+": "+finalAns);
//do stuff here
}
		// TODO Auto-generated method stub
	}
	

}
