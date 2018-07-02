package methodEmbedding.Magic_Trick.S.LYD1743;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] A =null;
		String[] B =null;
		int first_row=0;
		int second_row=0;
		int i=0,j=0,z=0;
		String Match=null,output=null;
		BufferedWriter writer = null;
		BufferedReader reader;
		reader=null;
		try {
			reader = new BufferedReader(new FileReader("C:/CustProgram/input_test.txt"));
			writer = new BufferedWriter(new FileWriter("C:/CustProgram/output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = null;
		line = reader.readLine();
		int No_Of_TCs=Integer.parseInt(line);
		for ( z=1;z<=No_Of_TCs;z++)
	    {
			first_row=Integer.parseInt(reader.readLine());
			for ( j=1;j<=4;j++)
			{
				if(j==first_row)
				{
					
					A=reader.readLine().split(" ");
				}else
				{
				reader.readLine();
				}
			}
			second_row=Integer.parseInt(reader.readLine());
			for ( j=1;j<=4;j++)
			{
				if(j==second_row)
				{
					B=reader.readLine().split(" ");
				}else
				{
				reader.readLine();
				}
			}
			int counter=0;
	    	for(i=0;i<4;i++)
	    	{
	    		for (j=0;j<4;j++)
	    		{
	    			if(A[i].equals(B[j]))
	    			{
	    				counter++;
	    				if(counter==1)
	    				{
	    					Match=A[i];
	    				}
	    			}
	    		}
	    	}
	    	
	    	if(counter==0)
	    	{
	    		System.out.println("Case #"+z+": Volunteer cheated!");
	    		output="Case #"+z+": Volunteer cheated!";
	    	}else if(counter==1)
	    	{
	    		System.out.println("Case #"+z+": "+Match);
	    		output="Case #"+z+": "+Match;
	    	}else
	    	{
	    		System.out.println("Case #"+z+": Bad magician!");
	    		output="Case #"+z+": Bad magician!";
	    	}
	    	 
	    	    try {
	    	        writer.write(output+"\n");
	    	    } catch (IOException e) {
	    	        System.err.println(e);
	    	    } finally {
	    	        if (writer != null) {
	    	            
	    	        }
	    	    }
	    	
	    	
	    }
		
		try {
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
}

}
