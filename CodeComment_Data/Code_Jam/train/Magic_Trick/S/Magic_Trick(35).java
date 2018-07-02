package methodEmbedding.Magic_Trick.S.LYD934;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Magic_Trick
{

	public static void main(String[] args)
	{
		try
        {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
            String line = br.readLine();
            int numTestCases = Integer.parseInt(line);
            for (int i = 0; i < numTestCases; ++i)
            {
            	Integer[][] input1 = new Integer[4][4];
            	line = br.readLine();
            	int answerQ1 = Integer.parseInt(line);;
            	for(int j = 0; j < 4; ++j)
            	{
            		String matrixLine = br.readLine();
            		String[] integers = matrixLine.split(" ");
            		for(int k = 0; k < 4; ++k)
                	{
            			input1[j][k] = Integer.parseInt(integers[k]);
                	}
            	}
                
            	Integer[][] input2 = new Integer[4][4];
            	line = br.readLine();
            	int answerQ2 = Integer.parseInt(line);;
            	for(int j = 0; j < 4; ++j)
            	{
            		String matrixLine = br.readLine();
            		String[] integers = matrixLine.split(" ");
            		for(int k = 0; k < 4; ++k)
                	{
            			input2[j][k] = Integer.parseInt(integers[k]);
                	}
            	}
            	Integer[] userSelectedRow1 = input1[answerQ1-1];
            	Integer[] userSelectedRow2 = input2[answerQ2-1];
                
                List<Integer> aList =  Arrays.asList(userSelectedRow1);
                List<Integer> bList =  new ArrayList<Integer>();
                for (Integer integer : userSelectedRow2)
				{
					if(aList.contains(integer))
					{
						bList.add(integer);
					}
				}
                if(bList.size() == 0)
                {
                	//System.out.println("Case #"+(i+1) +": Bad magician!");
                	writer.write("Case #"+(i+1) +": Volunteer cheated!"+"\n");
                	
                }
                else if(bList.size() == 1)
                {
                	//System.out.println("Case #"+(i+1) +": " + bList.get(0));
                	writer.write("Case #"+(i+1) +": " + bList.get(0) +"\n");
                }
                else
                {
                	//System.out.println("Case #"+(i+1) +": Volunteer cheated!");
                	writer.write("Case #"+(i+1) +": Bad magician!\n");
                }
                
            }
            br.close();
            writer.close();
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}

}
