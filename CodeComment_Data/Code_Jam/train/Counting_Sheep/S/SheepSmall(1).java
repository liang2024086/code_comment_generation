package methodEmbedding.Counting_Sheep.S.LYD332;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SheepSmall {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\manju\\Downloads\\A-small-attempt0.in.txt");
	    File outFile = new File("C:\\Users\\manju\\Downloads\\A-small.out.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int t=1;t<=testCases;t++)
	    {
	        String line = br.readLine().trim();
	        Long num = Long.parseLong(line);
	        
	        if(num==0)
	        {
				bw.write("Case #" + t +": INSOMNIA");
	        }
	        else
	        {
				Long sum = 0L;
				
				Set<Integer> digArray = new HashSet<Integer>();
				
				
				List<Long> numList = new ArrayList<Long>();
				numList.add(num);
				
				while(digArray.size() < 10)
				{
					sum = sum + num;
					String numString = sum.toString();
					for(int i=0; i<numString.length(); i++)
					{
						digArray.add(Integer.parseInt(((Character)numString.charAt(i)).toString()));
						if(digArray.size() == 10)
						{
							break;
						}
					}
				}
				bw.write("Case #" + t +": "+sum);
	        }
	        
	        if(t !=testCases)
	        {
	        	bw.newLine();
	        }
		}
	    br.close();
	    bw.close();
	}
}
