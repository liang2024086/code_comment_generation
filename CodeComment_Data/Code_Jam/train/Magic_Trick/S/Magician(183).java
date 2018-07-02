package methodEmbedding.Magic_Trick.S.LYD432;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Magician {
    public static void main(String[] args) {
        //System.out.println("Hello, World");
    	int D=4;
    	int n_case, n_match, the_number=0;
        
        int[] old_Grid = new int[D];
        int[] new_Grid = new int[D];
        int i=0, j, k, old_row, new_row;
        
        String[] tokens = null;
        String delims = " ";
        
        BufferedReader reader = null;
        PrintWriter pw=null;
        
		try {
	        File file = new File("input1.txt");
            reader = new BufferedReader(new FileReader(file));

            File file_out = new File("output1.txt");
		    FileWriter fw = new FileWriter(file_out, false);
			pw = new PrintWriter(fw);
		     
            String text = null;
            text = reader.readLine();
            n_case = Integer.parseInt(text);
            
            while ( i++ < n_case )
            {
            	text = reader.readLine();
            	old_row = Integer.parseInt(text);
            	
            	for (j=0; j<old_row; j++)
            		text = reader.readLine();
            	tokens = text.split(delims);
            	for (j = 0; j < tokens.length; j++)
            	{
            		old_Grid[j]=Integer.parseInt(tokens[j]);
            	}
            	for (j=old_row; j<D; j++)
            		text = reader.readLine();

            	//new matrix
            	text = reader.readLine();
            	new_row = Integer.parseInt(text);
            	
            	for (j=0; j<new_row; j++)
            		text = reader.readLine();
            	tokens = text.split(delims);
            	for (j = 0; j < tokens.length; j++)
            	{
            		new_Grid[j]=Integer.parseInt(tokens[j]);
            	}
            	for (j=new_row; j<D; j++)
            		text = reader.readLine();

            	n_match=0;
            	for (j=0; j<D; j++)
            		for (k=0; k<D; k++)
            			if (old_Grid[j]==new_Grid[k])
            			{
            				the_number=old_Grid[j];
            				n_match++;
            			}
            	
            	pw.print("Case #"+i+": ");
            	if (n_match==0)
            		pw.println("Volunteer cheated!");
           		else if (n_match==1)
           			pw.println(the_number);
           		else
           			pw.println("Bad magician!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }        

		try {
		            if (reader != null)
		                reader.close();
		  			if (pw != null)
		  		        pw.close();
		} catch (IOException e1) { e1.printStackTrace(); };
    }
}
