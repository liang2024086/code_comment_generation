package methodEmbedding.Cookie_Clicker_Alpha.S.LYD117;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = "./src/question2_input.txt";
        String outputFilePath = "./src/question2_output.txt";
        String line = null;
        
        double x = 0.0;
        double c = 0.0;
        double f = 0.0;
        double r = 0.0;
        double totalTime=0.0;
       
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            File out = new File(outputFilePath);
            
            if(!out.exists()) {
            	out.createNewFile();
            }
            
            FileWriter fw = new FileWriter(out.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
            int counter 	= 0; 
            int iteration 	= 1;
            
            while((line = bufferedReader.readLine()) != null) {
            	if(counter!=0) {
            		String[] values = line.split(" ");
            		c = Double.parseDouble(values[0]);
            		f = Double.parseDouble(values[1]);
            		x = Double.parseDouble(values[2]);
            		r = 2.0;
            		totalTime=0.0;
            		while((x/r)>((c/r)+(x/(r+f)))) {
            			totalTime+=(c/r);
            			r= r+f;
            		}
            		
            		totalTime+=(x/r);
            		System.out.println("Case #"+iteration+": "+String.format( "%.7f", totalTime )+"\n");
                	bw.write("Case #"+iteration+": "+String.format( "%.7f", totalTime )+"\n");
            		iteration++;
            	}
            	counter++;
            }
            
            bw.close();
            fileReader.close();
            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) {
        	ex.printStackTrace();				
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

	}

}
