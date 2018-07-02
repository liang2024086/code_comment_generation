package methodEmbedding.Counting_Sheep.S.LYD929;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CountingSheep {
	public static void main(String[] args){
		// The name of the file to open.
        String fileName = "/media/brandon/My Passport/Linux/development/java/CodeJam2016/src/sheepin.txt";

        // This will reference one line at a time
        String line = null;
        
        ArrayList<String> answers = new ArrayList<String>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            int tests = Integer.parseInt(line = bufferedReader.readLine());
            int t_idx = 1;
            while((line = bufferedReader.readLine()) != null) {
            	int[] numbers = new int[10];
            	//System.err.println("line : "+line);
            	boolean seenAllTen = true;
            	int multiplier = 0;
            	
            	if(line.equals("0")){
                    answers.add("CASE #"+t_idx+": INSOMNIA");
                    t_idx++;
            		continue;
            	}
            	
            	String start_val = line;
            	do{
            		multiplier++;
                	seenAllTen = true;

	            	for(int i=0; i<start_val.length(); i++){
	            		int val = Character.getNumericValue(start_val.charAt(i));
	            		numbers[val] = 1;
	            	}
	            	
	            	for(int i=0; i<numbers.length; i++){
	            		//System.err.println(i+" : " +numbers[i]);
	            		if(numbers[i] == 0){
	            			seenAllTen=false;
	            		}
	            	}
	            	
	            	if(!seenAllTen){
	            		int curr_val = Integer.parseInt(line);
	            		curr_val *= multiplier; 
	            		//System.err.println("line  : " + curr_val);
	            		start_val = Integer.toString(curr_val);
	            	}
	            	
            	}while(!seenAllTen);
            	
                answers.add("CASE #"+t_idx+": "+start_val);
                t_idx++;
            }   

            
            FileWriter fw;
            try {
                fw = new FileWriter(new File("/media/brandon/My Passport/Linux/development/java/CodeJam2016/src/sheepout.txt"));
                for(String answer : answers){
                	fw.write(answer);
                    fw.write(System.lineSeparator()); //new line
                }
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // Always close files.
            bufferedReader.close();         
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
	}
}
