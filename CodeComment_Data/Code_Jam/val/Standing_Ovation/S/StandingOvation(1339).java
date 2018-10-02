package methodEmbedding.Standing_Ovation.S.LYD522;

/**
 * 
 */

import java.io.*;

/**
 * @author M-Mahmoud
 *
 */
public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
	     // The name of the file to open.
	        String fileNameInput = "A-small-attempt0.in";
	        
	        String fileNameOutput = "output.txt";
	        
	        int T =0;
	        int S_max=0;
	        int  S_array[]=new int[1001];

	        // This will reference one line at a time
	        String SsLine[] ;
	        // This will reference one line at a time
	 //       String line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileNameInput);
	            
	            FileOutputStream outputStream =  new FileOutputStream(fileNameOutput);
	            
	           // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            T=Integer.parseInt(bufferedReader.readLine());
	            
	            for (int i=0 ; i< T; i++)
	            {
	            	int SAdditionalCount=0;
	            	int numOfClappers=0;
	            	
	            	String Currentline= (bufferedReader.readLine());
	            	SsLine=Currentline.split(" ");
	            	S_max=Integer.parseInt(SsLine[0]);
	            	
	            	
	            for (int j=0; j<=S_max; j++)
	            {
	            	S_array[j]=Character.getNumericValue(SsLine[1].charAt(j));
	            	
	            	
	            	
	            }
	            
	            for (int j=0; j<=S_max; j++)
	            {
	            	
	            	if(S_array[j]>0)
	            	{
	            		if (j<=numOfClappers)
	            		{
	            			numOfClappers+=S_array[j];
	            		}else
	            		{
	            			SAdditionalCount+=(j-numOfClappers);
	            			numOfClappers+=SAdditionalCount;
	            			numOfClappers+=S_array[j];
	            		}
	            	}
	            	

	            }
	           
	                
	                
	                
	            
	            String line_output= "Case #"+(i+1)+": "+SAdditionalCount+"\r\n";
	            outputStream.write(line_output.getBytes());
	            }
	            
//	            while((line = bufferedReader.readLine()) != null) {
//	                System.out.println(line);
//	            } 

	            // Always close files.
	            bufferedReader.close(); 
	            
	            // Always close files.
	            outputStream.close();
	            System.out.println("output reached successfully");
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Error Occured, Unable to open file '" + 
	                fileNameInput + "'");    
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileNameInput + "'");     
	            // Or we could just do this: 
	             ex.printStackTrace();
	        }

	}

}
