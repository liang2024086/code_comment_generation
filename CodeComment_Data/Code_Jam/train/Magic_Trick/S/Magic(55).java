package methodEmbedding.Magic_Trick.S.LYD2036;

import java.io.*;


public class Magic {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
		
	    int test_no = Integer.parseInt(br.readLine());
	    
	    BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));	
	    
	    for(int i = 1; i <= test_no; i++)
	    {
	    	int row_in_one = Integer.parseInt(br.readLine());
	    	String[] row_one_str = new String[4];
	    	String[] row_two_str = new String[4];;
	    	for (int j = 1; j<= 4; j++)
	    	{	    		
	    		if (j == row_in_one)
	    		{
	    			row_one_str = br.readLine().split(" ");
	    		}
	    		else
	    			br.readLine();
	    	}
	    	int row_in_two = Integer.parseInt(br.readLine());
	    	for (int j = 1; j<= 4; j++)
	    	{
	    		if (j == row_in_two)
	    		{
	    			row_two_str = br.readLine().split(" ");
	    		}
	    		else
	    			br.readLine();
	    	}
	    	
	    	int count = 0;
	    	String answer = null;
	    	for (String data:row_one_str)
	    	{
	    		for (String compare:row_two_str)
	    		{
	    			if(data.equals(compare))
	    			{
	    				answer = data;
	    				count ++;
	    				break;
	    			}
	    		}
	    		if (count > 1) break;
	    	}
	    	if (count == 0) answer = "Volunteer cheated!";
	    	else if (count > 1) answer = "Bad magician!";
	    	
	    	System.out.println(answer);
	       
	    	out.write("Case #");
	    	out.write(String.valueOf(i));
	    	out.write(": ");
	    	out.write(answer);
	    	out.write("\n");
	    }
		out.close();
		br.close();		
	}

}
