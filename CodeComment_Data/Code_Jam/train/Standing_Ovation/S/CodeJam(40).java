package methodEmbedding.Standing_Ovation.S.LYD679;

import java.io.*;
public class CodeJam {

	public static void main(String[] args) {
		// The name of the file to open.
        String fileName = "src/A-small-attempt1.in";
        String fileWriteName = "src/temp2.txt";
        // This will reference one line at a time
        String line = null;
        String total_tests = null;
        int sum = 0;
        int val;
        int number_to_be_added=0;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            FileWriter fileWriter =
                    new FileWriter(fileWriteName);

                // Always wrap FileWriter in BufferedWriter.
                BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            
           total_tests = bufferedReader.readLine();
           int num_total_tests = Integer.parseInt(total_tests);
           for(int i = 0;i<num_total_tests; i++) {
        	  number_to_be_added=0;
        	  line = bufferedReader.readLine();
        	  String[] parts = line.split(" ");
        	  int number_of_audience = Integer.parseInt(parts[0]);
        	  String sequence = parts[1];
        	  sum=0;
        	  for(int j=0;j<number_of_audience+1;j++) {
        		 val = Character.getNumericValue(sequence.charAt(j));
        		 if(j<=sum) {
        			 sum = sum+val;
        		 }
        		 else {
        			 number_to_be_added+=(j-sum);
        			 sum = val+j;
        		 }
        	  }
        	  
        	  bufferedWriter.write("Case #"+(i+1)+": "+number_to_be_added);
        	  bufferedWriter.newLine();
            }    
            // Always close files.
            bufferedReader.close();   
         // Always close files.
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		// TODO Auto-generated method stub
     // The name of the file to open.
        
	}

}
