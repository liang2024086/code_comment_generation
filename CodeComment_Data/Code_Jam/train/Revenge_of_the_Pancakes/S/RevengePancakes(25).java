package methodEmbedding.Revenge_of_the_Pancakes.S.LYD684;

import java.io.*;
import java.util.*;

public class RevengePancakes{

	public static void main(String[] args){

		String inFileName = "B-small-attempt2.in";
		String outFileName = "revengePancakes.txt";
		String line = null;
        int nb_inputs = 1;

		try {

            FileReader fileReader = new FileReader(inFileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if((line = bufferedReader.readLine()) != null) {
                nb_inputs = Integer.parseInt(line);
            }
            int[] outputs = new int[nb_inputs];
            int line_nb = 1;
            while((line = bufferedReader.readLine()) != null && line_nb <= nb_inputs){
                char[] p = line.toCharArray();
                System.out.println(p);
                int nbFlips = 0;
                int ptr = 0;
                while(ptr < p.length-1){
                    // all pancakes to the right of our pointer must be on the same side
                    if(p[ptr] != p[ptr+1]){
                        nbFlips++;
                    }
                    ptr++;
                }
                // we've now reached the very bottom of our stack of pancakes, check if need to do one last flip
                if(p[ptr] == '-'){
                    nbFlips++;
                }
                System.out.println(nbFlips);
                outputs[line_nb-1] = nbFlips;
                line_nb++;
            } 
            // close file
            bufferedReader.close();


            FileWriter fileWriter = new FileWriter(outFileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i = 0 ; i < outputs.length ; i++){
                String output = String.valueOf(outputs[i]);
                bufferedWriter.write("Case #" + (i+1) + ": " + output);
                bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
         
        }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println( "Error reading file");                  
            // or : ex.printStackTrace();
        }
	}
}

