package methodEmbedding.Magic_Trick.S.LYD754;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//????????????????????????????????????????????OK
		//??????????????bad magician
		//0??????cheat
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		try
		{
			reader = new FileReader("/Users/yhirota/Desktop/A-small-attempt0.in");
			br = new BufferedReader(reader);
			
			writer = new FileWriter("/Users/yhirota/Desktop/out.txt");
			
			String line;
			int numCases = Integer.parseInt(br.readLine());
			for(int i=0; i<numCases; i++)
			{
				line = br.readLine();
				
				StringTokenizer st = new StringTokenizer(line);
				int firstAnswer = Integer.parseInt(st.nextToken());
				
				for(int row=0; row<firstAnswer; row++)
				{
					line = br.readLine();
				}
				
				Vector<Integer> firstNums = new Vector<Integer>();
				st = new StringTokenizer(line);
				for(int col=0; col<4; col++)
				{
					firstNums.add(Integer.parseInt(st.nextToken()));
				}
				for(int j=0; j<4-firstAnswer; j++)
				{
					line = br.readLine();
				}
				
				line = br.readLine();
				st = new StringTokenizer(line);
				int secondAnswer = Integer.parseInt(st.nextToken());
				
				for(int row=0; row<secondAnswer; row++)
				{
					line = br.readLine();
				}
				
				Vector<Integer> secondNums = new Vector<Integer>();
				st = new StringTokenizer(line);
				for(int col=0; col<4; col++)
				{
					secondNums.add(Integer.parseInt(st.nextToken()));
				}
				for(int j=0; j<4-secondAnswer; j++)
				{
					line = br.readLine();
				}
				
				int count = 0;
				int correctNum = 0;
				for(int j=0; j<4; j++)
				{
					if(secondNums.contains(firstNums.get(j)))
					{
						correctNum = firstNums.get(j);
						count++;
					}
				}

				writer.write("Case #" + (i+1) + ": ");
				if(count == 0)
				{
					writer.write("Volunteer cheated!");
				}
				else if(count == 1)
				{
					writer.write(Integer.toString(correctNum));
				}
				else
				{
					writer.write("Bad magician!");
				}
				writer.write("\n");
			}		
		}
		catch(Exception e)
		{
		}
		finally
		{
			try
			{
				if(reader != null)
				{
					reader.close();
					reader = null;
				}
				
				if(br != null)
				{
					br.close();
					br = null;
				}
				
				if(writer != null)
				{
					writer.close();
					writer = null;
				}
				
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
